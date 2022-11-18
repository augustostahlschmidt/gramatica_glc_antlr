package teste;

import java.io.*;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import output.GramaticaLexer;
import output.GramaticaParser;

public class GramaticaTeste {

	public static void main(String[] args) throws IOException {
		ANTLRFileStream fileStream = new ANTLRFileStream("C:\\Users\\Guto\\eclipse-workspace\\antlrTeste\\input\\input.txt\\", "UTF8");
        
		GramaticaLexer lexer = new GramaticaLexer(fileStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        GramaticaParser parser = new GramaticaParser(tokenStream);
        
        try {
        	parser.programa();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
	}

}
