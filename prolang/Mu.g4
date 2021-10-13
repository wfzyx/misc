grammar Mu;

unit        :   (cmd NL?)+ ;

cmd         :   expr SC 
            |   comp SC
            |   attr SC
            ;

// select_expr :   QSMARK WS (comp | ID) ()

attr        :   ID ATTR expr ;

expr        :   expr_atom WS? BINARY_OP WS? expr
            |   expr_atom 
            ;

comp        :   expr_atom COMPAR_OP expr_atom ;

expr_atom   :   INT | FLOAT | ID;

ID          :   [a-zA-Z_] [a-zA-Z_0-9]* ;

FLOAT       :   [0-9]+ '.' [0-9]*
            |   '.' [0-9]+
            ;

INT         :   [0-9]+ ;

BINARY_OP   :   PLUS | MINUS | MULT | DIV | EXP | IDIV ;
COMPAR_OP   :   EQ | NEQ | GT | LT | GEQ | LEQ ;

PLUS        :   '+' ;
MINUS       :   '-' ;
MULT        :   '*' ; 
DIV         :   '/' ;
IDIV        :   '//' ;
EXP         :   '**' ;
ATTR        :   '=' ;
EQ          :   '==' ;
NEQ         :   '!=' ;
GT          :   '>' ;
LT          :   '<' ;
GEQ         :   '>=' ;
LEQ         :   '<=' ;
WS          :   [\t ] -> skip ;
NL          :   [\n] -> skip ;
SC          :   ';' ; 
QSMARK      :   '?' ;
PPMARK      :   '|' ;
