from bs4 import BeautifulSoup  # type: ignore
from playwright.sync_api import sync_playwright

with sync_playwright() as p:
    browser = p.firefox.launch()

    page = browser.new_page()

    page.goto("https://www.crunchyroll.com/videos/anime")
    soup = BeautifulSoup(page.inner_html(selector="body"), features="lxml")
    browser.close()
    animes = []
    for index, element in enumerate(soup.find(id="main_content").ul.find_all('li')):
        anime = {}
        spans = element.div.find_all('span')
        anime['img'] = spans[0].img['src']
        anime['name'] = spans[1].text.strip()
        anime['videos'] = spans[2].text.strip().split()[0]
        anime['ranking'] = index
        animes.append(anime)
    from pprint import pprint
    pprint(animes)
