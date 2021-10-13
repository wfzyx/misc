module Lox
open Failer
open System
open Lexer

let run filepath = 
    let flatList = List.append [""] (System.IO.File.ReadLines(filepath) |> List.ofSeq)
    let textInput = (String.concat "" flatList)
    let tokens = Lexer.scanTokens textInput
    for token in tokens do 
        printfn "%s" (Token.ToString token)

[<EntryPoint>]
let main argv =
    if argv.Length = 1 then
        run argv.[0]
        0
    else
        printfn "Usage: flox [script]"
        64
