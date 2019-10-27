grammar MiniJavaGrammar;
goal: mainClass (classDeclaration)* EOF;
mainClass: 'class' Identifier '{' 'public' 'static' 'void' 'main' '(' 'String[]' Identifier ')' '{' statement '}' '}';
classDeclaration: 'class' Identifier ('extends' Identifier )? '{' (varDeclaration)* ( methodDeclaration )* '}';
varDeclaration: type Identifier ';';
methodDeclaration: 'public' type Identifier '(' (type Identifier (',' type Identifier)*)? ')' '{' (varDeclaration)* (statement)* 'return' expression ';' '}';
type: 'int' '[' ']' | 'boolean' | 'int' | Identifier;
statement: '{' (statement)* '}'
        | 'if' '(' expression ')' statement 'else' statement
        | 'while' '(' expression ')' statement
        | 'System.out.println' '(' expression ')' ';'
        | Identifier '=' expression ';'
        | Identifier '[' expression ']' '=' expression ';'
        ;
expression: expression ('&&' | '<' | '+' | '-' | '*') expression
        | expression '[' expression ']'
        | expression '.' 'length'
        | expression '.' Identifier '(' (expression (',' expression)*)? ')'
        | (Digit)+
        | 'true'
        | 'false'
        | Identifier
        | 'this'
        | 'new' 'int' '[' expression ']'
        | 'new' Identifier '(' ')'
        | '!' expression
        | '(' expression ')'
        ;
Identifier: [A-Za-z0-9_]+;
//Alphanumeric: Letter | Digit;
//Letter: [A-Za-z_];
Digit: [0-9];

WS:[ \t\r\n\u000C]+ -> skip;
COMMENT:'/*' .*? '*/' -> skip;
LINE_COMMENT:'//' ~[\r\n]* -> skip;
