// Generated from AtalkLexer.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AtalkLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Comment=1, ACTOR=2, RECEIVER=3, INT=4, CHAR=5, QUIT=6, FOREACH=7, BREAK=8, 
		IF=9, ELSE=10, ELSEIF=11, SENDER=12, SELF=13, IN=14, BEGIN=15, END=16, 
		READ=17, WRITE=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Comment", "ACTOR", "RECEIVER", "INT", "CHAR", "QUIT", "FOREACH", "BREAK", 
		"IF", "ELSE", "ELSEIF", "SENDER", "SELF", "IN", "BEGIN", "END", "READ", 
		"WRITE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Comment", "ACTOR", "RECEIVER", "INT", "CHAR", "QUIT", "FOREACH", 
		"BREAK", "IF", "ELSE", "ELSEIF", "SENDER", "SELF", "IN", "BEGIN", "END", 
		"READ", "WRITE", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public AtalkLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AtalkLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			Comment_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			ACTOR_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			RECEIVER_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			INT_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			CHAR_action((RuleContext)_localctx, actionIndex);
			break;
		case 5:
			QUIT_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
			FOREACH_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			BREAK_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			IF_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
			ELSE_action((RuleContext)_localctx, actionIndex);
			break;
		case 10:
			ELSEIF_action((RuleContext)_localctx, actionIndex);
			break;
		case 11:
			SENDER_action((RuleContext)_localctx, actionIndex);
			break;
		case 12:
			SELF_action((RuleContext)_localctx, actionIndex);
			break;
		case 13:
			IN_action((RuleContext)_localctx, actionIndex);
			break;
		case 14:
			BEGIN_action((RuleContext)_localctx, actionIndex);
			break;
		case 15:
			END_action((RuleContext)_localctx, actionIndex);
			break;
		case 16:
			READ_action((RuleContext)_localctx, actionIndex);
			break;
		case 17:
			WRITE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void Comment_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println("Comment");
			break;
		}
	}
	private void ACTOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			System.out.println("ACTOR");
			break;
		}
	}
	private void RECEIVER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			System.out.println("RECEIVER");
			break;
		}
	}
	private void INT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			System.out.println("INT");
			break;
		}
	}
	private void CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			System.out.println("CHAR");
			break;
		}
	}
	private void QUIT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			System.out.println("QUIT");
			break;
		}
	}
	private void FOREACH_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			System.out.println("FOREACH");
			break;
		}
	}
	private void BREAK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			System.out.println("BREAK");
			break;
		}
	}
	private void IF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			System.out.println("IF");
			break;
		}
	}
	private void ELSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			System.out.println("ELSE");
			break;
		}
	}
	private void ELSEIF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			System.out.println("ELSEIF");
			break;
		}
	}
	private void SENDER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:
			System.out.println("SENDER");
			break;
		}
	}
	private void SELF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:
			System.out.println("SELF");
			break;
		}
	}
	private void IN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13:
			System.out.println("IN");
			break;
		}
	}
	private void BEGIN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14:
			System.out.println("BEGIN");
			break;
		}
	}
	private void END_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15:
			System.out.println("END");
			break;
		}
	}
	private void READ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16:
			System.out.println("READ");
			break;
		}
	}
	private void WRITE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17:
			System.out.println("WRITE");
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return ACTOR_sempred((RuleContext)_localctx, predIndex);
		case 2:
			return RECEIVER_sempred((RuleContext)_localctx, predIndex);
		case 3:
			return INT_sempred((RuleContext)_localctx, predIndex);
		case 4:
			return CHAR_sempred((RuleContext)_localctx, predIndex);
		case 5:
			return QUIT_sempred((RuleContext)_localctx, predIndex);
		case 6:
			return FOREACH_sempred((RuleContext)_localctx, predIndex);
		case 7:
			return BREAK_sempred((RuleContext)_localctx, predIndex);
		case 8:
			return IF_sempred((RuleContext)_localctx, predIndex);
		case 9:
			return ELSE_sempred((RuleContext)_localctx, predIndex);
		case 10:
			return ELSEIF_sempred((RuleContext)_localctx, predIndex);
		case 11:
			return SENDER_sempred((RuleContext)_localctx, predIndex);
		case 12:
			return SELF_sempred((RuleContext)_localctx, predIndex);
		case 13:
			return IN_sempred((RuleContext)_localctx, predIndex);
		case 14:
			return BEGIN_sempred((RuleContext)_localctx, predIndex);
		case 15:
			return END_sempred((RuleContext)_localctx, predIndex);
		case 16:
			return READ_sempred((RuleContext)_localctx, predIndex);
		case 17:
			return WRITE_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean ACTOR_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return getText().toLowerCase().equals("actor ");
		}
		return true;
	}
	private boolean RECEIVER_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return getText().toLowerCase().equals("receiver ");
		}
		return true;
	}
	private boolean INT_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return getText().toLowerCase().equals("int ");
		}
		return true;
	}
	private boolean CHAR_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return getText().toLowerCase().equals("char ");
		}
		return true;
	}
	private boolean QUIT_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return getText().toLowerCase().equals("quit ");
		}
		return true;
	}
	private boolean FOREACH_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return getText().toLowerCase().equals("foreach ");
		}
		return true;
	}
	private boolean BREAK_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return getText().toLowerCase().equals("break ");
		}
		return true;
	}
	private boolean IF_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return getText().toLowerCase().equals("if ");
		}
		return true;
	}
	private boolean ELSE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return getText().toLowerCase().equals("else ");
		}
		return true;
	}
	private boolean ELSEIF_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return getText().toLowerCase().equals("elseif ");
		}
		return true;
	}
	private boolean SENDER_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return getText().toLowerCase().equals("sender ");
		}
		return true;
	}
	private boolean SELF_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return getText().toLowerCase().equals("self ");
		}
		return true;
	}
	private boolean IN_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return getText().toLowerCase().equals("in ");
		}
		return true;
	}
	private boolean BEGIN_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return getText().toLowerCase().equals("begin ");
		}
		return true;
	}
	private boolean END_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return getText().toLowerCase().equals("end ");
		}
		return true;
	}
	private boolean READ_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return getText().toLowerCase().equals("read ");
		}
		return true;
	}
	private boolean WRITE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return getText().toLowerCase().equals("write ");
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u00d0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\3\2"+
		"\3\3\6\3\65\n\3\r\3\16\3\66\3\3\3\3\3\3\3\3\3\4\6\4>\n\4\r\4\16\4?\3\4"+
		"\3\4\3\4\3\4\3\5\6\5G\n\5\r\5\16\5H\3\5\3\5\3\5\3\5\3\6\6\6P\n\6\r\6\16"+
		"\6Q\3\6\3\6\3\6\3\6\3\7\6\7Y\n\7\r\7\16\7Z\3\7\3\7\3\7\3\7\3\b\6\bb\n"+
		"\b\r\b\16\bc\3\b\3\b\3\b\3\b\3\t\6\tk\n\t\r\t\16\tl\3\t\3\t\3\t\3\t\3"+
		"\n\6\nt\n\n\r\n\16\nu\3\n\3\n\3\n\3\n\3\13\6\13}\n\13\r\13\16\13~\3\13"+
		"\3\13\3\13\3\13\3\f\6\f\u0086\n\f\r\f\16\f\u0087\3\f\3\f\3\f\3\f\3\r\6"+
		"\r\u008f\n\r\r\r\16\r\u0090\3\r\3\r\3\r\3\r\3\16\6\16\u0098\n\16\r\16"+
		"\16\16\u0099\3\16\3\16\3\16\3\16\3\17\6\17\u00a1\n\17\r\17\16\17\u00a2"+
		"\3\17\3\17\3\17\3\17\3\20\6\20\u00aa\n\20\r\20\16\20\u00ab\3\20\3\20\3"+
		"\20\3\20\3\21\6\21\u00b3\n\21\r\21\16\21\u00b4\3\21\3\21\3\21\3\21\3\22"+
		"\6\22\u00bc\n\22\r\22\16\22\u00bd\3\22\3\22\3\22\3\22\3\23\6\23\u00c5"+
		"\n\23\r\23\16\23\u00c6\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\2\2\25"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25\3\2\4\4\2C\\c|\5\2\13\13\17\17\"\"\2\u00e1\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5\64\3\2\2\2\7=\3\2\2\2\tF\3\2\2\2"+
		"\13O\3\2\2\2\rX\3\2\2\2\17a\3\2\2\2\21j\3\2\2\2\23s\3\2\2\2\25|\3\2\2"+
		"\2\27\u0085\3\2\2\2\31\u008e\3\2\2\2\33\u0097\3\2\2\2\35\u00a0\3\2\2\2"+
		"\37\u00a9\3\2\2\2!\u00b2\3\2\2\2#\u00bb\3\2\2\2%\u00c4\3\2\2\2\'\u00cc"+
		"\3\2\2\2)-\7%\2\2*,\13\2\2\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2."+
		"\60\3\2\2\2/-\3\2\2\2\60\61\7\f\2\2\61\62\b\2\2\2\62\4\3\2\2\2\63\65\t"+
		"\2\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\678\3\2"+
		"\2\289\7\"\2\29:\6\3\2\2:;\b\3\3\2;\6\3\2\2\2<>\t\2\2\2=<\3\2\2\2>?\3"+
		"\2\2\2?=\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\7\"\2\2BC\6\4\3\2CD\b\4\4\2D\b"+
		"\3\2\2\2EG\t\2\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IJ\3\2\2\2J"+
		"K\7\"\2\2KL\6\5\4\2LM\b\5\5\2M\n\3\2\2\2NP\t\2\2\2ON\3\2\2\2PQ\3\2\2\2"+
		"QO\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7\"\2\2TU\6\6\5\2UV\b\6\6\2V\f\3\2\2"+
		"\2WY\t\2\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\7\""+
		"\2\2]^\6\7\6\2^_\b\7\7\2_\16\3\2\2\2`b\t\2\2\2a`\3\2\2\2bc\3\2\2\2ca\3"+
		"\2\2\2cd\3\2\2\2de\3\2\2\2ef\7\"\2\2fg\6\b\7\2gh\b\b\b\2h\20\3\2\2\2i"+
		"k\t\2\2\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\7\"\2\2"+
		"op\6\t\b\2pq\b\t\t\2q\22\3\2\2\2rt\t\2\2\2sr\3\2\2\2tu\3\2\2\2us\3\2\2"+
		"\2uv\3\2\2\2vw\3\2\2\2wx\7\"\2\2xy\6\n\t\2yz\b\n\n\2z\24\3\2\2\2{}\t\2"+
		"\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0081\7\"\2\2\u0081\u0082\6\13\n\2\u0082\u0083\b\13\13\2\u0083\26\3\2"+
		"\2\2\u0084\u0086\t\2\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\7\""+
		"\2\2\u008a\u008b\6\f\13\2\u008b\u008c\b\f\f\2\u008c\30\3\2\2\2\u008d\u008f"+
		"\t\2\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\7\"\2\2\u0093\u0094\6\r"+
		"\f\2\u0094\u0095\b\r\r\2\u0095\32\3\2\2\2\u0096\u0098\t\2\2\2\u0097\u0096"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009c\7\"\2\2\u009c\u009d\6\16\r\2\u009d\u009e\b"+
		"\16\16\2\u009e\34\3\2\2\2\u009f\u00a1\t\2\2\2\u00a0\u009f\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\u00a5\7\"\2\2\u00a5\u00a6\6\17\16\2\u00a6\u00a7\b\17\17\2\u00a7"+
		"\36\3\2\2\2\u00a8\u00aa\t\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2"+
		"\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae"+
		"\7\"\2\2\u00ae\u00af\6\20\17\2\u00af\u00b0\b\20\20\2\u00b0 \3\2\2\2\u00b1"+
		"\u00b3\t\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2"+
		"\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7\"\2\2\u00b7"+
		"\u00b8\6\21\20\2\u00b8\u00b9\b\21\21\2\u00b9\"\3\2\2\2\u00ba\u00bc\t\2"+
		"\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\7\"\2\2\u00c0\u00c1\6\22"+
		"\21\2\u00c1\u00c2\b\22\22\2\u00c2$\3\2\2\2\u00c3\u00c5\t\2\2\2\u00c4\u00c3"+
		"\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00c9\7\"\2\2\u00c9\u00ca\6\23\22\2\u00ca\u00cb\b"+
		"\23\23\2\u00cb&\3\2\2\2\u00cc\u00cd\t\3\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00cf\b\24\24\2\u00cf(\3\2\2\2\25\2-\66?HQZclu~\u0087\u0090\u0099\u00a2"+
		"\u00ab\u00b4\u00bd\u00c6\25\3\2\2\3\3\3\3\4\4\3\5\5\3\6\6\3\7\7\3\b\b"+
		"\3\t\t\3\n\n\3\13\13\3\f\f\3\r\r\3\16\16\3\17\17\3\20\20\3\21\21\3\22"+
		"\22\3\23\23\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}