
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class potluckerDemo {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName("C:\\Users\\Robyn\\Documents\\Undergraduate\\6th Year\\Second Semester\\CS 4TB3\\Final Project\\Potluck\\gen\\test.txt");
        testLexer lexer = new testLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        testParser parser = new testParser(tokens);
        //System.out.println(parser.prog());
        parser.prog();
    }
}
