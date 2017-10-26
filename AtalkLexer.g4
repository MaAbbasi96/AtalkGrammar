lexer grammar AtalkLexer;

@members{
    void print(String str){
        System.out.println(str);
    }
}
program:
        (actor)*
        ;

actor:
        ACTOR ID '<' INTEGER '>'
        (body)*
        END '\n'
        ;

body:
        (variableDefine)* | (receiver)*
        ;

variableDefine:
        (INT | CHAR) ID ('=' (INTEGER | CHARACTER))? // TODO: array declaration
        ;

receiver:
        RECEIVER ID '(' (arguments)? ')\n'
        (statement)*
        END '\n'
        ;

arguments:
        argument (',' argument)*
        ;

argument:
        (INT | CHAR) ID
        ;

statement:
        expression | variableDefine | actorCall | condition | loop | rwFunc | quit | break | scope
        ;

exprssion:

        ;

actorCall:
        (ID | SENDER | SELF) '<<' receiverCall
        ;

receiverCall:
        ID '(' (arguments)? ')'
        ;

condition:
        IF exprssion '\n'
        (statement)*
        (ELSEIF expression '\n'
        (statement)*)*
        (ELSE '\n'
        (statement)*)?
        END '\n'
        ;

loop:
        (FOREACH) ID IN ID '\n'
        statement*
        END '\n'
        ;

rwFunc:
        read | write
        ;
read:
        READ '(' INTEGER ')' '\n'
        ;

write:
        WRITE '(' (STRING | INTEGER | CHAR | ID) ')' '\n'
        ;

scope:
        BEGIN '\n'
        statement*
        END '\n'
        ;

quit:
        QUIT'\n'
        ;

break:
        BREAK '\n'
        ;


COMMENT: '#' ~( '\r' | '\n' )* {print("Comment = " + getText());};

// Reserved Words
ACTOR: [a-zA-Z]+
        {getText().toLowerCase().equals("actor")}?
        {print("ACTOR");};
RECEIVER: [a-zA-Z]+
        {getText().toLowerCase().equals("receiver")}?
        {print("RECEIVER");};
INT: [a-zA-Z]+
        {getText().toLowerCase().equals("int")}?
        {print("INT");};
CHAR: [a-zA-Z]+
        {getText().toLowerCase().equals("char")}?
        {print("CHAR");};
QUIT: [a-zA-Z]+
        {getText().toLowerCase().equals("quit")}?
        {print("QUIT");};
FOREACH: [a-zA-Z]+
        {getText().toLowerCase().equals("foreach")}?
        {print("FOREACH");};
BREAK: [a-zA-Z]+
        {getText().toLowerCase().equals("break")}?
        {print("BREAK");};
IF: [a-zA-Z]+
        {getText().toLowerCase().equals("if")}?
        {print("IF");};
ELSE: [a-zA-Z]+
        {getText().toLowerCase().equals("else")}?
        {print("ELSE");};
ELSEIF: [a-zA-Z]+
        {getText().toLowerCase().equals("elseif")}?
        {print("ELSEIF");};
SENDER: [a-zA-Z]+
        {getText().toLowerCase().equals("sender")}?
        {print("SENDER");};
SELF: [a-zA-Z]+
        {getText().toLowerCase().equals("self")}?
        {print("SELF");};
IN: [a-zA-Z]+
        {getText().toLowerCase().equals("in")}?
        {print("IN");};
BEGIN: [a-zA-Z]+
        {getText().toLowerCase().equals("begin")}?
        {print("BEGIN");};
END: [a-zA-Z]+
        {getText().toLowerCase().equals("end")}?
        {print("END");};
READ: [a-zA-Z]+
        {getText().toLowerCase().equals("read")}?
        {print("READ");};
WRITE: [a-zA-Z]+
        {getText().toLowerCase().equals("write")}?
        {print("WRITE");};


ID: [a-zA-Z_][a-zA-Z0-9_]*
        {print("ID = " + getText());};

INTEGER: [1-9][0-9]*
        {print("Integer = " + getText());};
CHARACTER: '\''[a-zA-Z]'\''
        {print("Character = " + getText());};

OPERATOR: ('=='|'=')
        {print("OPERATOR = " + getText());};



WS  :   [ \t\r] -> skip ;
