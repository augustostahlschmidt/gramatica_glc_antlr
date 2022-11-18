package output;

// $ANTLR 3.5.1 C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g 2022-11-18 18:30:18

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class GramaticaLexer extends Lexer {
	public static final int EOF=-1;
	public static final int CONST=4;
	public static final int DIF=5;
	public static final int DIVI=6;
	public static final int DO=7;
	public static final int ELSE=8;
	public static final int IF=9;
	public static final int IGUAL=10;
	public static final int L_PAREN=11;
	public static final int MAIOR=12;
	public static final int MAIOR_IGUAL=13;
	public static final int MENOR=14;
	public static final int MENOR_IGUAL=15;
	public static final int MULT=16;
	public static final int OPERADOR_ATRIBUICAO=17;
	public static final int RETURN=18;
	public static final int R_PAREN=19;
	public static final int SEMICOLON=20;
	public static final int SOMA=21;
	public static final int SUBT=22;
	public static final int THEN=23;
	public static final int VAR=24;
	public static final int WHILE=25;
	public static final int WS=26;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public GramaticaLexer() {} 
	public GramaticaLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public GramaticaLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g"; }

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:73:4: ( 'do' )
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:73:6: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:74:6: ( 'else' )
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:74:8: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:75:4: ( 'if' )
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:75:6: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "RETURN"
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:76:8: ( 'return' )
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:76:10: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:77:7: ( 'while' )
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:77:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:78:6: ( 'then' )
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:78:8: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "SOMA"
	public final void mSOMA() throws RecognitionException {
		try {
			int _type = SOMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:79:7: ( '+' )
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:79:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SOMA"

	// $ANTLR start "SUBT"
	public final void mSUBT() throws RecognitionException {
		try {
			int _type = SUBT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:80:6: ( '-' )
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:80:8: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUBT"

	// $ANTLR start "MULT"
	public final void mMULT() throws RecognitionException {
		try {
			int _type = MULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:81:6: ( '*' )
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:81:8: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULT"

	// $ANTLR start "DIVI"
	public final void mDIVI() throws RecognitionException {
		try {
			int _type = DIVI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:82:6: ( '/' )
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:82:8: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIVI"

	// $ANTLR start "L_PAREN"
	public final void mL_PAREN() throws RecognitionException {
		try {
			int _type = L_PAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:83:9: ( '(' )
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:83:11: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "L_PAREN"

	// $ANTLR start "R_PAREN"
	public final void mR_PAREN() throws RecognitionException {
		try {
			int _type = R_PAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:84:9: ( ')' )
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:84:11: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "R_PAREN"

	// $ANTLR start "IGUAL"
	public final void mIGUAL() throws RecognitionException {
		try {
			int _type = IGUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:85:8: ( '=' )
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:85:10: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IGUAL"

	// $ANTLR start "DIF"
	public final void mDIF() throws RecognitionException {
		try {
			int _type = DIF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:86:5: ( '<>' )
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:86:7: '<>'
			{
			match("<>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIF"

	// $ANTLR start "MAIOR"
	public final void mMAIOR() throws RecognitionException {
		try {
			int _type = MAIOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:87:7: ( '>' )
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:87:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAIOR"

	// $ANTLR start "MENOR"
	public final void mMENOR() throws RecognitionException {
		try {
			int _type = MENOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:88:7: ( '<' )
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:88:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MENOR"

	// $ANTLR start "MAIOR_IGUAL"
	public final void mMAIOR_IGUAL() throws RecognitionException {
		try {
			int _type = MAIOR_IGUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:90:2: ( '>=' )
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:90:4: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAIOR_IGUAL"

	// $ANTLR start "MENOR_IGUAL"
	public final void mMENOR_IGUAL() throws RecognitionException {
		try {
			int _type = MENOR_IGUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:92:2: ( '<=' )
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:92:4: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MENOR_IGUAL"

	// $ANTLR start "OPERADOR_ATRIBUICAO"
	public final void mOPERADOR_ATRIBUICAO() throws RecognitionException {
		try {
			int _type = OPERADOR_ATRIBUICAO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:95:20: ( ':=' )
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:95:22: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPERADOR_ATRIBUICAO"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:97:10: ( ';' )
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:97:12: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "CONST"
	public final void mCONST() throws RecognitionException {
		try {
			int _type = CONST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:99:7: ( ( '0' .. '9' )+ )
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:99:9: ( '0' .. '9' )+
			{
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:99:9: ( '0' .. '9' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONST"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:100:6: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:100:8: ( 'a' .. 'z' | 'A' .. 'Z' )+
			{
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:100:8: ( 'a' .. 'z' | 'A' .. 'Z' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:102:5: ( ( ' ' | '\\n' | '\\r' | '\\t' )+ )
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:102:7: ( ' ' | '\\n' | '\\r' | '\\t' )+
			{
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:102:7: ( ' ' | '\\n' | '\\r' | '\\t' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||LA3_0=='\r'||LA3_0==' ') ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:1:8: ( DO | ELSE | IF | RETURN | WHILE | THEN | SOMA | SUBT | MULT | DIVI | L_PAREN | R_PAREN | IGUAL | DIF | MAIOR | MENOR | MAIOR_IGUAL | MENOR_IGUAL | OPERADOR_ATRIBUICAO | SEMICOLON | CONST | VAR | WS )
		int alt4=23;
		switch ( input.LA(1) ) {
		case 'd':
			{
			int LA4_1 = input.LA(2);
			if ( (LA4_1=='o') ) {
				int LA4_21 = input.LA(3);
				if ( ((LA4_21 >= 'A' && LA4_21 <= 'Z')||(LA4_21 >= 'a' && LA4_21 <= 'z')) ) {
					alt4=22;
				}

				else {
					alt4=1;
				}

			}

			else {
				alt4=22;
			}

			}
			break;
		case 'e':
			{
			int LA4_2 = input.LA(2);
			if ( (LA4_2=='l') ) {
				int LA4_22 = input.LA(3);
				if ( (LA4_22=='s') ) {
					int LA4_33 = input.LA(4);
					if ( (LA4_33=='e') ) {
						int LA4_38 = input.LA(5);
						if ( ((LA4_38 >= 'A' && LA4_38 <= 'Z')||(LA4_38 >= 'a' && LA4_38 <= 'z')) ) {
							alt4=22;
						}

						else {
							alt4=2;
						}

					}

					else {
						alt4=22;
					}

				}

				else {
					alt4=22;
				}

			}

			else {
				alt4=22;
			}

			}
			break;
		case 'i':
			{
			int LA4_3 = input.LA(2);
			if ( (LA4_3=='f') ) {
				int LA4_23 = input.LA(3);
				if ( ((LA4_23 >= 'A' && LA4_23 <= 'Z')||(LA4_23 >= 'a' && LA4_23 <= 'z')) ) {
					alt4=22;
				}

				else {
					alt4=3;
				}

			}

			else {
				alt4=22;
			}

			}
			break;
		case 'r':
			{
			int LA4_4 = input.LA(2);
			if ( (LA4_4=='e') ) {
				int LA4_24 = input.LA(3);
				if ( (LA4_24=='t') ) {
					int LA4_35 = input.LA(4);
					if ( (LA4_35=='u') ) {
						int LA4_39 = input.LA(5);
						if ( (LA4_39=='r') ) {
							int LA4_43 = input.LA(6);
							if ( (LA4_43=='n') ) {
								int LA4_46 = input.LA(7);
								if ( ((LA4_46 >= 'A' && LA4_46 <= 'Z')||(LA4_46 >= 'a' && LA4_46 <= 'z')) ) {
									alt4=22;
								}

								else {
									alt4=4;
								}

							}

							else {
								alt4=22;
							}

						}

						else {
							alt4=22;
						}

					}

					else {
						alt4=22;
					}

				}

				else {
					alt4=22;
				}

			}

			else {
				alt4=22;
			}

			}
			break;
		case 'w':
			{
			int LA4_5 = input.LA(2);
			if ( (LA4_5=='h') ) {
				int LA4_25 = input.LA(3);
				if ( (LA4_25=='i') ) {
					int LA4_36 = input.LA(4);
					if ( (LA4_36=='l') ) {
						int LA4_40 = input.LA(5);
						if ( (LA4_40=='e') ) {
							int LA4_44 = input.LA(6);
							if ( ((LA4_44 >= 'A' && LA4_44 <= 'Z')||(LA4_44 >= 'a' && LA4_44 <= 'z')) ) {
								alt4=22;
							}

							else {
								alt4=5;
							}

						}

						else {
							alt4=22;
						}

					}

					else {
						alt4=22;
					}

				}

				else {
					alt4=22;
				}

			}

			else {
				alt4=22;
			}

			}
			break;
		case 't':
			{
			int LA4_6 = input.LA(2);
			if ( (LA4_6=='h') ) {
				int LA4_26 = input.LA(3);
				if ( (LA4_26=='e') ) {
					int LA4_37 = input.LA(4);
					if ( (LA4_37=='n') ) {
						int LA4_41 = input.LA(5);
						if ( ((LA4_41 >= 'A' && LA4_41 <= 'Z')||(LA4_41 >= 'a' && LA4_41 <= 'z')) ) {
							alt4=22;
						}

						else {
							alt4=6;
						}

					}

					else {
						alt4=22;
					}

				}

				else {
					alt4=22;
				}

			}

			else {
				alt4=22;
			}

			}
			break;
		case '+':
			{
			alt4=7;
			}
			break;
		case '-':
			{
			alt4=8;
			}
			break;
		case '*':
			{
			alt4=9;
			}
			break;
		case '/':
			{
			alt4=10;
			}
			break;
		case '(':
			{
			alt4=11;
			}
			break;
		case ')':
			{
			alt4=12;
			}
			break;
		case '=':
			{
			alt4=13;
			}
			break;
		case '<':
			{
			switch ( input.LA(2) ) {
			case '>':
				{
				alt4=14;
				}
				break;
			case '=':
				{
				alt4=18;
				}
				break;
			default:
				alt4=16;
			}
			}
			break;
		case '>':
			{
			int LA4_15 = input.LA(2);
			if ( (LA4_15=='=') ) {
				alt4=17;
			}

			else {
				alt4=15;
			}

			}
			break;
		case ':':
			{
			alt4=19;
			}
			break;
		case ';':
			{
			alt4=20;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt4=21;
			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'f':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 's':
		case 'u':
		case 'v':
		case 'x':
		case 'y':
		case 'z':
			{
			alt4=22;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt4=23;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 4, 0, input);
			throw nvae;
		}
		switch (alt4) {
			case 1 :
				// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:1:10: DO
				{
				mDO(); 

				}
				break;
			case 2 :
				// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:1:13: ELSE
				{
				mELSE(); 

				}
				break;
			case 3 :
				// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:1:18: IF
				{
				mIF(); 

				}
				break;
			case 4 :
				// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:1:21: RETURN
				{
				mRETURN(); 

				}
				break;
			case 5 :
				// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:1:28: WHILE
				{
				mWHILE(); 

				}
				break;
			case 6 :
				// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:1:34: THEN
				{
				mTHEN(); 

				}
				break;
			case 7 :
				// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:1:39: SOMA
				{
				mSOMA(); 

				}
				break;
			case 8 :
				// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:1:44: SUBT
				{
				mSUBT(); 

				}
				break;
			case 9 :
				// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:1:49: MULT
				{
				mMULT(); 

				}
				break;
			case 10 :
				// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:1:54: DIVI
				{
				mDIVI(); 

				}
				break;
			case 11 :
				// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:1:59: L_PAREN
				{
				mL_PAREN(); 

				}
				break;
			case 12 :
				// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:1:67: R_PAREN
				{
				mR_PAREN(); 

				}
				break;
			case 13 :
				// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:1:75: IGUAL
				{
				mIGUAL(); 

				}
				break;
			case 14 :
				// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:1:81: DIF
				{
				mDIF(); 

				}
				break;
			case 15 :
				// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:1:85: MAIOR
				{
				mMAIOR(); 

				}
				break;
			case 16 :
				// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:1:91: MENOR
				{
				mMENOR(); 

				}
				break;
			case 17 :
				// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:1:97: MAIOR_IGUAL
				{
				mMAIOR_IGUAL(); 

				}
				break;
			case 18 :
				// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:1:109: MENOR_IGUAL
				{
				mMENOR_IGUAL(); 

				}
				break;
			case 19 :
				// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:1:121: OPERADOR_ATRIBUICAO
				{
				mOPERADOR_ATRIBUICAO(); 

				}
				break;
			case 20 :
				// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:1:141: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 21 :
				// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:1:151: CONST
				{
				mCONST(); 

				}
				break;
			case 22 :
				// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:1:157: VAR
				{
				mVAR(); 

				}
				break;
			case 23 :
				// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:1:161: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
