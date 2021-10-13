def fizzbuzz(n):
    r = ''
    if n % 3 == 0:
        r += "Fizz"
    if n % 5 == 0:
        r += "Buzz"
    if r == '':
        return n
    else:
        return r



let JSON-Value
    | JSON-String
    | JSON-Number
    | JSON-Boolean


pi = 3.14

fn fizzbuzz: num => str {

    int n

    mod3 = n % 3 == 0
    mod5 = n % 5 == 0

    mod3 mod5 ?
    | false false -> n
    | true false -> 'Fizz'
    | false true -> 'Buzz'
    | true true -> 'FizzBuzz'
    : raise Error()

    jvalue = JSON-String

    n % 3 == 0 ?
    | a
    : b

    jvalue ?
    | JSON-String -> a
    | JSON-Number -> b
    | JSON-Boolean -> c
    : raise Error() -> d

}
