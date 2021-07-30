grammar IJARPL;

/*
<program> := main‘(’ ‘)’ ‘{‘ <block> ‘}’
*/

program:
    'main' '(' ')'
          '{'
          block
          '}'
        ;
/*
<block> := <block><statement>
| ε
*/
block:
    block statement
    |
    ;

/*
<statement> := <expr>;
| <declaration>;
| <while_cond>
| <if_cond>
| ‘{‘ <block> ‘}’
*/
statement:
    print ';'
    | expr ';'
    | declaration ';'
    | while_cond
    | if_cond
    | for_loop
    | '{' block '}'
    ;
/*
<expr> := <identifier>
| <assign_expr>
| <arith_expr>
| <comp_expr>
| <logic_expr>
| <tern_expr>
*/
expr:
    identifier
    | assign_expr
    | arith_expr
    | comp_expr
    | logic_expr
    | expr '?' expr ':' expr
    ;
/*
<declaration> := <data_type><identifier>
| <data_type><assign_expr>
*/
declaration:
    DATA_TYPE identifier
    | DATA_TYPE assign_expr
    ;
/*
<while_cond> := while ‘(‘ <expr> ‘)’ <block>
*/
while_cond:
    'while' '(' expr ')' block
    ;
/*
<if_cond> := if ‘(‘ <expr> ‘)’ <block>
| if ‘(‘ <expr> ‘)’ <block> ‘else’ <block>
*/
if_cond:
    'if' '(' expr ')' block
    | 'if' '(' expr ')' block 'else' block
    ;
/*
<for_loop> := for <for_loop_statement> <block>
*/
for_loop:
    'for' for_loop_statement block
    ;
for_loop_statement:
    '(' assign_expr ';' comp_expr ';' assign_expr ')'
    | '(' identifier 'in' 'range' '(' INTEGER',' INTEGER ')' ')'
    ;

/*
<identifier> := <non_interger>
| <identifier><non_integer>
| <identifier><integer>
*/
identifier:
    //[a-zA-Z][a-zA-Z0-9]*;
    NON_INTEGER
    | identifier NON_INTEGER
    | identifier INTEGER
    ;
/*
<assign_expr> := <identifier> ‘=’ <expr>
*/
assign_expr:
    identifier '=' expr
    ;
/*
<arith_expr> := <arith_expr> ‘+’ <arith_expr>
| <arith_expr> ‘-’ <arith_expr>
| <arith_expr> ‘*’ <arith_expr>
| <arith_expr> ‘/’ <arith_expr>
| <arith_expr> ‘%’ <arith_expr>
| <arith_expr> ‘^’ <arith_expr>
| <integer>
| <non_integer>
*/
arith_expr:
    arith_expr '+' arith_expr
    | arith_expr '-' arith_expr
    | arith_expr '*' arith_expr
    | arith_expr '/' arith_expr
    | arith_expr '%' arith_expr
    | arith_expr '^' arith_expr
    | INTEGER
    | identifier
    ;
/*
<comp_expr> := <comp_phrase><comp_operator><comp_phrase>
*/
comp_expr:
    comp_phrase comp_operator comp_phrase
    ;
/*
<comp_phrase> := <identifier>
| <number>
| ‘(’ <arith_expr> ‘)’
*/
comp_phrase:
    identifier
    | number
    | '(' arith_expr ')'
    ;
/*
<comp_operator> := ‘<’ | ‘<=’ | ‘>’ | ‘>=’ | ‘==’ | ‘!=’
*/
comp_operator:
    '<'
    | '<='
    | '>'
    | '>='
    | '=='
    | '!='
    ;
/*
<logic_expr> := <logic_phrase><logic_operator><logic_phrase>
*/
logic_expr:
    logic_phrase logic_operator logic_phrase
    ;
/*
<logic_phrase> := <identifier>
| <number>
| ‘(’ <arith_expr> ‘)’
*/
logic_phrase:
    identifier
    | number
    | '(' arith_expr ')'
    ;
/*
<logic_operator> := ‘&&’ | ‘||’ | ‘!!’
*/
logic_operator:
    '&&'
    | '||'
    | '!!'
    ;
/*
<tern_expr> := <expr> ‘?’ <block> ‘:’ <block>
*/

/*tern_expr:
    declaration '=' logic_expr '?' block ':' block
    /*
    assign_expr '?' block ':' block
    | arith_expr '?' block ':' block
    | comp_expr '?' block ':' block
    | logic_expr '?' block ':' block
    ;*/
/*
<number> := <number> <integer>
| <integer>
*/
number:
    number INTEGER
    | INTEGER
    ;
/*
<data_type> := int | bool
*/
DATA_TYPE:
    'int' | 'bool'
    ;

/*
<print> := <expr> | <string>
*/
print: 'print(' argument = expr ')'
		  | 'print(' text = STRING ')'
		  ;
/*
<integer> := 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9
*/
INTEGER:
    [0-9]+
    ;
/*
<non_integer> := a | b | c | d ......x | y | z
*/
NON_INTEGER: [a-zA-Z][a-zA-Z0-9]*;
/*
<bool_val> := true | false
*/
BOOL_VAL:
    'true'
    | 'false'
    ;

STRING: '"' (~["])* '"' ;
WHITE_SPACE : [ \t\n]+ -> skip ;
