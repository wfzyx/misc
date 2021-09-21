module Failer

let mutable hadError = false

let report line where msg = 
    printfn "[line %d] Error %s : %s" line where msg
    hadError <- true

let error line msg:unit = 
    report line "" msg