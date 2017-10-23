java -jar /usr/local/lib/antlr-4.7-complete.jar AtalkLexer.g4
javac *.java
java org.antlr.v4.gui.TestRig AtalkLexer tokens < input
