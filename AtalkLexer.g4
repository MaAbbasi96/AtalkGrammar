lexer grammar AtalkLexer;
Comment: '#'.*'\n' {System.out.println("Comment = "+getText()+" ");};
// Reserved Words
actor: [a-z]+ {getText().equals("actor")}? {System.out.println("actor = "+getText()+" ");};
receiver: [a-z]+ {getText().equals("receiver")}? {System.out.println("receiver = "+getText()+" ");};
int: [a-z]+ {getText().equals("int")}? {System.out.println("int = "+getText()+" ");};
char: [a-z]+ {getText().equals("char")}? {System.out.println("char = "+getText()+" ");};
quit: [a-z]+ {getText().equals("quit")}? {System.out.println("quit = "+getText()+" ");};
foreach: [a-z]+ {getText().equals("foreach")}? {System.out.println("foreach = "+getText()+" ");};
break: [a-z]+ {getText().equals("break")}? {System.out.println("break = "+getText()+" ");};
if: [a-z]+ {getText().equals("if")}? {System.out.println("if = "+getText()+" ");};
else: [a-z]+ {getText().equals("else")}? {System.out.println("else = "+getText()+" ");};
elseif: [a-z]+ {getText().equals("elseif")}? {System.out.println("elseif = "+getText()+" ");};
sender: [a-z]+ {getText().equals("sender")}? {System.out.println("sender = "+getText()+" ");};
self: [a-z]+ {getText().equals("self")}? {System.out.println("self = "+getText()+" ");};
in: [a-z]+ {getText().equals("in")}? {System.out.println("in = "+getText()+" ");};
begin: [a-z]+ {getText().equals("begin")}? {System.out.println("begin = "+getText()+" ");};
end: [a-z]+ {getText().equals("end")}? {System.out.println("end = "+getText()+" ");};
read: [a-z]+ {getText().equals("read")}? {System.out.println("read = "+getText()+" ");};
write: [a-z]+ {getText().equals("write")}? {System.out.println("write = "+getText()+" ");};


WS  :   [ \t\r] -> skip ;
