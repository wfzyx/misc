# Introduction

This document is the result of years of research in programming languages. The intention is
to list the features that, in my opinion, have resisted the test of time, and being improved
upon many iterations across different languages and technologies.

# Expression Semantics

Even though in mathematics there is operator precedence, when bringing this idea to programming
languages new challenges arises. Many common operations in programming doesn't have a direct
equivalent in mathematics, causing different languages and even compilers to implement varying
orders for custom operators.

## Binary Operators

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

## Unary Operators

Other common problem in expression parsing is the use of the same symbols to represent both
unary and binary operations. 

*/ TODO: Decide for forced whitespacing and/or unique operators for unarys */


