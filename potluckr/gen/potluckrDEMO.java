import org.antlr.v4.runtime.*;

import java.io.FileInputStream;

public class potluckrDEMO {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName("C:\\Users\\Dustin\\IdeaProjects\\potluckr\\gen\\sampleText");
        testLexer lexer = new testLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        testParser parser = new testParser(tokens);
        //System.out.println(parser.prog());
        parser.prog();
    }
}