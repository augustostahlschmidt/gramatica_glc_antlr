package output;

// $ANTLR 3.5.1 C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g 2022-11-18 18:30:18

    import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class GramaticaParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CONST", "DIF", "DIVI", "DO", 
		"ELSE", "IF", "IGUAL", "L_PAREN", "MAIOR", "MAIOR_IGUAL", "MENOR", "MENOR_IGUAL", 
		"MULT", "OPERADOR_ATRIBUICAO", "RETURN", "R_PAREN", "SEMICOLON", "SOMA", 
		"SUBT", "THEN", "VAR", "WHILE", "WS"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public GramaticaParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public GramaticaParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return GramaticaParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g"; }


	    HashMap<String, Double> ids = new HashMap<>();



	// $ANTLR start "programa"
	// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:15:1: programa : ( comando )+ ;
	public final void programa() throws RecognitionException {
		try {
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:16:2: ( ( comando )+ )
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:16:4: ( comando )+
			{
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:16:4: ( comando )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				switch ( input.LA(1) ) {
				case VAR:
					{
					alt1=1;
					}
					break;
				case IF:
					{
					alt1=1;
					}
					break;
				case WHILE:
					{
					alt1=1;
					}
					break;
				}
				switch (alt1) {
				case 1 :
					// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:16:4: comando
					{
					pushFollow(FOLLOW_comando_in_programa38);
					comando();
					state._fsp--;

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

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "programa"



	// $ANTLR start "comando"
	// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:19:1: comando : ( atribuicao SEMICOLON | teste | iteracao );
	public final void comando() throws RecognitionException {
		try {
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:20:2: ( atribuicao SEMICOLON | teste | iteracao )
			int alt2=3;
			switch ( input.LA(1) ) {
			case VAR:
				{
				alt2=1;
				}
				break;
			case IF:
				{
				alt2=2;
				}
				break;
			case WHILE:
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:20:4: atribuicao SEMICOLON
					{
					pushFollow(FOLLOW_atribuicao_in_comando52);
					atribuicao();
					state._fsp--;

					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_comando54); 
					}
					break;
				case 2 :
					// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:21:4: teste
					{
					pushFollow(FOLLOW_teste_in_comando59);
					teste();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:22:4: iteracao
					{
					pushFollow(FOLLOW_iteracao_in_comando64);
					iteracao();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "comando"



	// $ANTLR start "atribuicao"
	// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:25:1: atribuicao : VAR OPERADOR_ATRIBUICAO e= expressao_aritmetica ;
	public final void atribuicao() throws RecognitionException {
		Token VAR1=null;
		double e =0.0;

		try {
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:26:2: ( VAR OPERADOR_ATRIBUICAO e= expressao_aritmetica )
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:26:4: VAR OPERADOR_ATRIBUICAO e= expressao_aritmetica
			{
			VAR1=(Token)match(input,VAR,FOLLOW_VAR_in_atribuicao75); 
			 System.out.println("Variavel: " + (VAR1!=null?VAR1.getText():null)); 
			match(input,OPERADOR_ATRIBUICAO,FOLLOW_OPERADOR_ATRIBUICAO_in_atribuicao80); 
			pushFollow(FOLLOW_expressao_aritmetica_in_atribuicao86);
			e=expressao_aritmetica();
			state._fsp--;


					if(ids.containsKey((VAR1!=null?VAR1.getText():null))){
						System.out.println("Id atualizado: " + (VAR1!=null?VAR1.getText():null) + " = " + e);
					}else {
						System.out.println("Id novo inserido: " + (VAR1!=null?VAR1.getText():null) + " = " + e);
					}
					ids.put((VAR1!=null?VAR1.getText():null), new Double(e)); 
				
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "atribuicao"



	// $ANTLR start "teste"
	// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:39:1: teste : IF expressao_relacional THEN programa ( ELSE programa )? ;
	public final void teste() throws RecognitionException {
		try {
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:40:2: ( IF expressao_relacional THEN programa ( ELSE programa )? )
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:40:4: IF expressao_relacional THEN programa ( ELSE programa )?
			{
			match(input,IF,FOLLOW_IF_in_teste101); 
			pushFollow(FOLLOW_expressao_relacional_in_teste103);
			expressao_relacional();
			state._fsp--;

			match(input,THEN,FOLLOW_THEN_in_teste105); 
			pushFollow(FOLLOW_programa_in_teste107);
			programa();
			state._fsp--;

			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:40:42: ( ELSE programa )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==ELSE) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:40:43: ELSE programa
					{
					match(input,ELSE,FOLLOW_ELSE_in_teste110); 
					pushFollow(FOLLOW_programa_in_teste112);
					programa();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "teste"



	// $ANTLR start "iteracao"
	// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:43:1: iteracao : WHILE expressao_relacional DO programa ;
	public final void iteracao() throws RecognitionException {
		try {
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:44:2: ( WHILE expressao_relacional DO programa )
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:44:4: WHILE expressao_relacional DO programa
			{
			match(input,WHILE,FOLLOW_WHILE_in_iteracao128); 
			pushFollow(FOLLOW_expressao_relacional_in_iteracao130);
			expressao_relacional();
			state._fsp--;

			match(input,DO,FOLLOW_DO_in_iteracao132); 
			pushFollow(FOLLOW_programa_in_iteracao134);
			programa();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "iteracao"



	// $ANTLR start "expressao_aritmetica"
	// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:47:1: expressao_aritmetica returns [ double v ] : ( ( CONST | VAR ) ( SOMA e= expressao_aritmetica | SUBT e= expressao_aritmetica | MULT e= expressao_aritmetica | DIVI e= expressao_aritmetica )? | L_PAREN e= expressao_aritmetica R_PAREN );
	public final double expressao_aritmetica() throws RecognitionException {
		double v = 0.0;


		Token CONST2=null;
		Token VAR3=null;
		double e =0.0;

		try {
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:48:2: ( ( CONST | VAR ) ( SOMA e= expressao_aritmetica | SUBT e= expressao_aritmetica | MULT e= expressao_aritmetica | DIVI e= expressao_aritmetica )? | L_PAREN e= expressao_aritmetica R_PAREN )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==CONST||LA6_0==VAR) ) {
				alt6=1;
			}
			else if ( (LA6_0==L_PAREN) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:49:2: ( CONST | VAR ) ( SOMA e= expressao_aritmetica | SUBT e= expressao_aritmetica | MULT e= expressao_aritmetica | DIVI e= expressao_aritmetica )?
					{
					// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:49:2: ( CONST | VAR )
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==CONST) ) {
						alt4=1;
					}
					else if ( (LA4_0==VAR) ) {
						alt4=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}

					switch (alt4) {
						case 1 :
							// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:50:2: CONST
							{
							CONST2=(Token)match(input,CONST,FOLLOW_CONST_in_expressao_aritmetica156); 
							 v = Double.parseDouble((CONST2!=null?CONST2.getText():null)); 
							System.out.println("Constante: " + v);
							}
							break;
						case 2 :
							// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:51:4: VAR
							{
							VAR3=(Token)match(input,VAR,FOLLOW_VAR_in_expressao_aritmetica165); 
							 v = ids.getOrDefault((VAR3!=null?VAR3.getText():null), 0.0); 
							System.out.println("Variavel: " + (VAR3!=null?VAR3.getText():null) + " = " + v);
							}
							break;

					}

					// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:53:2: ( SOMA e= expressao_aritmetica | SUBT e= expressao_aritmetica | MULT e= expressao_aritmetica | DIVI e= expressao_aritmetica )?
					int alt5=5;
					switch ( input.LA(1) ) {
						case SOMA:
							{
							alt5=1;
							}
							break;
						case SUBT:
							{
							alt5=2;
							}
							break;
						case MULT:
							{
							alt5=3;
							}
							break;
						case DIVI:
							{
							alt5=4;
							}
							break;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:53:4: SOMA e= expressao_aritmetica
							{
							System.out.println("Operacao: +");
							match(input,SOMA,FOLLOW_SOMA_in_expressao_aritmetica179); 
							pushFollow(FOLLOW_expressao_aritmetica_in_expressao_aritmetica185);
							e=expressao_aritmetica();
							state._fsp--;

							System.out.println("Calculo: "+v+" + "+e);
							v += e;
							System.out.println("Resultado da soma: " + v);
							}
							break;
						case 2 :
							// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:54:4: SUBT e= expressao_aritmetica
							{
							System.out.println("Operacao: -");
							match(input,SUBT,FOLLOW_SUBT_in_expressao_aritmetica198); 
							pushFollow(FOLLOW_expressao_aritmetica_in_expressao_aritmetica204);
							e=expressao_aritmetica();
							state._fsp--;

							System.out.println("Calculo: "+v+" - "+e);
							v -= e;
							System.out.println("Resultado da subtracao: " + v);
							}
							break;
						case 3 :
							// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:55:4: MULT e= expressao_aritmetica
							{
							System.out.println("Operacao: *");
							match(input,MULT,FOLLOW_MULT_in_expressao_aritmetica217); 
							pushFollow(FOLLOW_expressao_aritmetica_in_expressao_aritmetica223);
							e=expressao_aritmetica();
							state._fsp--;

							System.out.println("Calculo: "+v+" * "+e);
							v *= e;
							System.out.println("Resultado da multiplicao: " + v);
							}
							break;
						case 4 :
							// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:56:4: DIVI e= expressao_aritmetica
							{
							System.out.println("Operacao: /");
							match(input,DIVI,FOLLOW_DIVI_in_expressao_aritmetica236); 
							pushFollow(FOLLOW_expressao_aritmetica_in_expressao_aritmetica242);
							e=expressao_aritmetica();
							state._fsp--;

							System.out.println("Calculo: "+v+" / "+e);
							v /= e;
							System.out.println("Resultado da divisao: " + v);
							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:58:4: L_PAREN e= expressao_aritmetica R_PAREN
					{
					match(input,L_PAREN,FOLLOW_L_PAREN_in_expressao_aritmetica257); 
					pushFollow(FOLLOW_expressao_aritmetica_in_expressao_aritmetica263);
					e=expressao_aritmetica();
					state._fsp--;

					v = e;
					match(input,R_PAREN,FOLLOW_R_PAREN_in_expressao_aritmetica267); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return v;
	}
	// $ANTLR end "expressao_aritmetica"



	// $ANTLR start "expressao_relacional"
	// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:61:1: expressao_relacional returns [ boolean t ] : (e= expressao_aritmetica ) ( IGUAL d= expressao_aritmetica | DIF d= expressao_aritmetica | MENOR d= expressao_aritmetica | MAIOR d= expressao_aritmetica | MENOR_IGUAL d= expressao_aritmetica | MAIOR_IGUAL d= expressao_aritmetica ) ;
	public final boolean expressao_relacional() throws RecognitionException {
		boolean t = false;


		double e =0.0;
		double d =0.0;

		try {
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:62:2: ( (e= expressao_aritmetica ) ( IGUAL d= expressao_aritmetica | DIF d= expressao_aritmetica | MENOR d= expressao_aritmetica | MAIOR d= expressao_aritmetica | MENOR_IGUAL d= expressao_aritmetica | MAIOR_IGUAL d= expressao_aritmetica ) )
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:63:2: (e= expressao_aritmetica ) ( IGUAL d= expressao_aritmetica | DIF d= expressao_aritmetica | MENOR d= expressao_aritmetica | MAIOR d= expressao_aritmetica | MENOR_IGUAL d= expressao_aritmetica | MAIOR_IGUAL d= expressao_aritmetica )
			{
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:63:2: (e= expressao_aritmetica )
			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:63:4: e= expressao_aritmetica
			{
			pushFollow(FOLLOW_expressao_aritmetica_in_expressao_relacional290);
			e=expressao_aritmetica();
			state._fsp--;

			}

			// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:64:2: ( IGUAL d= expressao_aritmetica | DIF d= expressao_aritmetica | MENOR d= expressao_aritmetica | MAIOR d= expressao_aritmetica | MENOR_IGUAL d= expressao_aritmetica | MAIOR_IGUAL d= expressao_aritmetica )
			int alt7=6;
			switch ( input.LA(1) ) {
			case IGUAL:
				{
				alt7=1;
				}
				break;
			case DIF:
				{
				alt7=2;
				}
				break;
			case MENOR:
				{
				alt7=3;
				}
				break;
			case MAIOR:
				{
				alt7=4;
				}
				break;
			case MENOR_IGUAL:
				{
				alt7=5;
				}
				break;
			case MAIOR_IGUAL:
				{
				alt7=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:64:4: IGUAL d= expressao_aritmetica
					{
					System.out.println("Expressao relacional: = " );
					match(input,IGUAL,FOLLOW_IGUAL_in_expressao_relacional300); 
					pushFollow(FOLLOW_expressao_aritmetica_in_expressao_relacional306);
					d=expressao_aritmetica();
					state._fsp--;

					t = e == d;
					System.out.println("Resultado Expressao relacional: " + e + " = "  + d + " : " + t);
					}
					break;
				case 2 :
					// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:65:4: DIF d= expressao_aritmetica
					{
					System.out.println("Expressao relacional: <>" );
					match(input,DIF,FOLLOW_DIF_in_expressao_relacional318); 
					pushFollow(FOLLOW_expressao_aritmetica_in_expressao_relacional324);
					d=expressao_aritmetica();
					state._fsp--;

					t = e != d;
					System.out.println("Resultado Expressao relacional: " + e + " <> " + d + " : " + t);
					}
					break;
				case 3 :
					// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:66:4: MENOR d= expressao_aritmetica
					{
					System.out.println("Expressao relacional: < " );
					match(input,MENOR,FOLLOW_MENOR_in_expressao_relacional336); 
					pushFollow(FOLLOW_expressao_aritmetica_in_expressao_relacional342);
					d=expressao_aritmetica();
					state._fsp--;

					t = e <  d;
					System.out.println("Resultado Expressao relacional: " + e + " < "  + d + " : " + t);
					}
					break;
				case 4 :
					// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:67:4: MAIOR d= expressao_aritmetica
					{
					System.out.println("Expressao relacional: > " );
					match(input,MAIOR,FOLLOW_MAIOR_in_expressao_relacional353); 
					pushFollow(FOLLOW_expressao_aritmetica_in_expressao_relacional359);
					d=expressao_aritmetica();
					state._fsp--;

					t = e >  d;
					System.out.println("Resultado Expressao relacional: " + e + " > "  + d + " : " + t);
					}
					break;
				case 5 :
					// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:68:4: MENOR_IGUAL d= expressao_aritmetica
					{
					System.out.println("Expressao relacional: <=" );
					match(input,MENOR_IGUAL,FOLLOW_MENOR_IGUAL_in_expressao_relacional371); 
					pushFollow(FOLLOW_expressao_aritmetica_in_expressao_relacional377);
					d=expressao_aritmetica();
					state._fsp--;

					t = e <= d;
					System.out.println("Resultado Expressao relacional: " + e + " <= " + d + " : " + t);
					}
					break;
				case 6 :
					// C:\\Users\\Guto\\eclipse-workspace\\GramaticaTradutores\\Gramatica.g:69:4: MAIOR_IGUAL d= expressao_aritmetica
					{
					System.out.println("Expressao relacional: >=" );
					match(input,MAIOR_IGUAL,FOLLOW_MAIOR_IGUAL_in_expressao_relacional388); 
					pushFollow(FOLLOW_expressao_aritmetica_in_expressao_relacional394);
					d=expressao_aritmetica();
					state._fsp--;

					t = e >= d;
					System.out.println("Resultado Expressao relacional: " + e + " >= " + d + " : " + t);
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "expressao_relacional"

	// Delegated rules



	public static final BitSet FOLLOW_comando_in_programa38 = new BitSet(new long[]{0x0000000003000202L});
	public static final BitSet FOLLOW_atribuicao_in_comando52 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_SEMICOLON_in_comando54 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_teste_in_comando59 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iteracao_in_comando64 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atribuicao75 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_OPERADOR_ATRIBUICAO_in_atribuicao80 = new BitSet(new long[]{0x0000000001000810L});
	public static final BitSet FOLLOW_expressao_aritmetica_in_atribuicao86 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_teste101 = new BitSet(new long[]{0x0000000001000810L});
	public static final BitSet FOLLOW_expressao_relacional_in_teste103 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_THEN_in_teste105 = new BitSet(new long[]{0x0000000003000200L});
	public static final BitSet FOLLOW_programa_in_teste107 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_ELSE_in_teste110 = new BitSet(new long[]{0x0000000003000200L});
	public static final BitSet FOLLOW_programa_in_teste112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_iteracao128 = new BitSet(new long[]{0x0000000001000810L});
	public static final BitSet FOLLOW_expressao_relacional_in_iteracao130 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_DO_in_iteracao132 = new BitSet(new long[]{0x0000000003000200L});
	public static final BitSet FOLLOW_programa_in_iteracao134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_expressao_aritmetica156 = new BitSet(new long[]{0x0000000000610042L});
	public static final BitSet FOLLOW_VAR_in_expressao_aritmetica165 = new BitSet(new long[]{0x0000000000610042L});
	public static final BitSet FOLLOW_SOMA_in_expressao_aritmetica179 = new BitSet(new long[]{0x0000000001000810L});
	public static final BitSet FOLLOW_expressao_aritmetica_in_expressao_aritmetica185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUBT_in_expressao_aritmetica198 = new BitSet(new long[]{0x0000000001000810L});
	public static final BitSet FOLLOW_expressao_aritmetica_in_expressao_aritmetica204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_expressao_aritmetica217 = new BitSet(new long[]{0x0000000001000810L});
	public static final BitSet FOLLOW_expressao_aritmetica_in_expressao_aritmetica223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIVI_in_expressao_aritmetica236 = new BitSet(new long[]{0x0000000001000810L});
	public static final BitSet FOLLOW_expressao_aritmetica_in_expressao_aritmetica242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_L_PAREN_in_expressao_aritmetica257 = new BitSet(new long[]{0x0000000001000810L});
	public static final BitSet FOLLOW_expressao_aritmetica_in_expressao_aritmetica263 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_R_PAREN_in_expressao_aritmetica267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressao_aritmetica_in_expressao_relacional290 = new BitSet(new long[]{0x000000000000F420L});
	public static final BitSet FOLLOW_IGUAL_in_expressao_relacional300 = new BitSet(new long[]{0x0000000001000810L});
	public static final BitSet FOLLOW_expressao_aritmetica_in_expressao_relacional306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIF_in_expressao_relacional318 = new BitSet(new long[]{0x0000000001000810L});
	public static final BitSet FOLLOW_expressao_aritmetica_in_expressao_relacional324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MENOR_in_expressao_relacional336 = new BitSet(new long[]{0x0000000001000810L});
	public static final BitSet FOLLOW_expressao_aritmetica_in_expressao_relacional342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAIOR_in_expressao_relacional353 = new BitSet(new long[]{0x0000000001000810L});
	public static final BitSet FOLLOW_expressao_aritmetica_in_expressao_relacional359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MENOR_IGUAL_in_expressao_relacional371 = new BitSet(new long[]{0x0000000001000810L});
	public static final BitSet FOLLOW_expressao_aritmetica_in_expressao_relacional377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAIOR_IGUAL_in_expressao_relacional388 = new BitSet(new long[]{0x0000000001000810L});
	public static final BitSet FOLLOW_expressao_aritmetica_in_expressao_relacional394 = new BitSet(new long[]{0x0000000000000002L});
}
