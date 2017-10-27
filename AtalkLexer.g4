grammar AtalkLexer;

@members{
    void print(String str){
        System.out.println(str);
    }
}

program:
        (actor)*
        {print("program");}
        ;

actor:
        ACTOR name=ID '<' INTEGER '>' '\n'+
        (body)*
        END '\n'+
        {print("actor: " + $name.text);}
        ;

body:
        ((variableDefine) | (receiver) | '\n')+
        {print("body");}
        ;

variableDefine:
        (INT | CHAR) ('[' INTEGER ']')* name=ID ('=' (INTEGER | CHARACTER | arrayy ))? '\n'+
        {print("variableDefine: " + $name.text);}
        ;
arrayy:
        '{' array (',' (array) )* '}'
        ;

array:
        (INTEGER | CHARACTER) 
        ;
receiver:
        RECEIVER name=ID '(' (arguments)? ')' '\n'+
        (statement)*
        END '\n'+
        {print("receiver: " + $name.text);}
        ;

arguments:
        (argument | expression) (',' (argument | expression))*
        {print("arguments");}
        ;

argument:
        (INT | CHAR)? ('[' INTEGER ']')* ID
        {print("argument");}
        ;

statement:
        expression | variableDefine | actorCall | condition | loop | rwFunc | quit | break_ | scope
        {print("statement");}
        ;

expression:
        (expOr | expAlloc) '\n'*
        {print("expression");}
        ;

expAlloc:
        ID name='=' expression
        {print("expAlloc: " + $name.text);}
        ;

expOr:
        expAnd | expAnd name='or' expOr
        {print("expOr: " + $name.text);}
        ;

expAnd:
        expEquality | expEquality name='and' expAnd
        {print("expAnd: " + $name.text);}
        ;

expEquality:
        expComparator | expComparator name=('==' | '<>') expEquality
        {print("expEquality: " + $name.text);}
        ;

expComparator:
        expAddSub | expAddSub name=('<' | '>') expComparator
        {print("expComparator: " + $name.text);}
        ;

expAddSub:
        expDividMult | expDividMult name=('+' | '-') expAddSub
        {print("expAddSub: " + $name.text);}
        ;
expDividMult:
        expNot | expNot name=('/' | '*') expDividMult
        {print("expDividMult: " + $name.text);}
        ;

expNot:
        expOther | expOther name=('not' | '-') expNot
        {print("expNot: " + $name.text);}
        ;

expOther:
        INTEGER | ID (('[' expression ']')*)  | '(' expression ')' |  read
        {print("expOther");}
        ;
actorCall:
        (ID | SENDER | SELF) '<<' receiverCall
        {print("actorCall");}
        ;

receiverCall:
        ID '(' (arguments)? ')' '\n'+
        {print("receiverCall");}
        ;

condition:
        IF expression '\n'+
        (statement)*
        (ELSEIF expression '\n'+
        (statement)*)*
        (ELSE '\n'+
        (statement)*)?
        END '\n'+
        {print("condition");}
        ;

loop:
        (FOREACH) ID IN ID '\n'+
        statement*
        END '\n'+
        {print("loop");}
        ;

rwFunc:
        read | write
        {print("rwFunc");}
        ;
read:
        READ '(' INTEGER ')' '\n'+
        {print("read");}
        ;

write:
        WRITE '(' (STRING | INTEGER | CHAR | ID) ')' '\n'+
        {print("write");}
        ;

scope:
        BEGIN '\n'+
        statement*
        END '\n'+
        {print("scope");}
        ;

quit:
        QUIT'\n'+
        {print("quit");}
        ;

break_:
        BREAK '\n'+
        {print("break_");}
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
