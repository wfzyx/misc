grammar Mu;

unit        :   gen_attr+
            |   EOF
            ;

command     :   ( expr | fun_call | for_loop | match_cond | ret_call ) SEMI | gen_attr;

assignables :   match_cond | fun_call | expr | expr_block;

gen_attr    :   ID COLON type? OP_ASSING assignables SEMI ;

expr_block  :   command
            |   LKEY command+ RKEY
            ;

type        :   fun_decl | LBRACK TYPELIST RBRACK | TYPELIST;

fun_decl    :   'fn'
                LPAREN
                ( ID COLON type (COMMA ID COLON type)? )?
                RPAREN
                COLON type
                ;

fun_call    :   ID 
                LPAREN
                (ID (COMMA ID)?)?
                RPAREN
                ;

for_loop    :   'for' LPAREN ID COLON type 'in' ( ID | RANGE_LIT ) RPAREN expr_block;

match_cond      :   'match' LPAREN ID RPAREN LKEY match_branch+ RKEY;
match_branch    :   'as' LPAREN ( comp ) RPAREN OP_ASSING command | 'default' OP_ASSING command;

ret_call    :   'ret' assignables
            ;

expr        :   lhs=expr_atom op=binary_op rhs=expr_atom
            |   expr_atom
            ;

expr_atom   :   STR_LIT | FLOAT_LIT | INT_LIT | ID ;

comp        :   lhs=expr op=compar_op rhs=expr ;

arith_op    :   OP_PLUS | OP_MINUS | OP_MULT | OP_DIV | OP_EXP | OP_IDIV | OP_MOD ;
compar_op   :   OP_VALEQ | OP_REFEQ | OP_GT | OP_LT | OP_GEQ | OP_LEQ | OP_NEQ;
binary_op   :   arith_op | compar_op ;

CONST       :   'const' ;
LET         :   'let'   ;

OP_PLUS     :   '+' ;
OP_MINUS    :   '-' ;
OP_MULT     :   '*' ;
OP_DIV      :   '/' ;
OP_MOD      :   '%' ;
OP_NEQ      :   '!=' ;
OP_IDIV     :   '//' ;
OP_EXP      :   '**' ;
OP_ASSING   :   '=' ;
OP_VALEQ    :   '==' ;
OP_REFEQ    :   '===' ;
OP_GT       :   '>' ;
OP_LT       :   '<' ;
OP_GEQ      :   '>=' ;
OP_LEQ      :   '<=' ;

IG          :   [\t\r\n] -> skip ;
WS          :   ' ' -> skip;
COLON       :   ':' ; 
SEMI        :   ';' ; 
COMMA       :   ',' ; 
QSMARK      :   '?' ;
PPMARK      :   '|' ;
DOT         :   '.' ;
LKEY        :   '{' ;
RKEY        :   '}' ;
LPAREN      :   '(' ;
RPAREN      :   ')' ;
LBRACK      :   '[' ;
RBRACK      :   ']' ;
DQUOT       :   '"' ;

TYPELIST    :   'r64'
            |   'r32'
            |   'r16'
            |   'r8'
            |   'num'
            |   'str'
            ;

STR_LIT     :   DQUOT .*? DQUOT ;

FLOAT_LIT   :   [0-9]+ DOT [0-9]+
            |   DOT [0-9]+
            ;

RANGE_LIT   :   INT_LIT '..' INT_LIT ;
INT_LIT     :   [0-9]+ ;
ID          :   [a-zA-Z_]+ ;
COMMENT     :   OP_DIV OP_MULT .*? OP_MULT OP_DIV -> skip ;