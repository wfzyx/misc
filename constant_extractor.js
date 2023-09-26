import { readdirSync, statSync, readFileSync, writeFileSync } from "fs";
import { join, extname } from "path";
import { load } from "cheerio";

// Function to recursively read files in a directory
function readFilesRecursively(dir, fileCallback) {
  const files = readdirSync(dir);
  for (const file of files) {
    const filePath = join(dir, file);
    const stats = statSync(filePath);
    if (stats.isDirectory()) {
      readFilesRecursively(filePath, fileCallback);
    } else {
      fileCallback(filePath);
    }
  }
}

// Function to extract text from HTML or JSX files
function extractTextFromFile(filePath, results) {
  const fileContent = readFileSync(filePath, "utf-8");
  const extension = extname(filePath).toLowerCase();
  if ([".html", ".jsx", ".tsx"].includes(extension)) {
    const $ = load(fileContent);
    const validElements = $("*");
    validElements.each(function () {
      for (let index = 0; index < this.children.length; index++) {
        const element = this.children[index];
        if (element.type !== "text") continue;

        const text = element.data.trim();
        if (text.length > 0) {
          const indexCutoff = fileContent.indexOf(text);
          const lineStart = fileContent.lastIndexOf("\n", indexCutoff);
          const line = fileContent.substring(0, indexCutoff).split("\n").length;
          const columnStart = fileContent.indexOf(text) - lineStart;
          const columnEnd = columnStart + text.length;
          results[filePath] = results[filePath] || [];
          results[filePath].push({
            line,
            start: columnStart,
            end: columnEnd,
            text,
          });
        }
      }
    });
  }
}

// Main function
function main() {
  const directoryPath = ""; // Replace with your directory path
  const results = {};

  readFilesRecursively(directoryPath, (filePath) => {
    extractTextFromFile(filePath, results);
  });

  // Write the results to a JSON file
  const outputFileName = "text_extraction.json";
  writeFileSync(outputFileName, JSON.stringify(results, null, 2), "utf-8");
  console.log(`Text extraction completed. Results saved to ${outputFileName}`);
}

main();
