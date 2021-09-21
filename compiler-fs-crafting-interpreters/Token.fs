module Token
open System

type TokenType = 
    // Single-character tokens
    | LEFT_PAREN | RIGHT_PAREN | LEFT_BRACE | RIGHT_BRACE
    | COMMA | DOT | MINUS | PLUS | SEMICOLON | SLASH | STAR
    // One or two character tokens
    | BANG | BANG_EQUAL | EQUAL | EQUAL_EQUAL | GREATER
    | GREATER_EQUAL | LESS | LESS_EQUAL
    // Literals
    | IDENTIFIER | STRING | NUMBER
    // Keywords
    | AND | CLASS | ELSE | FALSE | FUN | FOR | IF
    | NIL | OR | PRINT | RETURN | SUPER | THIS
    | TRUE | VAR | WHILE
    // Duh
    | EOF

type Token = {
    tokenType:TokenType;
    lexeme:String;
    literal:Object;
    line:int;
}

let ToString (token):string =
    String.Format("<{0}> : \"{1}\" \"{2}\"", token.tokenType, token.lexeme, token.literal)