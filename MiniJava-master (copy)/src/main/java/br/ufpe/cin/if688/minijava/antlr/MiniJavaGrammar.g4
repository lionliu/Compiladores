grammar MiniJavaGrammar;
goal: mainClass (classDeclaration)* EOF;
mainClass: 'class' identifier '{' 'public' 'static' 'void' 'main' '(' 'String[]' identifier ')' '{' statement '}' '}';
classDeclaration: 'class' identifier ('extends' identifier )? '{' (varDeclaration)* ( methodDeclaration )* '}';
varDeclaration: type identifier ';';
methodDeclaration: 'public' type identifier '(' (type identifier (',' type identifier)*)? ')' '{' (varDeclaration)* (statement)* 'return' expression ';' '}';
type: IntArray | Boolean | Int | identifier;
Int: 'int';
IntArray: 'int' '[' ']';
Boolean: 'boolean';
statement: statementBlock
        | ifStatement
        | whileStatement
        | printStatement
        | assignID
        | assignArray
        ;
statementBlock: '{' (statement)* '}'
        ;
assignID: identifier '=' expression ';'
        ;
whileStatement: 'while' '(' expression ')' statement
        ;
ifStatement: 'if' '(' expression ')' statement 'else' statement
        ;
printStatement: 'System.out.println' '(' expression ')' ';'
        ;
assignArray: identifier '[' expression ']' '=' expression ';'
        ;

expression: expression ('&&' | '<' | '+' | '-' | '*') expression
        | expression '[' expression ']'
        | expression '.' 'length'
        | expression '.' identifier '(' (expression (',' expression)*)? ')'
        | identifier
        | ExpNumber
        | ExpTrue
        | ExpFalse
        | ExpThis
        | expNewInt
        | expNegate
        | expParent
        | expNewID
        ;
ExpTrue: 'true'
        ;
ExpFalse: 'false'
        ;
ExpThis: 'this'
        ;
ExpNumber: (Digit)+
        ;
expNewInt: 'new' 'int' '[' expression ']'
        ;
expNewID: 'new' identifier '(' ')'
        ;
expNegate: '!' expression
        ;
expParent: '(' expression ')'
        ;
identifier: Identifier;

Identifier: [A-Za-z_][A-Za-z0-9_]*;
//Alphanumeric: Letter | Digit;
//Letter: [A-Za-z_];
Digit: [0-9];

WS:[ \t\r\n\u000C]+ -> skip;
COMMENT:'/*' .*? '*/' -> skip;
LINE_COMMENT:'//' ~[\r\n]* -> skip;
