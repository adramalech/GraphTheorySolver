package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import parser.*;

public class Driver {
	
	public static void main(String [] args) {

		if(args.length < 1) {
			System.out.println("You have not entered a correct file.  Please check to make sure your filename is correctly written.\n\n");
			return;
		}

		String source_code = args[0];
		
		try {
			InputStream istream = (source_code != null)? new FileInputStream(source_code) : System.in;
			
			GrapherParser gparser = new GrapherParser(new CommonTokenStream(new GrapherLexer(new ANTLRInputStream(istream)))); 
			
			ParseTree gtree = gparser.file();
			
			ParseTreeWalker ptw = new ParseTreeWalker();
					
			GrapherExtendBaseListener gel = new GrapherExtendBaseListener(gparser);
			
			ptw.walk(gel, gtree);
			
			istream.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}		
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}