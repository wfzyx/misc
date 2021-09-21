#!/usr/bin/python3

from pprint import pprint
import bs4
import requests
import re

def clear_special_chars(s):
    return s.replace('\n', '')

def check_for_text_in_tag(text, tag):
    if type(tag) is bs4.element.Tag \
    and len([x for x in div['class'] if text in x ]) > 0:
        return True
    else:
        return False

def generate_dict_vaga_infojobs(link):
    soup = bs4.BeautifulSoup(requests.get(link).text, features='html.parser')
    job = {}
    job['title'] = soup.find('span', id=re.compile(r'litVacancyTitle')).text
    job['company'] = soup.find('span', id=re.compile(r'litCompany')).text
    job['workshift'] = soup.find('span', id=re.compile(r'litWorkingHours')).text
    job['salary'] = soup.find('span', id=re.compile(r'litSalary')).text
    job['location'] = soup.find('span', id=re.compile(r'litLocation')).text
    job['link'] = link
    pprint(job)


if __name__ == '__main__':
    r = requests.get('https://www.infojobs.com.br/empregos.aspx?Provincia=64')
    soup = bs4.BeautifulSoup(r.text, features="html.parser")

    listLinks = [a['href'] for a in soup.find_all('a', class_='vagaTitle')]

    for link in listLinks:
        auxSoup = bs4.BeautifulSoup(requests.get(link).text, features='html.parser')
        generate_dict_vaga_infojobs(link)
