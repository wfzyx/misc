# Introduction

This document is the result of years of research in programming languages. The intention is
to list the features that, in my opinion, have resisted the test of time, and being improved
upon many iterations across different languages and technologies.

# Language Specification

## Expression Semantics

Everything that can be converted to a expression instead of a statement, should be done so.
This idea helps with other aspects of the language such as expressive operators, immutability,
function composition, etc.

* Assignments - Whatever value evaluates on RHS can be returned from an assignment expression

* Functions - Working with the idea of a function being "the mapping from a input to an output",
functions, should always yield the latest computed value.

* Branches - Similar to functions, the last computed value on the block should be returned.
Ideally only one expression exists per branch, and if one branching structure isn't enough,
nesting should be used to separate the matching context.

* Loops - Adopting the idea from Haxe, a loop expression should return a list containing one
element per iteration, that happens to be the last computed value before starting a new
iteration.

## Expression Semantics

Even though in mathematics there is operator precedence, when bringing this idea to programming
languages new challenges arises. Many common operations in programming doesn't have a direct
equivalent in mathematics, causing different languages and even compilers to implement varying
orders for custom operators.

### Binary Operators

In APL and it is ASCII successor, J, operations in expressions are read from left to right,
without operator precedence and with right associativity in all pairs.

So while in most programming languages the following expression would evaluate as the value
fourteen:

```
3 * 4 + 2 == 14
```

In both before mentioned languages the same expression would evaluate as eighteen. This happens
due to the right associativity of each pair, henceforth resulting the following expression being
evaluated:

```
3 * ( 4 + 2 )
```

This approach has many different advantages, both for the language implementation and for the
developers.

The commonest scenario involves working around infinite recursive patterns and it allows dubious
interpretation on what a expression may evaluate to, depending on the language semantics.

Using the APL semantics, all binary expression can be read as "left-hand side suffers the binary
operator effect from the result of the right-hand side". Being parsed recursively until the RHS
is a factor and not a composite expression anymore.

### Unary Operators

Other common problem in expression parsing is the use of the same symbols to represent both
unary and binary operations. An easy solution to the problem is that every unary operator needs
to be written pre-pended to the atom without any spaces, and binary operators should have spaces
on both sides to prevent ambiguities on the parsing.

* +(Plus) = Gets the absolute value
* -(Minus) = Inverts the sign

## 
