grammar Gramatica;

options {
    language=Java;
}

@header {
    import java.util.HashMap;
}

@members {
    HashMap<String, Double> ids = new HashMap<>();
}

programa 
	: comando+ 
	;

comando	
	: atribuicao SEMICOLON
	| teste
	| iteracao
	;

atribuicao
	: VAR { System.out.println("Variavel: " + $VAR.text); }
	OPERADOR_ATRIBUICAO e = expressao_aritmetica
	{
		if(ids.containsKey($VAR.text)){
			System.out.println("Id atualizado: " + $VAR.text + " = " + $e.v);
		}else {
			System.out.println("Id novo inserido: " + $VAR.text + " = " + $e.v);
		}
		ids.put($VAR.text, new Double($e.v)); 
	
	}
	;

teste 
	: IF expressao_relacional THEN programa (ELSE programa)?
	;	 

iteracao 
	: WHILE expressao_relacional DO programa 
	;

expressao_aritmetica returns [ double v ]
	: 
	( 
	CONST { $v = Double.parseDouble($CONST.text); } {System.out.println("Constante: " + $v);}
	| VAR { $v = ids.getOrDefault($VAR.text, 0.0); } {System.out.println("Variavel: " + $VAR.text + " = " + $v);}
	)
	( {System.out.println("Operacao: +");} SOMA e = expressao_aritmetica {System.out.println("Calculo: "+$v+" + "+$e.v);} {$v += $e.v;} {System.out.println("Resultado da soma: " + $v);}
	| {System.out.println("Operacao: -");} SUBT e = expressao_aritmetica {System.out.println("Calculo: "+$v+" - "+$e.v);} {$v -= $e.v;} {System.out.println("Resultado da subtracao: " + $v);}
	| {System.out.println("Operacao: *");} MULT e = expressao_aritmetica {System.out.println("Calculo: "+$v+" * "+$e.v);} {$v *= $e.v;} {System.out.println("Resultado da multiplicao: " + $v);}
	| {System.out.println("Operacao: /");} DIVI e = expressao_aritmetica {System.out.println("Calculo: "+$v+" / "+$e.v);} {$v /= $e.v;} {System.out.println("Resultado da divisao: " + $v);}
	)?
	| L_PAREN e = expressao_aritmetica {$v = $e.v;} R_PAREN
	;

expressao_relacional returns [ boolean t ]
	: 
	( e = expressao_aritmetica ) 
	( {System.out.println("Expressao relacional: = " );} IGUAL d = expressao_aritmetica {$t = $e.v == $d.v;} {System.out.println("Resultado Expressao relacional: " + $e.v + " = "  + $d.v + " : " + $t);} 
	| {System.out.println("Expressao relacional: <>" );} DIF d = expressao_aritmetica {$t = $e.v != $d.v;} {System.out.println("Resultado Expressao relacional: " + $e.v + " <> " + $d.v + " : " + $t);} 
	| {System.out.println("Expressao relacional: < " );} MENOR d = expressao_aritmetica {$t = $e.v <  $d.v;} {System.out.println("Resultado Expressao relacional: " + $e.v + " < "  + $d.v + " : " + $t);}
	| {System.out.println("Expressao relacional: > " );} MAIOR d = expressao_aritmetica {$t = $e.v >  $d.v;} {System.out.println("Resultado Expressao relacional: " + $e.v + " > "  + $d.v + " : " + $t);} 
	| {System.out.println("Expressao relacional: <=" );} MENOR_IGUAL d = expressao_aritmetica {$t = $e.v <= $d.v;} {System.out.println("Resultado Expressao relacional: " + $e.v + " <= " + $d.v + " : " + $t);}
	| {System.out.println("Expressao relacional: >=" );} MAIOR_IGUAL d = expressao_aritmetica {$t = $e.v >= $d.v;} {System.out.println("Resultado Expressao relacional: " + $e.v + " >= " + $d.v + " : " + $t);}
	)   
	;

DO	:	'do';
ELSE	:	'else';
IF	:	'if';
RETURN	:	'return';
WHILE	:	'while';
THEN	:	'then';
SOMA 	:	'+';
SUBT	:	'-';
MULT	:	'*';
DIVI	:	'/';
L_PAREN	:	'(';
R_PAREN	:	')';
IGUAL 	:	'=';
DIF	:	'<>';
MAIOR	:	'>';
MENOR	:	'<';
MAIOR_IGUAL
	:	'>=';
MENOR_IGUAL
	:	'<=';


OPERADOR_ATRIBUICAO: ':=' ;
//OPERADOR_RELACIONAL: '<' | '>' | '>=' | '<=' | '<>' | '=';
SEMICOLON: ';';

CONST : ('0'..'9')+ ;
VAR  : ('a'..'z'|'A'..'Z')+;

WS  : (' '|'\n'|'\r'|'\t')+ {skip();} ;