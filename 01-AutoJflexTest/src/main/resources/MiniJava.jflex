package br.ufpe.cin.if688.jflex;

%%

/* Não altere as configuraçõe a seguir */

%line
%column
%unicode
//%debug
%public
%standalone
// Nome da classe
%class MiniJava
%eofclose

/* Insira as regras léxicas abaixo em formato de expressões regulares */

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
whitespace = {LineTerminator} | [ \t\f]

/* comments */
Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}
TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
EndOfLineComment = "//" {InputCharacter}* {LineTerminator}?
DocumentationComment = "/**" {CommentContent} "*"+"/"
CommentContent   = ( [^*] | \*+ [^/*] )*

reserved = "boolean" | "class" | "public" | "extends" | "static" | "void" | "main" | "String" | "int" | "while" | "if" | "else" | "return" | "length" | "true" | "false" | "this" | "new" | "System.out.println"

operators = "&&" | "<" | "==" | "!=" | "+" | "-" | "*" | "!"

delimiters = ";" | "." | "," | "=" | "(" | ")" | "{" | "}" | "[" | "]"
// delimiters = [;.,=(){}[]]

digit = [0-9]
integer = {digit}+

letter = [A-Za-z_]
alphanumeric = {letter} | {digit}
identifier = {letter}({alphanumeric})*

%%
    
/* Insira as regras léxicas no espaço abaixo */

{reserved}      { System.out.println("token gerado foi um reservado: '" +  yytext() + "' na linha: " + yyline + ", coluna: " + yycolumn); }
{operators}     { System.out.println("token gerado foi um operador: '" +  yytext() + "' na linha: " + yyline + ", coluna: " + yycolumn); }
{delimiters}    { System.out.println("token gerado foi um delimitador: '" +  yytext() + "' na linha: " + yyline + ", coluna: " + yycolumn); }
{identifier}    { System.out.println("token gerado foi um id: '" +  yytext() + "' na linha: " + yyline + ", coluna: " + yycolumn); }
{integer}       { System.out.println("token gerado foi um integer: '" +  yytext() + "' na linha: " + yyline + ", coluna: " + yycolumn); }
{Comment}       { /* Fazer nada com comentário */ }
{whitespace}    { /* Fazer nada com whitespace */ }
.               { throw new RuntimeException("Caractere ilegal! '" + yytext() + "' na linha: " + yyline + ", coluna: " + yycolumn); }
