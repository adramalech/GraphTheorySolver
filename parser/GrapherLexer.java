// Generated from Grapher.g4 by ANTLR 4.0
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrapherLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__21=1, T__20=2, T__19=3, T__18=4, T__17=5, T__16=6, T__15=7, T__14=8, 
		T__13=9, T__12=10, T__11=11, T__10=12, T__9=13, T__8=14, T__7=15, T__6=16, 
		T__5=17, T__4=18, T__3=19, T__2=20, T__1=21, T__0=22, ID=23, INT=24, WHITESPACE=25, 
		XML_COMMENT=26, SL_COMMENT=27, DOC_HTML=28, PRO_COMMENT=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'type='", "'value='", "'source'", "'vertices'", "'<'", "'edges'", "'capacity'", 
		"'id='", "'vertex'", "'</'", "'>'", "'weight'", "'graph'", "'/>'", "'sink'", 
		"'workspace'", "'t_node'", "'s_node'", "'dijkstra'", "'edmonds_karp'", 
		"'\"'", "'edge'", "ID", "INT", "WHITESPACE", "XML_COMMENT", "SL_COMMENT", 
		"DOC_HTML", "PRO_COMMENT"
	};
	public static final String[] ruleNames = {
		"T__21", "T__20", "T__19", "T__18", "T__17", "T__16", "T__15", "T__14", 
		"T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", 
		"T__4", "T__3", "T__2", "T__1", "T__0", "ID", "LETTER", "INT", "DIGIT", 
		"WHITESPACE", "XML_COMMENT", "SL_COMMENT", "DOC_HTML", "PRO_COMMENT"
	};


	public GrapherLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grapher.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 26: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;

		case 27: XML_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 28: SL_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 29: DOC_HTML_action((RuleContext)_localctx, actionIndex); break;

		case 30: PRO_COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void XML_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void DOC_HTML_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: skip();  break;
		}
	}
	private void SL_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void PRO_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\37\u0120\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\7\30\u00cd\n\30\f\30\16\30\u00d0\13\30\3\31\3"+
		"\31\3\32\3\32\7\32\u00d6\n\32\f\32\16\32\u00d9\13\32\3\33\3\33\3\34\6"+
		"\34\u00de\n\34\r\34\16\34\u00df\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\7\35\u00ea\n\35\f\35\16\35\u00ed\13\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\7\36\u00f9\n\36\f\36\16\36\u00fc\13\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0109\n\37\f\37\16"+
		"\37\u010c\13\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \7 \u0117\n \f \16"+
		" \u011a\13 \3 \3 \3 \3 \3 \6\u00eb\u00fa\u010a\u0118!\3\3\1\5\4\1\7\5"+
		"\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17"+
		"\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61"+
		"\2\1\63\32\1\65\2\1\67\33\29\34\3;\35\4=\36\5?\37\6\3\2\6\3\62;\4C\\c"+
		"|\3\62;\5\13\f\17\17\"\"\u0125\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\63\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2"+
		";\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5G\3\2\2\2\7N\3\2\2\2\tU\3"+
		"\2\2\2\13^\3\2\2\2\r`\3\2\2\2\17f\3\2\2\2\21o\3\2\2\2\23s\3\2\2\2\25z"+
		"\3\2\2\2\27}\3\2\2\2\31\177\3\2\2\2\33\u0086\3\2\2\2\35\u008c\3\2\2\2"+
		"\37\u008f\3\2\2\2!\u0094\3\2\2\2#\u009e\3\2\2\2%\u00a5\3\2\2\2\'\u00ac"+
		"\3\2\2\2)\u00b5\3\2\2\2+\u00c2\3\2\2\2-\u00c4\3\2\2\2/\u00c9\3\2\2\2\61"+
		"\u00d1\3\2\2\2\63\u00d3\3\2\2\2\65\u00da\3\2\2\2\67\u00dd\3\2\2\29\u00e3"+
		"\3\2\2\2;\u00f4\3\2\2\2=\u0101\3\2\2\2?\u0112\3\2\2\2AB\7v\2\2BC\7{\2"+
		"\2CD\7r\2\2DE\7g\2\2EF\7?\2\2F\4\3\2\2\2GH\7x\2\2HI\7c\2\2IJ\7n\2\2JK"+
		"\7w\2\2KL\7g\2\2LM\7?\2\2M\6\3\2\2\2NO\7u\2\2OP\7q\2\2PQ\7w\2\2QR\7t\2"+
		"\2RS\7e\2\2ST\7g\2\2T\b\3\2\2\2UV\7x\2\2VW\7g\2\2WX\7t\2\2XY\7v\2\2YZ"+
		"\7k\2\2Z[\7e\2\2[\\\7g\2\2\\]\7u\2\2]\n\3\2\2\2^_\7>\2\2_\f\3\2\2\2`a"+
		"\7g\2\2ab\7f\2\2bc\7i\2\2cd\7g\2\2de\7u\2\2e\16\3\2\2\2fg\7e\2\2gh\7c"+
		"\2\2hi\7r\2\2ij\7c\2\2jk\7e\2\2kl\7k\2\2lm\7v\2\2mn\7{\2\2n\20\3\2\2\2"+
		"op\7k\2\2pq\7f\2\2qr\7?\2\2r\22\3\2\2\2st\7x\2\2tu\7g\2\2uv\7t\2\2vw\7"+
		"v\2\2wx\7g\2\2xy\7z\2\2y\24\3\2\2\2z{\7>\2\2{|\7\61\2\2|\26\3\2\2\2}~"+
		"\7@\2\2~\30\3\2\2\2\177\u0080\7y\2\2\u0080\u0081\7g\2\2\u0081\u0082\7"+
		"k\2\2\u0082\u0083\7i\2\2\u0083\u0084\7j\2\2\u0084\u0085\7v\2\2\u0085\32"+
		"\3\2\2\2\u0086\u0087\7i\2\2\u0087\u0088\7t\2\2\u0088\u0089\7c\2\2\u0089"+
		"\u008a\7r\2\2\u008a\u008b\7j\2\2\u008b\34\3\2\2\2\u008c\u008d\7\61\2\2"+
		"\u008d\u008e\7@\2\2\u008e\36\3\2\2\2\u008f\u0090\7u\2\2\u0090\u0091\7"+
		"k\2\2\u0091\u0092\7p\2\2\u0092\u0093\7m\2\2\u0093 \3\2\2\2\u0094\u0095"+
		"\7y\2\2\u0095\u0096\7q\2\2\u0096\u0097\7t\2\2\u0097\u0098\7m\2\2\u0098"+
		"\u0099\7u\2\2\u0099\u009a\7r\2\2\u009a\u009b\7c\2\2\u009b\u009c\7e\2\2"+
		"\u009c\u009d\7g\2\2\u009d\"\3\2\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7a"+
		"\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7f\2\2\u00a3\u00a4"+
		"\7g\2\2\u00a4$\3\2\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a7\7a\2\2\u00a7\u00a8"+
		"\7p\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7f\2\2\u00aa\u00ab\7g\2\2\u00ab"+
		"&\3\2\2\2\u00ac\u00ad\7f\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7l\2\2\u00af"+
		"\u00b0\7m\2\2\u00b0\u00b1\7u\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7t\2\2"+
		"\u00b3\u00b4\7c\2\2\u00b4(\3\2\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7f\2"+
		"\2\u00b7\u00b8\7o\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb"+
		"\7f\2\2\u00bb\u00bc\7u\2\2\u00bc\u00bd\7a\2\2\u00bd\u00be\7m\2\2\u00be"+
		"\u00bf\7c\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7r\2\2\u00c1*\3\2\2\2\u00c2"+
		"\u00c3\7$\2\2\u00c3,\3\2\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7f\2\2\u00c6"+
		"\u00c7\7i\2\2\u00c7\u00c8\7g\2\2\u00c8.\3\2\2\2\u00c9\u00ce\5\61\31\2"+
		"\u00ca\u00cd\5\61\31\2\u00cb\u00cd\t\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb"+
		"\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\60\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\t\3\2\2\u00d2\62\3\2\2\2\u00d3"+
		"\u00d7\5\65\33\2\u00d4\u00d6\5\65\33\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9"+
		"\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\64\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00da\u00db\t\4\2\2\u00db\66\3\2\2\2\u00dc\u00de\t\5\2"+
		"\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0"+
		"\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\b\34\2\2\u00e28\3\2\2\2\u00e3"+
		"\u00e4\7>\2\2\u00e4\u00e5\7#\2\2\u00e5\u00e6\7/\2\2\u00e6\u00e7\7/\2\2"+
		"\u00e7\u00eb\3\2\2\2\u00e8\u00ea\13\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ee\u00ef\7/\2\2\u00ef\u00f0\7/\2\2\u00f0\u00f1\7@\2"+
		"\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\b\35\3\2\u00f3:\3\2\2\2\u00f4\u00f5"+
		"\7\61\2\2\u00f5\u00f6\7\61\2\2\u00f6\u00fa\3\2\2\2\u00f7\u00f9\13\2\2"+
		"\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fa\u00f8"+
		"\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\7\f\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0100\b\36\4\2\u0100<\3\2\2\2\u0101\u0102\7>\2\2"+
		"\u0102\u0103\7A\2\2\u0103\u0104\7z\2\2\u0104\u0105\7o\2\2\u0105\u0106"+
		"\7n\2\2\u0106\u010a\3\2\2\2\u0107\u0109\13\2\2\2\u0108\u0107\3\2\2\2\u0109"+
		"\u010c\3\2\2\2\u010a\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010d\3\2"+
		"\2\2\u010c\u010a\3\2\2\2\u010d\u010e\7A\2\2\u010e\u010f\7@\2\2\u010f\u0110"+
		"\3\2\2\2\u0110\u0111\b\37\5\2\u0111>\3\2\2\2\u0112\u0113\7>\2\2\u0113"+
		"\u0114\7A\2\2\u0114\u0118\3\2\2\2\u0115\u0117\13\2\2\2\u0116\u0115\3\2"+
		"\2\2\u0117\u011a\3\2\2\2\u0118\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119"+
		"\u011b\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\7A\2\2\u011c\u011d\7@\2"+
		"\2\u011d\u011e\3\2\2\2\u011e\u011f\b \6\2\u011f@\3\2\2\2\13\2\u00cc\u00ce"+
		"\u00d7\u00df\u00eb\u00fa\u010a\u0118";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}