package rcalc;

import rcalc.lexer.CalculatorLexer;
import rcalc.parsers.InfixParser;
import rcalc.parsers.PostfixParser;
import rcalc.parsers.PrefixParser;
import rcalc.parsers.ParseNode;
import java_cup.runtime.lr_parser;

import java.io.StringReader;

/* TODO
   Getting conflicts in UMINUS converted to minus
 */
public class Calculator {
    public static enum TYPE {
        INFIX,
        POSTFIX,
        PREFIX
    };

    /* Returns an Parse tree */
    public ParseNode parse(String s, TYPE type) throws Exception {
        StringReader reader = new StringReader(s);
        CalculatorLexer lexer = new CalculatorLexer(reader);
        lr_parser parser;
        switch (type) {
            case INFIX:
                parser = new InfixParser(lexer);
                break;
            case POSTFIX:
                parser = new PostfixParser(lexer);
                break;
            case PREFIX:
                parser = new PrefixParser(lexer);
                break;
            default:
                throw new Exception(this.getClass() + ": Undefined type " + type);
        }
        try {
            return (ParseNode) parser.parse().value;
        } catch (Error e) {
            throw new Exception(e.getMessage());
        }
    }
}
