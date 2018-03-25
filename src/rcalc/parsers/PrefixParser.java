
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
public class PrefixParser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public PrefixParser() {super();}

  /** Constructor which sets the default scanner. */
  public PrefixParser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public PrefixParser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\013\000\002\002\004\000\002\002\003\000\002\003" +
    "\005\000\002\003\005\000\002\003\005\000\002\003\005" +
    "\000\002\003\005\000\002\003\006\000\002\003\003\000" +
    "\002\004\003\000\002\005\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\032\000\020\004\013\005\004\006\010\007\006\010" +
    "\015\011\016\013\011\001\002\000\020\004\013\005\004" +
    "\006\010\007\006\010\015\011\016\013\011\001\002\000" +
    "\024\002\ufff8\004\ufff8\005\ufff8\006\ufff8\007\ufff8\010\ufff8" +
    "\011\ufff8\012\ufff8\013\ufff8\001\002\000\020\004\013\005" +
    "\004\006\010\007\006\010\015\011\016\013\011\001\002" +
    "\000\004\002\000\001\002\000\020\004\013\005\004\006" +
    "\010\007\006\010\015\011\016\013\011\001\002\000\024" +
    "\002\ufff7\004\ufff7\005\ufff7\006\ufff7\007\ufff7\010\ufff7\011" +
    "\ufff7\012\ufff7\013\ufff7\001\002\000\024\002\ufff9\004\ufff9" +
    "\005\ufff9\006\ufff9\007\ufff9\010\ufff9\011\ufff9\012\ufff9\013" +
    "\ufff9\001\002\000\020\004\013\005\004\006\010\007\006" +
    "\010\015\011\016\013\011\001\002\000\004\002\024\001" +
    "\002\000\020\004\013\005\004\006\010\007\006\010\015" +
    "\011\016\013\011\001\002\000\004\005\017\001\002\000" +
    "\020\004\013\005\004\006\010\007\006\010\015\011\016" +
    "\013\011\001\002\000\004\012\021\001\002\000\024\002" +
    "\ufffa\004\ufffa\005\ufffa\006\ufffa\007\ufffa\010\ufffa\011\ufffa" +
    "\012\ufffa\013\ufffa\001\002\000\020\004\013\005\004\006" +
    "\010\007\006\010\015\011\016\013\011\001\002\000\024" +
    "\002\ufffb\004\ufffb\005\ufffb\006\ufffb\007\ufffb\010\ufffb\011" +
    "\ufffb\012\ufffb\013\ufffb\001\002\000\004\002\001\001\002" +
    "\000\020\004\013\005\004\006\010\007\006\010\015\011" +
    "\016\013\011\001\002\000\024\002\uffff\004\uffff\005\uffff" +
    "\006\uffff\007\uffff\010\uffff\011\uffff\012\uffff\013\uffff\001" +
    "\002\000\020\004\013\005\004\006\010\007\006\010\015" +
    "\011\016\013\011\001\002\000\024\002\ufffd\004\ufffd\005" +
    "\ufffd\006\ufffd\007\ufffd\010\ufffd\011\ufffd\012\ufffd\013\ufffd" +
    "\001\002\000\020\004\013\005\004\006\010\007\006\010" +
    "\015\011\016\013\011\001\002\000\024\002\ufffc\004\ufffc" +
    "\005\ufffc\006\ufffc\007\ufffc\010\ufffc\011\ufffc\012\ufffc\013" +
    "\ufffc\001\002\000\020\004\013\005\004\006\010\007\006" +
    "\010\015\011\016\013\011\001\002\000\024\002\ufffe\004" +
    "\ufffe\005\ufffe\006\ufffe\007\ufffe\010\ufffe\011\ufffe\012\ufffe" +
    "\013\ufffe\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\032\000\012\002\013\003\006\004\011\005\004\001" +
    "\001\000\010\003\032\004\011\005\004\001\001\000\002" +
    "\001\001\000\010\003\030\004\011\005\004\001\001\000" +
    "\002\001\001\000\010\003\026\004\011\005\004\001\001" +
    "\000\002\001\001\000\002\001\001\000\010\003\024\004" +
    "\011\005\004\001\001\000\002\001\001\000\010\003\021" +
    "\004\011\005\004\001\001\000\002\001\001\000\010\003" +
    "\017\004\011\005\004\001\001\000\002\001\001\000\002" +
    "\001\001\000\010\003\022\004\011\005\004\001\001\000" +
    "\002\001\001\000\002\001\001\000\010\003\025\004\011" +
    "\005\004\001\001\000\002\001\001\000\010\003\027\004" +
    "\011\005\004\001\001\000\002\001\001\000\010\003\031" +
    "\004\011\005\004\001\001\000\002\001\001\000\010\003" +
    "\033\004\011\005\004\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$PrefixParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$PrefixParser$actions(this);
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
    return action_obj.CUP$PrefixParser$do_action(act_num, parser, stack, top);
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
class CUP$PrefixParser$actions {
  private final PrefixParser parser;

