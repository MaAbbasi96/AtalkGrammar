grammar AtalkLexer;

@members{
    void print(String str){
        System.out.println(str);
    }
}

program:
        (actor)*
        ;

actor:
        ACTOR ID '<' INTEGER '>' '\n'+
        (body)*
        END '\n'+
        ;

body:
        ((variableDefine) | (receiver) | '\n')+
        ;

variableDefine:
        (INT | CHAR) ('[' INTEGER ']')* ID ('=' (INTEGER | CHARACTER))? '\n'+
        ;

receiver:
        RECEIVER ID '(' (arguments)? ')' '\n'+
        (statement)*
        END '\n'+
        ;

arguments:
        (argument | expression) (',' (argument | expression))*
        ;

argument:
        (INT | CHAR)? ('[' INTEGER ']')* ID
        ;

statement:
        expression | variableDefine | actorCall | condition | loop | rwFunc | quit | break_ | scope
        ;

expression:
        (expOr | expAlloc) '\n'*
        ;

expAlloc:
        ID '=' expression
        ;

expOr:
        expAnd | expAnd 'or' expOr
        ;

expAnd:
        expEquality | expEquality 'and' expAnd
        ;

expEquality:
        expComparator | expComparator ('==' | '<>') expEquality
        ;

expComparator:
        expAddSub | expAddSub ('<' | '>') expComparator
        ;

expAddSub:
        expDividMult | expDividMult ('+' | '-') expAddSub
        ;
expDividMult:
        expNot | expNot ('/' | '*') expDividMult
        ;

expNot:
        expOther | expOther('not' | '-') expNot
        ;

expOther:
        INTEGER | ID (('[' expression ']')*)  | '(' expression ')' |  read
        ;
actorCall:
        (ID | SENDER | SELF) '<<' receiverCall
        ;

receiverCall:
        ID '(' (arguments)? ')' '\n'+
        ;

condition:
        IF expression '\n'+
        (statement)*
        (ELSEIF expression '\n'+
        (statement)*)*
        (ELSE '\n'+
        (statement)*)?
        END '\n'+
        ;

loop:
        (FOREACH) ID IN ID '\n'+
        statement*
        END '\n'+
        ;

rwFunc:
        read | write
        ;
read:
        READ '(' INTEGER ')' '\n'+
        ;

write:
        WRITE '(' (STRING | INTEGER | CHAR | ID) ')' '\n'+
        ;

scope:
        BEGIN '\n'+
        statement*
        END '\n'+
        ;

quit:
        QUIT'\n'+
        ;

break_:
        BREAK '\n'+
        ;


COMMENT: '#' ~( '\r' | '\n' )* '\n'* -> skip;

// Reserved Words
ACTOR: 'actor'
        {print("ACTOR");};
RECEIVER: 'receiver'
        {print("RECEIVER");};
INT: 'int'
        {print("INT");};
CHAR: 'char'
        {print("CHAR");};
QUIT: 'quit'
        {print("QUIT");};
FOREACH: 'foreach'
        {print("FOREACH");};
BREAK: 'break_'
        {print("BREAK");};
IF: 'if'
        {print("IF");};
ELSE: 'else'
        {print("ELSE");};
ELSEIF: 'elseif'
        {print("ELSEIF");};
SENDER: 'sender'
        {print("SENDER");};
SELF: 'self'
        {print("SELF");};
IN: 'in'
        {print("IN");};
BEGIN: 'begin'
        {print("BEGIN");};
END: 'end'
        {print("END");};
READ: 'read'
        {print("READ");};
WRITE: 'write'
        {print("WRITE");};


ID: [a-zA-Z_][a-zA-Z0-9_]*
        {print("ID = " + getText());};

INTEGER: [0-9]+
        {print("Integer = " + getText());};
CHARACTER: '\''[a-zA-Z]'\''
        {print("Character = " + getText());};
STRING: '"' ~('"')* '"'
        {print("String = " + getText());};


WS  :   [ \t\r] -> skip ;
