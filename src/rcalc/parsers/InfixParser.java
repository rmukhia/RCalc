
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Mon Mar 26 04:06:49 ICT 2018
//----------------------------------------------------

package rcalc.parsers;

import rcalc.lexer.Token;
import rcalc.parsers.terminals.*;
import rcalc.parsers.nonterminals.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Mon Mar 26 04:06:49 ICT 2018
  */
public class InfixParser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public InfixParser() {super();}

  /** Constructor which sets the default scanner. */
  public InfixParser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public InfixParser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\017\000\002\002\004\000\002\002\003\000\002\003" +
    "\005\000\002\003\005\000\002\003\003\000\002\004\005" +
    "\000\002\004\005\000\002\004\003\000\002\005\005\000" +
    "\002\005\003\000\002\006\004\000\002\006\003\000\002" +
    "\006\003\000\002\007\005\000\002\010\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\031\000\010\005\004\011\014\013\010\001\002\000" +
    "\010\005\004\011\014\013\010\001\002\000\020\002\ufff5" +
    "\004\ufff5\005\ufff5\006\ufff5\007\ufff5\010\ufff5\012\ufff5\001" +
    "\002\000\020\002\ufffa\004\ufffa\005\ufffa\006\ufffa\007\ufffa" +
    "\010\021\012\ufffa\001\002\000\020\002\ufff6\004\ufff6\005" +
    "\ufff6\006\ufff6\007\ufff6\010\ufff6\012\ufff6\001\002\000\020" +
    "\002\ufff3\004\ufff3\005\ufff3\006\ufff3\007\ufff3\010\ufff3\012" +
    "\ufff3\001\002\000\020\002\ufff8\004\ufff8\005\ufff8\006\ufff8" +
    "\007\ufff8\010\ufff8\012\ufff8\001\002\000\010\002\000\004" +
    "\026\005\027\001\002\000\004\002\032\001\002\000\010" +
    "\005\004\011\014\013\010\001\002\000\016\002\ufffd\004" +
    "\ufffd\005\ufffd\006\017\007\016\012\ufffd\001\002\000\010" +
    "\005\004\011\014\013\010\001\002\000\010\005\004\011" +
    "\014\013\010\001\002\000\020\002\ufffc\004\ufffc\005\ufffc" +
    "\006\ufffc\007\ufffc\010\021\012\ufffc\001\002\000\010\005" +
    "\004\011\014\013\010\001\002\000\020\002\ufff9\004\ufff9" +
    "\005\ufff9\006\ufff9\007\ufff9\010\ufff9\012\ufff9\001\002\000" +
    "\020\002\ufffb\004\ufffb\005\ufffb\006\ufffb\007\ufffb\010\021" +
    "\012\ufffb\001\002\000\010\004\026\005\027\012\025\001" +
    "\002\000\020\002\ufff4\004\ufff4\005\ufff4\006\ufff4\007\ufff4" +
    "\010\ufff4\012\ufff4\001\002\000\010\005\004\011\014\013" +
    "\010\001\002\000\010\005\004\011\014\013\010\001\002" +
    "\000\016\002\ufffe\004\ufffe\005\ufffe\006\017\007\016\012" +
    "\ufffe\001\002\000\016\002\uffff\004\uffff\005\uffff\006\017" +
    "\007\016\012\uffff\001\002\000\004\002\001\001\002\000" +
    "\020\002\ufff7\004\ufff7\005\ufff7\006\ufff7\007\ufff7\010\ufff7" +
    "\012\ufff7\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\031\000\020\002\012\003\011\004\014\005\005\006" +
    "\010\007\006\010\004\001\001\000\010\006\032\007\006" +
    "\010\004\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\016\003\023\004\014\005" +
    "\005\006\010\007\006\010\004\001\001\000\002\001\001" +
    "\000\012\005\022\006\010\007\006\010\004\001\001\000" +
    "\012\005\017\006\010\007\006\010\004\001\001\000\002" +
    "\001\001\000\010\006\021\007\006\010\004\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\014\004\030\005\005\006\010\007\006\010" +
    "\004\001\001\000\014\004\027\005\005\006\010\007\006" +
    "\010\004\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$InfixParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$InfixParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$InfixParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$InfixParser$actions {
  private final InfixParser parser;

  /** Constructor */
  CUP$InfixParser$actions(InfixParser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$InfixParser$do_action(
    int                        CUP$InfixParser$act_num,
    java_cup.runtime.lr_parser CUP$InfixParser$parser,
    java.util.Stack            CUP$InfixParser$stack,
    int                        CUP$InfixParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$InfixParser$result;

      /* select the action based on the action number */
      switch (CUP$InfixParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // NUM ::= NUMBER 
            {
              NUMNode RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()).left;
		int lright = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()).right;
		Token l = (Token)((java_cup.runtime.Symbol) CUP$InfixParser$stack.peek()).value;
		 RESULT = new NUMNode(new NumberNode(l)); 
              CUP$InfixParser$result = parser.getSymbolFactory().newSymbol("NUM",6, ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()), RESULT);
            }
          return CUP$InfixParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // PTERM ::= LPAREN ASTERM RPAREN 
            {
              PTERMNode RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-2)).right;
		Token l = (Token)((java_cup.runtime.Symbol) CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-2)).value;
		int mleft = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-1)).left;
		int mright = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-1)).right;
		ASTERMNode m = (ASTERMNode)((java_cup.runtime.Symbol) CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-1)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()).right;
		Token r = (Token)((java_cup.runtime.Symbol) CUP$InfixParser$stack.peek()).value;
		 RESULT = new PTERMNode(new LParenNode(l), m, new RParenNode(r)); 
              CUP$InfixParser$result = parser.getSymbolFactory().newSymbol("PTERM",5, ((java_cup.runtime.Symbol)CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-2)), ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()), RESULT);
            }
          return CUP$InfixParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // FACTOR ::= NUM 
            {
              FACTORNode RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()).left;
		int lright = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()).right;
		NUMNode l = (NUMNode)((java_cup.runtime.Symbol) CUP$InfixParser$stack.peek()).value;
		 RESULT = new FACTORNode(l); 
              CUP$InfixParser$result = parser.getSymbolFactory().newSymbol("FACTOR",4, ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()), RESULT);
            }
          return CUP$InfixParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // FACTOR ::= PTERM 
            {
              FACTORNode RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()).left;
		int lright = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()).right;
		PTERMNode l = (PTERMNode)((java_cup.runtime.Symbol) CUP$InfixParser$stack.peek()).value;
		 RESULT = new FACTORNode(l); 
              CUP$InfixParser$result = parser.getSymbolFactory().newSymbol("FACTOR",4, ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()), RESULT);
            }
          return CUP$InfixParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // FACTOR ::= MINUS FACTOR 
            {
              FACTORNode RESULT =null;
		int mleft = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-1)).left;
		int mright = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-1)).right;
		Token m = (Token)((java_cup.runtime.Symbol) CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-1)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()).right;
		FACTORNode r = (FACTORNode)((java_cup.runtime.Symbol) CUP$InfixParser$stack.peek()).value;
		 RESULT = new FACTORNode(new MinusNode(m), r); 
              CUP$InfixParser$result = parser.getSymbolFactory().newSymbol("FACTOR",4, ((java_cup.runtime.Symbol)CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-1)), ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()), RESULT);
            }
          return CUP$InfixParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // TERM ::= FACTOR 
            {
              TERMNode RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()).left;
		int lright = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()).right;
		FACTORNode l = (FACTORNode)((java_cup.runtime.Symbol) CUP$InfixParser$stack.peek()).value;
		 RESULT = new TERMNode(l); 
              CUP$InfixParser$result = parser.getSymbolFactory().newSymbol("TERM",3, ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()), RESULT);
            }
          return CUP$InfixParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // TERM ::= TERM EXP FACTOR 
            {
              TERMNode RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-2)).right;
		TERMNode l = (TERMNode)((java_cup.runtime.Symbol) CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-2)).value;
		int mleft = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-1)).left;
		int mright = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-1)).right;
		Token m = (Token)((java_cup.runtime.Symbol) CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-1)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()).right;
		FACTORNode r = (FACTORNode)((java_cup.runtime.Symbol) CUP$InfixParser$stack.peek()).value;
		 RESULT = new TERMNode( l, new ExponentNode(m), r); 
              CUP$InfixParser$result = parser.getSymbolFactory().newSymbol("TERM",3, ((java_cup.runtime.Symbol)CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-2)), ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()), RESULT);
            }
          return CUP$InfixParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // MDTERM ::= TERM 
            {
              MDTERMNode RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()).left;
		int lright = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()).right;
		TERMNode l = (TERMNode)((java_cup.runtime.Symbol) CUP$InfixParser$stack.peek()).value;
		 RESULT = new MDTERMNode(l); 
              CUP$InfixParser$result = parser.getSymbolFactory().newSymbol("MDTERM",2, ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()), RESULT);
            }
          return CUP$InfixParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // MDTERM ::= MDTERM DIVIDE TERM 
            {
              MDTERMNode RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-2)).right;
		MDTERMNode l = (MDTERMNode)((java_cup.runtime.Symbol) CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-2)).value;
		int mleft = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-1)).left;
		int mright = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-1)).right;
		Token m = (Token)((java_cup.runtime.Symbol) CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-1)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()).right;
		TERMNode r = (TERMNode)((java_cup.runtime.Symbol) CUP$InfixParser$stack.peek()).value;
		 RESULT = new MDTERMNode(l, new DivideNode(m), r); 
              CUP$InfixParser$result = parser.getSymbolFactory().newSymbol("MDTERM",2, ((java_cup.runtime.Symbol)CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-2)), ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()), RESULT);
            }
          return CUP$InfixParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // MDTERM ::= MDTERM MULTIPLY TERM 
            {
              MDTERMNode RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-2)).right;
		MDTERMNode l = (MDTERMNode)((java_cup.runtime.Symbol) CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-2)).value;
		int mleft = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-1)).left;
		int mright = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-1)).right;
		Token m = (Token)((java_cup.runtime.Symbol) CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-1)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()).right;
		TERMNode r = (TERMNode)((java_cup.runtime.Symbol) CUP$InfixParser$stack.peek()).value;
		 RESULT = new MDTERMNode(l, new MultiplyNode(m), r); 
              CUP$InfixParser$result = parser.getSymbolFactory().newSymbol("MDTERM",2, ((java_cup.runtime.Symbol)CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-2)), ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()), RESULT);
            }
          return CUP$InfixParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // ASTERM ::= MDTERM 
            {
              ASTERMNode RESULT =null;
		int mleft = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()).left;
		int mright = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()).right;
		MDTERMNode m = (MDTERMNode)((java_cup.runtime.Symbol) CUP$InfixParser$stack.peek()).value;
		 RESULT = new ASTERMNode(m); 
              CUP$InfixParser$result = parser.getSymbolFactory().newSymbol("ASTERM",1, ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()), RESULT);
            }
          return CUP$InfixParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // ASTERM ::= ASTERM MINUS MDTERM 
            {
              ASTERMNode RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-2)).right;
		ASTERMNode l = (ASTERMNode)((java_cup.runtime.Symbol) CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-2)).value;
		int mleft = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-1)).left;
		int mright = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-1)).right;
		Token m = (Token)((java_cup.runtime.Symbol) CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-1)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()).right;
		MDTERMNode r = (MDTERMNode)((java_cup.runtime.Symbol) CUP$InfixParser$stack.peek()).value;
		 RESULT = new ASTERMNode(l, new MinusNode(m),  r); 
              CUP$InfixParser$result = parser.getSymbolFactory().newSymbol("ASTERM",1, ((java_cup.runtime.Symbol)CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-2)), ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()), RESULT);
            }
          return CUP$InfixParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // ASTERM ::= ASTERM PLUS MDTERM 
            {
              ASTERMNode RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-2)).right;
		ASTERMNode l = (ASTERMNode)((java_cup.runtime.Symbol) CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-2)).value;
		int mleft = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-1)).left;
		int mright = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-1)).right;
		Token m = (Token)((java_cup.runtime.Symbol) CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-1)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()).right;
		MDTERMNode r = (MDTERMNode)((java_cup.runtime.Symbol) CUP$InfixParser$stack.peek()).value;
		 RESULT = new ASTERMNode(l, new PlusNode(m), r); 
              CUP$InfixParser$result = parser.getSymbolFactory().newSymbol("ASTERM",1, ((java_cup.runtime.Symbol)CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-2)), ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()), RESULT);
            }
          return CUP$InfixParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // START ::= ASTERM 
            {
              STARTNode RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()).left;
		int lright = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()).right;
		ASTERMNode l = (ASTERMNode)((java_cup.runtime.Symbol) CUP$InfixParser$stack.peek()).value;
		 RESULT = new STARTNode(l); 
              CUP$InfixParser$result = parser.getSymbolFactory().newSymbol("START",0, ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()), RESULT);
            }
          return CUP$InfixParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= START EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-1)).right;
		STARTNode start_val = (STARTNode)((java_cup.runtime.Symbol) CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-1)).value;
		RESULT = start_val;
              CUP$InfixParser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$InfixParser$stack.elementAt(CUP$InfixParser$top-1)), ((java_cup.runtime.Symbol)CUP$InfixParser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$InfixParser$parser.done_parsing();
          return CUP$InfixParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}
