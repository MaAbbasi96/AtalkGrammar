lexer grammar AtalkLexer;
Comment: '#'.*'\n' {System.out.println("Comment");};
// Reserved Words
ACTOR: [a-zA-Z]+ {getText().toLowerCase().equals("actor")}?
        {System.out.println("ACTOR");};
RECEIVER: [a-zA-Z]+ {getText().toLowerCase().equals("receiver")}?
        {System.out.println("RECEIVER");};
INT: [a-zA-Z]+ {getText().toLowerCase().equals("int")}?
        {System.out.println("INT");};
CHAR: [a-zA-Z]+ {getText().toLowerCase().equals("char")}?
        {System.out.println("CHAR");};
QUIT: [a-zA-Z]+ {getText().toLowerCase().equals("quit")}?
        {System.out.println("QUIT");};
FOREACH: [a-zA-Z]+ {getText().toLowerCase().equals("foreach")}?
        {System.out.println("FOREACH");};
BREAK: [a-zA-Z]+ {getText().toLowerCase().equals("break")}?
        {System.out.println("BREAK");};
IF: [a-zA-Z]+ {getText().toLowerCase().equals("if")}?
        {System.out.println("IF");};
ELSE: [a-zA-Z]+ {getText().toLowerCase().equals("else")}?
        {System.out.println("ELSE");};
ELSEIF: [a-zA-Z]+ {getText().toLowerCase().equals("elseif")}?
        {System.out.println("ELSEIF");};
SENDER: [a-zA-Z]+ {getText().toLowerCase().equals("sender")}?
        {System.out.println("SENDER");};
SELF: [a-zA-Z]+ {getText().toLowerCase().equals("self")}?
        {System.out.println("SELF");};
IN: [a-zA-Z]+ {getText().toLowerCase().equals("in")}?
        {System.out.println("IN");};
BEGIN: [a-zA-Z]+ {getText().toLowerCase().equals("begin")}?
        {System.out.println("BEGIN");};
END: [a-zA-Z]+ {getText().toLowerCase().equals("end")}?
        {System.out.println("END");};
READ: [a-zA-Z]+ {getText().toLowerCase().equals("read")}?
        {System.out.println("READ");};
WRITE: [a-zA-Z]+ {getText().toLowerCase().equals("write")}?
        {System.out.println("WRITE");};


ID: [a-zA-Z]+ {System.out.println("ID = " + getText());};


WS  :   [ \t\r] -> skip ;
