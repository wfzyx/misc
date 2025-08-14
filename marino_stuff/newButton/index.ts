import { $ } from "bun";
import * as cheerio from "cheerio";

const TARGET_TITLE = "Mega Man Maker";

const sleep = (ms) => new Promise((r) => setTimeout(r, ms));
const isWin = process.platform === "win32";
const isLinux = process.platform === "linux";

async function getLevelId() {
	const url = `https://megamaker.webmeka.io/stream-nextLevelToBeat.php?USEID=160646`;
	const res = await fetch(url);
	if (!res.ok) throw new Error(`HTTP ${res.status}`);
	const html = await res.text();

	const $ = cheerio.load(html);
	const a = $("td.tc a[href]").first();
	if (!a || a.length === 0) return null;
	const href = a.attr("href") ?? "";
	const part = href.split(":").pop() ?? "";
	const id = part.slice(2);
	return id || null;
}

async function focusGameWindow() {
	const platform = process.platform;

	log(`Trying to focus on platform: ${platform}`);
	if (platform === "linux") {
		console.log(`Running on ${platform}`);
		try {
			const result =
				await $`xdotool search --name ${TARGET_TITLE} windowactivate --sync`;
			return result;
		} catch (err) {
			console.error("xdotool failed (Wayland?):", err.message);
			return false;
		}
	}

	if (platform === "win32") {
		console.log(`Running on ${platform}`);
		try {
			const result =
				await $`powershell -NoProfile -Command "\$ws = New-Object -ComObject WScript.Shell; \$ws.AppActivate('${TARGET_TITLE}')"`;
			return result;
		} catch (err) {
			console.error("PowerShell AppActivate failed:", err.message);
			return false;
		}
	}
	return false;
}

/* ---------- platform-specific typing ---------- */
async function winSendKeys(seq) {
	// seq example: "{RIGHT}" or a literal string "abc"
	await $`powershell -NoProfile -Command "\$ws = New-Object -ComObject WScript.Shell; \$ws.SendKeys('${seq}')"`;
}

async function linuxKey(key) {
	// xdotool key names: Right, Up, Return, BackSpace
	await $`xdotool key ${key}`;
	await sleep(10);
}

async function linuxType(text) {
	await $`xdotool type --delay 100 ${text}`;
	await sleep(10);
}

/* ---------- unified helpers you call below ---------- */

async function tap(key) {
	if (isWin) {
		// map to SendKeys token
		const tokenMap = {
			right: "{RIGHT}",
			up: "{UP}",
			enter: "{ENTER}",
			backspace: "{BACKSPACE}",
		};
		const tk = tokenMap[key.toLowerCase()];
		if (!tk) throw new Error(`Unsupported key: ${key}`);
		await winSendKeys(tk);
	} else if (isLinux) {
		const tokenMap = {
			right: "Right",
			up: "Up",
			enter: "Return",
			backspace: "BackSpace",
		};
		const tk = tokenMap[key.toLowerCase()];
		if (!tk) throw new Error(`Unsupported key: ${key}`);
		await linuxKey(tk);
	} else {
		throw new Error("tap(): unsupported platform");
	}
}

async function typeText(text) {
	if (isWin) {
		for (const ch of text) {
			await winSendKeys(ch);
			await sleep(1);
		}
	} else if (isLinux) {
		await linuxType(text);
	} else {
		throw new Error("typeText(): unsupported platform");
	}
}

/* ---------- main ---------- */

async function main() {
	const lockPath = "lock.db";
	const lockFile = Bun.file(lockPath);
	if (await lockFile.exists()) return;
	await Bun.write(lockFile, " ");

	try {
		await sleep(1000);
		const focused = await focusGameWindow();
		if (!focused) return;

		const req = getLevelId();

		log("Window focused - starting automation");

		log("Going to the lvl id box");
		await typeText("x");
		await sleep(400);
		await tap("right");
		await sleep(400);
		await tap("up");
		await sleep(50);
		await tap("right");
		await sleep(50);
		await tap("right");
		await sleep(50);
		await tap("enter");
		await sleep(50);

		log("Clearing previous ID");
		for (let i = 0; i < 7; i++) await tap("backspace");

		const lvlId = await req;
		log(`Got next ID: ${lvlId} - typing it`);
		if (!lvlId) return;

		await typeText(lvlId);
		await tap("enter");

		log("we should be good by now");
	} catch (err) {
		console.error(err);
	} finally {
		try {
			await lockFile.delete();
		} catch {}
	}
}

/* ---------- tiny logger using Bun.file ---------- */

const file = Bun.file("log.txt");
const writer = file.writer();

function log(msg) {
	console.log(msg);
	writer.write(msg);
	writer.write("\n");
}

log("Hi mawino - now you see me? cool");
await main();
writer.end();
