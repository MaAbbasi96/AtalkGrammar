grammar AtalkLexer;

@members{
    void print(String str){
        System.out.println(str);
    }
}

program:
        {print("program");}
        (actor)*
        ;

actor:
        ACTOR name=ID {print("actor: " + $name.text);} '<' INTEGER '>' '\n'+
        (body)*
        END '\n'+
        ;

body:
        {print("body");}
        ((variableDefine) | (receiver) | '\n')+
        ;

variableDefine:
        (INT | CHAR) ('[' INTEGER ']')* name=ID {print("variableDefine: " + $name.text);} ('=' (INTEGER | CHARACTER | array ))? '\n'+
        ;
array:
        {print("array");}
        '{' arrayy (',' (array) )* '}' | arrayy
        ;

arrayy:
        ('{' INTEGER (',' INTEGER)*'}') | ('{' CHARACTER (',' CHARACTER)*'}') | STRING
        ;

receiver:
        RECEIVER name=ID {print("receiver: " + $name.text);} '(' (arguments)? ')' '\n'+
        (statement)*
        END '\n'+
        ;

arguments:
        {print("arguments");}
        (argument | expression) (',' (argument | expression))*
        ;

argument:
        {print("argument");}
        (INT | CHAR)? ('[' INTEGER ']')* ID
        ;

statement:
        {print("statement");}
        expression | variableDefine | actorCall | condition | loop | rwFunc | quit | break_ | scope
        ;

expression:
        {print("expression");}
        (expOr | expAlloc) '\n'*
        ;

expAlloc:
        ID name='=' {print("expAlloc: " + $name.text);} expression
        ;

expOr:
        expAnd | expAnd name='or' {print("expOr: " + $name.text);} expOr
        ;

expAnd:
        expEquality | expEquality name='and' {print("expAnd: " + $name.text);} expAnd
        ;

expEquality:
        expComparator | expComparator name=('==' | '<>') {print("expEquality: " + $name.text);} expEquality
        ;

expComparator:
        expAddSub | expAddSub name=('<' | '>') {print("expComparator: " + $name.text);} expComparator
        ;

expAddSub:
        expDividMult | expDividMult name=('+' | '-') {print("expAddSub: " + $name.text);} expAddSub
        ;
expDividMult:
        expNot | expNot name=('/' | '*') {print("expDividMult: " + $name.text);} expDividMult
        ;

expNot:
        expOther | expOther name=('not' | '-') {print("expNot: " + $name.text);} expNot
        ;

expOther:
        {print("expOther");}
        INTEGER | ID (('[' expression ']')*)  | '(' expression ')' |  read
        ;
actorCall:
        {print("actorCall");}
        (ID | SENDER | SELF) '<<' receiverCall
        ;

receiverCall:
        {print("receiverCall");}
        ID '(' (arguments)? ')' '\n'+
        ;

condition:
        {print("condition");}
        IF expression '\n'+
        (statement)*
        (ELSEIF expression '\n'+
        (statement)*)*
        (ELSE '\n'+
        (statement)*)?
        END '\n'+
        ;

loop:
        {print("loop");}
        (FOREACH) ID IN ID '\n'+
        statement*
        END '\n'+
        ;

rwFunc:
        {print("rwFunc");}
        read | write
        ;
read:
        {print("read");}
        READ '(' INTEGER ')' '\n'+
        ;

write:
        {print("write");}
        WRITE '(' (STRING | INTEGER | CHAR | ID | expression) ')' '\n'+
        ;

scope:
        {print("scope");}
        BEGIN '\n'+
        statement*
        END '\n'+
                {print("scope");}
        ;

quit:
        {print("quit");}
        QUIT'\n'+
        ;

break_:
        {print("break_");}
        BREAK '\n'+
        ;


COMMENT: '#' ~( '\r' | '\n' )* '\n'* -> skip;

// Reserved Words
ACTOR: 'actor';
RECEIVER: 'receiver';
INT: 'int';
CHAR: 'char';
QUIT: 'quit';
FOREACH: 'foreach';
BREAK: 'break_';
IF: 'if';
ELSE: 'else';
ELSEIF: 'elseif';
SENDER: 'sender';
SELF: 'self';
IN: 'in';
BEGIN: 'begin';
END: 'end';
READ: 'read';
WRITE: 'write';

ID: [a-zA-Z_][a-zA-Z0-9_]*;

INTEGER: [0-9]+;
CHARACTER: '\''[a-zA-Z]'\'';
STRING: '"' ~('"')* '"';

WS  :   [ \t\r] -> skip ;
