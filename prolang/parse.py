#!/usr/bin/python3

from enum import Enum, unique, auto

@unique
class FSM(Enum):
    START = auto()
    DIGIT = auto()
    BINOP = auto()
    DEAD = auto()


class TokenFilters:
    DIGIT = '1234567890'
    BINOP = '+-*/'

class TokenType:
    I32  = 'Kraft.i32'
    PLUS = 'Kraft.add'


class Token:
    def __init__(self, token_type, value):
        self.token_type = token_type
        self.value = value
    def __repr__(self):
        return f'<{self.token_type}:{self.value}>' if self.value else '<{self.token_type}>'


class Parser:
    def __init__(self, code):
        self.token_list = []
        self.parsed = 0
        self.code = code
        self.current_char = None
        self.walk_char()
        self.aux = ''
    def walk_char(self):
        self.parsed += 1
        self.current_char =  self.code[self.parsed - 1]
    def make_token(self):
        while not current_char.isspace():
            if current_char in TokenFilters.BINOP:
                self.push_token(TokenType.BINOP, current_char)
            elif current_char.isdigit():
                self.push(TokenType.DIGIT, aux)
            else:
                pass
            self.walk_char()

    def push(self, tt, val):
        self.token_list.append(Token(tt, val))
        self.aux = ''
    def update_state(self, e):
        if e.isdigit():
            self.state = FSM.DIGIT
        else:
            self.state = FSM.BINOP

def parse_line(line):
    psr = Parser()
    parsed = 0
    for e in line:
        if e.isspace():
            continue
        parsed += 1
        while parsed > psr.parsed:
            if psr.state == FSM.START:
                psr.update_state(e)
            elif psr.state == FSM.DIGIT:
                if e.isdigit():
                    psr.push_char(e)
                else:
                    psr.flush_token()
                    psr.update_state(e)
            elif psr.state == FSM.BINOP:
                if e in '+':
                    psr.push_char(e)
                else:
                    psr.flush_token()
                    psr.update_state(e)
            else:
                return ["DEAD"]

    psr.flush_token()
    return psr.token_list

while True:
    aux = input('|> ')
    if(aux == 'quit()'):
        break
    elif(aux != ''):
        print(parse_line(aux))