  /** Constructor */
  CUP$PrefixParser$actions(PrefixParser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$PrefixParser$do_action(
    int                        CUP$PrefixParser$act_num,
    java_cup.runtime.lr_parser CUP$PrefixParser$parser,
    java.util.Stack            CUP$PrefixParser$stack,
    int                        CUP$PrefixParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$PrefixParser$result;

      /* select the action based on the action number */
      switch (CUP$PrefixParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // NUM ::= NUMBER 
            {
              NUMNode RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.peek()).left;
		int lright = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.peek()).right;
		Token l = (Token)((java_cup.runtime.Symbol) CUP$PrefixParser$stack.peek()).value;
		 RESULT = new NUMNode(new NumberNode(l)); 
              CUP$PrefixParser$result = parser.getSymbolFactory().newSymbol("NUM",3, ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.peek()), RESULT);
            }
          return CUP$PrefixParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // FACTOR ::= NUM 
            {
              FACTORNode RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.peek()).left;
		int lright = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.peek()).right;
		NUMNode l = (NUMNode)((java_cup.runtime.Symbol) CUP$PrefixParser$stack.peek()).value;
		 RESULT = new FACTORNode(l); 
              CUP$PrefixParser$result = parser.getSymbolFactory().newSymbol("FACTOR",2, ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.peek()), RESULT);
            }
          return CUP$PrefixParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // TERM ::= FACTOR 
            {
              TERMNode RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.peek()).left;
		int lright = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.peek()).right;
		FACTORNode l = (FACTORNode)((java_cup.runtime.Symbol) CUP$PrefixParser$stack.peek()).value;
		 RESULT = new TERMNode(l); 
              CUP$PrefixParser$result = parser.getSymbolFactory().newSymbol("TERM",1, ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.peek()), RESULT);
            }
          return CUP$PrefixParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // TERM ::= LPAREN MINUS TERM RPAREN 
            {
              TERMNode RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-3)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-3)).right;
		Token l = (Token)((java_cup.runtime.Symbol) CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-3)).value;
		int mleft = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-2)).left;
		int mright = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-2)).right;
		Token m = (Token)((java_cup.runtime.Symbol) CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-1)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-1)).right;
		TERMNode r = (TERMNode)((java_cup.runtime.Symbol) CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-1)).value;
		int rpleft = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.peek()).left;
		int rpright = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.peek()).right;
		Token rp = (Token)((java_cup.runtime.Symbol) CUP$PrefixParser$stack.peek()).value;
		 RESULT = new TERMNode(new LParenNode(l), new MinusNode(m), r, new RParenNode(rp)); 
              CUP$PrefixParser$result = parser.getSymbolFactory().newSymbol("TERM",1, ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-3)), ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.peek()), RESULT);
            }
          return CUP$PrefixParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // TERM ::= EXP TERM TERM 
            {
              TERMNode RESULT =null;
		int mleft = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-2)).left;
		int mright = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-2)).right;
		Token m = (Token)((java_cup.runtime.Symbol) CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-2)).value;
		int lleft = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-1)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-1)).right;
		TERMNode l = (TERMNode)((java_cup.runtime.Symbol) CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-1)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.peek()).right;
		TERMNode r = (TERMNode)((java_cup.runtime.Symbol) CUP$PrefixParser$stack.peek()).value;
		 RESULT = new TERMNode(l, new ExponentNode(m), r); 
              CUP$PrefixParser$result = parser.getSymbolFactory().newSymbol("TERM",1, ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-2)), ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.peek()), RESULT);
            }
          return CUP$PrefixParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // TERM ::= DIVIDE TERM TERM 
            {
              TERMNode RESULT =null;
		int mleft = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-2)).left;
		int mright = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-2)).right;
		Token m = (Token)((java_cup.runtime.Symbol) CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-2)).value;
		int lleft = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-1)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-1)).right;
		TERMNode l = (TERMNode)((java_cup.runtime.Symbol) CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-1)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.peek()).right;
		TERMNode r = (TERMNode)((java_cup.runtime.Symbol) CUP$PrefixParser$stack.peek()).value;
		 RESULT = new TERMNode(l, new DivideNode(m), r); 
              CUP$PrefixParser$result = parser.getSymbolFactory().newSymbol("TERM",1, ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-2)), ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.peek()), RESULT);
            }
          return CUP$PrefixParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // TERM ::= MULTIPLY TERM TERM 
            {
              TERMNode RESULT =null;
		int mleft = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-2)).left;
		int mright = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-2)).right;
		Token m = (Token)((java_cup.runtime.Symbol) CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-2)).value;
		int lleft = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-1)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-1)).right;
		TERMNode l = (TERMNode)((java_cup.runtime.Symbol) CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-1)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.peek()).right;
		TERMNode r = (TERMNode)((java_cup.runtime.Symbol) CUP$PrefixParser$stack.peek()).value;
		 RESULT = new TERMNode(l, new MultiplyNode(m), r); 
              CUP$PrefixParser$result = parser.getSymbolFactory().newSymbol("TERM",1, ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-2)), ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.peek()), RESULT);
            }
          return CUP$PrefixParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // TERM ::= MINUS TERM TERM 
            {
              TERMNode RESULT =null;
		int mleft = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-2)).left;
		int mright = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-2)).right;
		Token m = (Token)((java_cup.runtime.Symbol) CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-2)).value;
		int lleft = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-1)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-1)).right;
		TERMNode l = (TERMNode)((java_cup.runtime.Symbol) CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-1)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.peek()).right;
		TERMNode r = (TERMNode)((java_cup.runtime.Symbol) CUP$PrefixParser$stack.peek()).value;
		 RESULT = new TERMNode(l, new MinusNode(m), r); 
              CUP$PrefixParser$result = parser.getSymbolFactory().newSymbol("TERM",1, ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-2)), ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.peek()), RESULT);
            }
          return CUP$PrefixParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // TERM ::= PLUS TERM TERM 
            {
              TERMNode RESULT =null;
		int mleft = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-2)).left;
		int mright = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-2)).right;
		Token m = (Token)((java_cup.runtime.Symbol) CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-2)).value;
		int lleft = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-1)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-1)).right;
		TERMNode l = (TERMNode)((java_cup.runtime.Symbol) CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-1)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.peek()).right;
		TERMNode r = (TERMNode)((java_cup.runtime.Symbol) CUP$PrefixParser$stack.peek()).value;
		 RESULT = new TERMNode(l, new PlusNode(m), r); 
              CUP$PrefixParser$result = parser.getSymbolFactory().newSymbol("TERM",1, ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-2)), ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.peek()), RESULT);
            }
          return CUP$PrefixParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // START ::= TERM 
            {
              STARTNode RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.peek()).left;
		int lright = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.peek()).right;
		TERMNode l = (TERMNode)((java_cup.runtime.Symbol) CUP$PrefixParser$stack.peek()).value;
		 RESULT = new STARTNode(l); 
              CUP$PrefixParser$result = parser.getSymbolFactory().newSymbol("START",0, ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.peek()), RESULT);
            }
          return CUP$PrefixParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= START EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-1)).right;
		STARTNode start_val = (STARTNode)((java_cup.runtime.Symbol) CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-1)).value;
		RESULT = start_val;
              CUP$PrefixParser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.elementAt(CUP$PrefixParser$top-1)), ((java_cup.runtime.Symbol)CUP$PrefixParser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$PrefixParser$parser.done_parsing();
          return CUP$PrefixParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

