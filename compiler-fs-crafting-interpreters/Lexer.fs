module Lexer
open Failer
open Token
open System

let mutable start = 0
let mutable current = 0
let mutable line = 1
let mutable tokens = []

let isAtEnd (text:string) =
    current >= text.Length

let matchChar text expected = 
    if isAtEnd text || text.[current] <> expected then
        false
    else
        current <- current + 1
        true

let advance (text:string) = 
    current <- current + 1
    text.[current - 1]

let addToken tokenType lexeme literal = 
    tokens <- List.append tokens [{tokenType=tokenType; lexeme=lexeme; literal=literal; line=line}]

let addNonLiteralToken (tokenType, text:string):unit = 
    let size =
        match tokenType with
        | BANG_EQUAL | EQUAL_EQUAL | LESS_EQUAL | GREATER_EQUAL -> 2
        | _ -> 1
    addToken tokenType (text.Substring(current - size, size)) null


let peek text = if isAtEnd text then '\u0000' else text.[current]

let peekComment text =
    printfn "AAAAAAAAAAAAAAA"
    while peek text <> '\n' && not (isAtEnd text) do
        advance text |> ignore

let scanOneToken (text:string) =
    let c = advance text
    match c with
    | '(' -> addNonLiteralToken(LEFT_PAREN, text)
    | ')' -> addNonLiteralToken(RIGHT_PAREN, text)
    | '{' -> addNonLiteralToken(LEFT_BRACE, text)
    | '}' -> addNonLiteralToken(RIGHT_BRACE, text)
    | ',' -> addNonLiteralToken(COMMA, text)
    | '.' -> addNonLiteralToken(DOT, text)
    | '-' -> addNonLiteralToken(MINUS, text)
    | '+' -> addNonLiteralToken(PLUS, text)
    | ';' -> addNonLiteralToken(SEMICOLON, text)
    | '*' -> addNonLiteralToken(STAR, text)
    | '!' -> addNonLiteralToken((if matchChar text '=' then BANG_EQUAL else BANG), text)
    | '=' -> addNonLiteralToken((if matchChar text '=' then EQUAL_EQUAL else EQUAL), text)
    | '<' -> addNonLiteralToken((if matchChar text '=' then LESS_EQUAL else LESS), text)
    | '>' -> addNonLiteralToken((if matchChar text '=' then GREATER_EQUAL else GREATER), text)
    | '/' -> if matchChar text '/' then (peekComment |> ignore) else addNonLiteralToken(SLASH, text)
    | ' ' | '\r' | '\t'-> ()
    | '\n' -> line <- line + 1
    | _ -> () //Failer.error line (String.Format("Unexpected character: {0}", c))

let scanTokens (text:string) = 
    while not (isAtEnd text) do
        let start = current
        scanOneToken text
        0 |> ignore

    let lastToken = { tokenType = TokenType.EOF; lexeme = ""; literal = null; line = line }
    let tokens = List.append tokens [lastToken]
    tokens