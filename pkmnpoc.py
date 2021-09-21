#!/usr/bin/python3

import math
import random
import pokebase as pb
import re
import os
from getpass import getpass

clear = lambda: os.system('clear')

class pcolor:
    Red = '\033[91m'
    Green = '\033[92m'
    Blue = '\033[94m'
    Cyan = '\033[96m'
    White = '\033[97m'
    Yellow = '\033[93m'
    Magenta = '\033[95m'
    Grey = '\033[90m'
    Black = '\033[90m'
    Default = '\033[99m'
    ENDC = '\033[0m'
    BOLD = '\033[1m'
    UNDERLINE = '\033[4m'

pkmn_list = []

def start_game_state():
    for i in range(2):
        pkmn_list.append({})
        p = pb.pokemon(random.randint(1, 151))
        pkmn_list[i]['id'] = p.id
        pkmn_list[i]['name'] = p.name
        pkmn_list[i]['stats'] = {x.stat.name:(5+(x.base_stat*2)) for x in p.stats}
        pkmn_list[i]['hp'] = 110 + (p.stats[0].base_stat * 2)
        pkmn_list[i]['stats']['hp'] = pkmn_list[i]['hp']
        pkmn_list[i]['moveset'] = []
        randList = []
        while len(randList) < 4:
            auxRand = random.randint(0, len(p.moves)-1)
            if auxRand not in randList:
                randList.append(auxRand)

        for index in randList:
            m = pb.move(p.moves[index].move.name)
            move = {}
            #move['acc'] = m.accuracy
            #move['dmg_class'] = m.damage_class.name
            move['name'] = m.names[7].name
            move['power'] = m.power
            pkmn_list[i]['moveset'].append(move)
            #pkmn_list[i]['moveset'].append(p.moves[j].move.name)


def set_print_color(c):
    print(c, end='')

def reset_print():
    print(pcolor.ENDC, end='')

def printl(s):
    print('', '{0: ^32}'.format(s), '')

def get_hp_percent(pkmn):
    return pkmn['hp']/pkmn['stats']['hp']

def print_hp(pkmn):
    pc = get_hp_percent(pkmn)
    color = pcolor.Green
    if pc < 0.2:
        color = pcolor.Red
    elif pc < 0.5:
        color = pcolor.Yellow

    bz = math.floor(27*pc)
    hp_bar = ''.join([
        'HP:',
        color,
        '█' * bz,
        ' ' * (27-bz),
        pcolor.ENDC
        ])
    printl(hp_bar)
    printl('{} / {}'.format(pkmn['hp'], pkmn['stats']['hp']))

def print_pkmn_box(pkmn):
    set_print_color(pcolor.Blue)
    printl('='*30)
    printl(' '.join([pkmn['name'].upper(), 'L: 100']))
    print_hp(pkmn)
    set_print_color(pcolor.Blue)
    printl('='*30)
    for move in pkmn['moveset']:
        printl('{} - {}'.format(move['name'], move['power']))
    printl('='*30)
    reset_print()


def print_game_state():
    for pkmn in pkmn_list:
        print_pkmn_box(pkmn)
        print()
        #print(pkmn['stats'])

def calc_dmg(p1, mov, p2):
    l = 100
    p = p1['moveset'][mov]['power']
    if p1['moveset'][mov]['class']:
        a = p1['stats']['attack']
        d = p2['stats']['defense']
    else:
        a = p1['stats']['special-attack']
        d = p2['stats']['special-defense']
    m=1
    return ((((2*l/5)+2)*p*a/d/50)+2)*m


def update():
    print()
    getpass(prompt='')

if __name__ == '__main__':
    start_game_state()
    is_game_running = True
    while is_game_running:
        clear()
        print_game_state()
        update()
