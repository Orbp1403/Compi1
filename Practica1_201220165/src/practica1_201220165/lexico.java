/* The following code was generated by JFlex 1.4.3 on 21/02/18 06:16 PM */

package practica1_201220165;
import java_cup.runtime.Symbol;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 21/02/18 06:16 PM from the specification file
 * <tt>Escaner.jflex</tt>
 */
public class lexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int CADENA = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0, 40, 41,  0, 40, 40,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    40,  0, 42,  0,  0,  0,  7,  0, 11, 12,  9,  5,  3,  6,  8, 10, 
    37, 37, 37, 37, 37, 37, 37, 37, 37, 37,  0,  0, 13,  1, 14,  0, 
     0, 22, 25, 27, 17, 20, 33, 32, 31, 26, 38, 38, 19, 15, 21, 16, 
    24, 38, 28, 23, 30, 18, 29, 36, 35, 34, 38,  2,  0,  4,  0, 39, 
     0, 22, 25, 27, 17, 20, 33, 32, 31, 26, 38, 38, 19, 15, 21, 16, 
    24, 38, 28, 23, 30, 18, 29, 36, 35, 34, 38,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0, 38,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0, 38,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\22\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\32\2\20\1\33\1\34\11\20\1\35"+
    "\10\20\1\36\4\20\1\37\12\20\1\40\4\20\1\41"+
    "\1\20\1\42\1\20\1\43\1\44\20\20\1\45\5\20"+
    "\1\46\2\20\1\47\1\50\1\51\1\52\1\53\1\20"+
    "\1\54\10\20\1\55\1\56\2\20\1\57\1\60\6\20"+
    "\1\61\7\20\1\62\5\20\1\63\1\20\1\64\1\65"+
    "\1\66\1\67\1\70\1\71\1\72\1\73\5\20\1\74"+
    "\2\20\1\75\1\76\1\77\1\100\3\20\1\101\1\102"+
    "\1\20\1\103";

  private static int [] zzUnpackAction() {
    int [] result = new int[189];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\53\0\126\0\126\0\126\0\126\0\126\0\126"+
    "\0\126\0\126\0\126\0\126\0\126\0\126\0\126\0\201"+
    "\0\254\0\327\0\u0102\0\u012d\0\u0158\0\u0183\0\u01ae\0\u01d9"+
    "\0\u0204\0\u022f\0\u025a\0\u0285\0\u02b0\0\u02db\0\u0306\0\u0331"+
    "\0\u035c\0\u0387\0\u03b2\0\u03dd\0\126\0\126\0\126\0\126"+
    "\0\126\0\126\0\126\0\126\0\126\0\u0408\0\u0433\0\u0331"+
    "\0\u045e\0\u0489\0\u04b4\0\u04df\0\u050a\0\u0535\0\u0560\0\u058b"+
    "\0\u05b6\0\u05e1\0\u0331\0\u060c\0\u0637\0\u0662\0\u068d\0\u06b8"+
    "\0\u06e3\0\u070e\0\u0739\0\u0331\0\u0764\0\u078f\0\u07ba\0\u07e5"+
    "\0\u0331\0\u0810\0\u083b\0\u0866\0\u0891\0\u08bc\0\u08e7\0\u0912"+
    "\0\u093d\0\u0968\0\u0993\0\u0331\0\u09be\0\u09e9\0\u0a14\0\u0a3f"+
    "\0\u0331\0\u0a6a\0\u0331\0\u0a95\0\u0331\0\u0331\0\u0ac0\0\u0aeb"+
    "\0\u0b16\0\u0b41\0\u0b6c\0\u0b97\0\u0bc2\0\u0bed\0\u0c18\0\u0c43"+
    "\0\u0c6e\0\u0c99\0\u0cc4\0\u0cef\0\u0d1a\0\u0d45\0\u0331\0\u0d70"+
    "\0\u0d9b\0\u0dc6\0\u0df1\0\u0e1c\0\u0331\0\u0e47\0\u0e72\0\u0331"+
    "\0\u0331\0\u0e9d\0\u0331\0\u0331\0\u0ec8\0\u0331\0\u0ef3\0\u0f1e"+
    "\0\u0f49\0\u0f74\0\u0f9f\0\u0fca\0\u0ff5\0\u1020\0\u0331\0\u0331"+
    "\0\u104b\0\u1076\0\u0331\0\u0331\0\u10a1\0\u10cc\0\u10f7\0\u1122"+
    "\0\u114d\0\u1178\0\u0331\0\u11a3\0\u11ce\0\u11f9\0\u1224\0\u124f"+
    "\0\u127a\0\u12a5\0\u0331\0\u12d0\0\u12fb\0\u1326\0\u1351\0\u137c"+
    "\0\u0331\0\u13a7\0\u0331\0\u0331\0\u0331\0\u0331\0\u0331\0\u0331"+
    "\0\u0331\0\u0331\0\u13d2\0\u13fd\0\u1428\0\u1453\0\u147e\0\u0331"+
    "\0\u14a9\0\u14d4\0\u0331\0\u0331\0\u0331\0\u0331\0\u14ff\0\u152a"+
    "\0\u1555\0\u0331\0\u0331\0\u1580\0\u0331";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[189];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\2\40"+
    "\1\42\2\40\1\43\1\44\1\40\1\3\1\45\1\46"+
    "\1\47\51\50\1\51\1\52\54\0\1\53\14\0\1\54"+
    "\35\0\1\55\70\0\1\40\1\56\5\40\1\57\21\40"+
    "\22\0\15\40\1\60\13\40\22\0\1\40\1\61\11\40"+
    "\1\62\15\40\22\0\6\40\1\63\22\40\22\0\1\40"+
    "\1\64\27\40\22\0\4\40\1\65\1\40\1\66\15\40"+
    "\1\67\4\40\22\0\1\40\1\70\3\40\1\71\23\40"+
    "\22\0\6\40\1\72\1\40\1\73\20\40\22\0\3\40"+
    "\1\74\1\40\1\75\11\40\1\76\11\40\22\0\3\40"+
    "\1\77\11\40\1\100\13\40\22\0\1\40\1\101\21\40"+
    "\1\102\5\40\22\0\6\40\1\103\13\40\1\104\6\40"+
    "\22\0\1\40\1\105\5\40\1\106\10\40\1\107\10\40"+
    "\22\0\5\40\1\110\23\40\22\0\31\40\22\0\1\40"+
    "\1\111\13\40\1\112\2\40\1\113\10\40\22\0\1\40"+
    "\1\114\1\40\1\115\3\40\1\116\21\40\22\0\15\40"+
    "\1\117\2\40\1\120\10\40\50\0\1\44\24\0\2\40"+
    "\1\121\26\40\22\0\13\40\1\122\15\40\22\0\3\40"+
    "\1\123\25\40\22\0\1\124\30\40\22\0\17\40\1\125"+
    "\11\40\22\0\1\40\1\126\4\40\1\127\22\40\22\0"+
    "\10\40\1\130\20\40\22\0\2\40\1\131\26\40\22\0"+
    "\13\40\1\132\15\40\22\0\17\40\1\133\11\40\22\0"+
    "\24\40\1\134\4\40\22\0\2\40\1\135\26\40\22\0"+
    "\12\40\1\136\16\40\22\0\4\40\1\137\24\40\22\0"+
    "\5\40\1\140\1\40\1\141\5\40\1\142\13\40\22\0"+
    "\12\40\1\143\16\40\22\0\13\40\1\144\15\40\22\0"+
    "\1\40\1\145\27\40\22\0\16\40\1\146\12\40\22\0"+
    "\17\40\1\147\11\40\22\0\6\40\1\150\22\40\22\0"+
    "\10\40\1\151\20\40\22\0\7\40\1\152\21\40\22\0"+
    "\7\40\1\153\7\40\1\154\11\40\22\0\3\40\1\155"+
    "\25\40\22\0\5\40\1\156\23\40\22\0\15\40\1\157"+
    "\13\40\22\0\6\40\1\160\22\40\22\0\4\40\1\161"+
    "\24\40\22\0\13\40\1\162\15\40\22\0\13\40\1\163"+
    "\15\40\22\0\3\40\1\164\25\40\22\0\6\40\1\165"+
    "\22\40\22\0\12\40\1\166\16\40\22\0\13\40\1\167"+
    "\15\40\22\0\11\40\1\170\17\40\22\0\21\40\1\171"+
    "\7\40\22\0\5\40\1\172\23\40\22\0\17\40\1\173"+
    "\11\40\22\0\17\40\1\174\11\40\22\0\5\40\1\175"+
    "\23\40\22\0\11\40\1\176\17\40\22\0\17\40\1\177"+
    "\11\40\22\0\13\40\1\200\15\40\22\0\4\40\1\201"+
    "\24\40\22\0\16\40\1\202\12\40\22\0\4\40\1\203"+
    "\24\40\22\0\7\40\1\204\21\40\22\0\5\40\1\205"+
    "\23\40\22\0\10\40\1\206\20\40\22\0\5\40\1\207"+
    "\23\40\22\0\15\40\1\210\13\40\22\0\2\40\1\211"+
    "\26\40\22\0\3\40\1\212\25\40\22\0\5\40\1\213"+
    "\23\40\22\0\6\40\1\214\22\40\22\0\14\40\1\215"+
    "\14\40\22\0\10\40\1\216\20\40\22\0\17\40\1\217"+
    "\11\40\22\0\4\40\1\220\24\40\22\0\4\40\1\221"+
    "\24\40\22\0\4\40\1\222\24\40\22\0\4\40\1\223"+
    "\24\40\22\0\13\40\1\224\15\40\22\0\14\40\1\225"+
    "\14\40\22\0\13\40\1\226\15\40\22\0\6\40\1\227"+
    "\22\40\22\0\13\40\1\230\15\40\22\0\7\40\1\231"+
    "\21\40\22\0\5\40\1\232\23\40\22\0\4\40\1\233"+
    "\24\40\22\0\21\40\1\234\7\40\22\0\1\40\1\235"+
    "\27\40\22\0\4\40\1\236\24\40\22\0\15\40\1\237"+
    "\13\40\22\0\17\40\1\240\11\40\22\0\5\40\1\241"+
    "\23\40\22\0\5\40\1\242\23\40\22\0\5\40\1\243"+
    "\23\40\22\0\5\40\1\244\23\40\22\0\5\40\1\245"+
    "\23\40\22\0\22\40\1\246\6\40\22\0\17\40\1\247"+
    "\11\40\22\0\14\40\1\250\14\40\22\0\21\40\1\251"+
    "\7\40\22\0\14\40\1\252\14\40\22\0\17\40\1\253"+
    "\11\40\22\0\7\40\1\254\21\40\22\0\5\40\1\255"+
    "\23\40\22\0\4\40\1\256\24\40\22\0\13\40\1\257"+
    "\15\40\22\0\6\40\1\260\22\40\22\0\13\40\1\261"+
    "\15\40\22\0\4\40\1\262\24\40\22\0\5\40\1\263"+
    "\23\40\22\0\6\40\1\264\22\40\22\0\15\40\1\265"+
    "\13\40\22\0\5\40\1\266\23\40\22\0\6\40\1\267"+
    "\22\40\22\0\1\40\1\270\27\40\22\0\13\40\1\271"+
    "\15\40\22\0\5\40\1\272\23\40\22\0\6\40\1\273"+
    "\22\40\22\0\6\40\1\274\22\40\22\0\5\40\1\275"+
    "\23\40\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5547];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\15\11\25\1\11\11\220\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[189];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    //Código de usuario
    String cadena= "";


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public lexico(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public lexico(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 20: 
          { yybegin(CADENA); cadena+="\"";;
          }
        case 68: break;
        case 8: 
          { return new Symbol(tabla_simbolos.tconcate, yycolumn, yyline, new String(yytext()));
          }
        case 69: break;
        case 59: 
          { return new Symbol(tabla_simbolos.tpublic, yycolumn, yyline, new String(yytext()));
          }
        case 70: break;
        case 14: 
          { return new Symbol(tabla_simbolos.tmenor, yycolumn, yyline, new String(yytext()));
          }
        case 71: break;
        case 16: 
          { return new Symbol(tabla_simbolos.tid, yycolumn, yyline, new String(yytext()));
          }
        case 72: break;
        case 3: 
          { return new Symbol(tabla_simbolos.tcorabierto, yycolumn, yyline, new String(yytext()));
          }
        case 73: break;
        case 46: 
          { return new Symbol(tabla_simbolos.tchar, yycolumn, yyline, new String(yytext()));
          }
        case 74: break;
        case 30: 
          { return new Symbol(tabla_simbolos.tif, yycolumn, yyline, new String(yytext()));
          }
        case 75: break;
        case 50: 
          { return new Symbol(tabla_simbolos.tbyval, yycolumn, yyline, new String(yytext()));
          }
        case 76: break;
        case 11: 
          { return new Symbol(tabla_simbolos.tdiv, yycolumn, yyline, new String(yytext()));
          }
        case 77: break;
        case 58: 
          { return new Symbol(tabla_simbolos.tstring, yycolumn, yyline, new String(yytext()));
          }
        case 78: break;
        case 34: 
          { return new Symbol(tabla_simbolos.tnot, yycolumn, yyline, new String(yytext()));
          }
        case 79: break;
        case 4: 
          { return new Symbol(tabla_simbolos.tcoma, yycolumn, yyline, new String(yytext()));
          }
        case 80: break;
        case 38: 
          { return new Symbol(tabla_simbolos.tmain, yycolumn, yyline, new String(yytext()));
          }
        case 81: break;
        case 33: 
          { return new Symbol(tabla_simbolos.tend, yycolumn, yyline, new String(yytext()));
          }
        case 82: break;
        case 9: 
          { return new Symbol(tabla_simbolos.tpunto, yycolumn, yyline, new String(yytext()));
          }
        case 83: break;
        case 22: 
          { String tmp=cadena; cadena="";  
                                            System.out.println("Se esperaba cierre de cadena (\")."); 
                                            yybegin(YYINITIAL);
          }
        case 84: break;
        case 45: 
          { return new Symbol(tabla_simbolos.tcase, yycolumn, yyline, new String(yytext()));
          }
        case 85: break;
        case 39: 
          { return new Symbol(tabla_simbolos.tloop, yycolumn, yyline, new String(yytext()));
          }
        case 86: break;
        case 51: 
          { return new Symbol(tabla_simbolos.tfalse, yycolumn, yyline, new String(yytext()));
          }
        case 87: break;
        case 6: 
          { return new Symbol(tabla_simbolos.tmas, yycolumn, yyline, new String(yytext()));
          }
        case 88: break;
        case 62: 
          { return new Symbol(tabla_simbolos.tboolean, yycolumn, yyline, new String(yytext()));
          }
        case 89: break;
        case 44: 
          { return new Symbol(tabla_simbolos.tstep, yycolumn, yyline, new String(yytext()));
          }
        case 90: break;
        case 31: 
          { return new Symbol(tabla_simbolos.tto, yycolumn, yyline, new String(yytext()));
          }
        case 91: break;
        case 56: 
          { return new Symbol(tabla_simbolos.tselect, yycolumn, yyline, new String(yytext()));
          }
        case 92: break;
        case 36: 
          { return new Symbol(tabla_simbolos.tsub, yycolumn, yyline, new String(yytext()));
          }
        case 93: break;
        case 2: 
          { return new Symbol(tabla_simbolos.tigual, yycolumn, yyline, new String(yytext()));
          }
        case 94: break;
        case 49: 
          { return new Symbol(tabla_simbolos.tuntil, yycolumn, yyline, new String(yytext()));
          }
        case 95: break;
        case 42: 
          { return new Symbol(tabla_simbolos.texit, yycolumn, yyline, new String(yytext()));
          }
        case 96: break;
        case 52: 
          { return new Symbol(tabla_simbolos.twhile, yycolumn, yyline, new String(yytext()));
          }
        case 97: break;
        case 57: 
          { return new Symbol(tabla_simbolos.tstatic, yycolumn, yyline, new String(yytext()));
          }
        case 98: break;
        case 17: 
          { return new Symbol(tabla_simbolos.tnumero, yycolumn, yyline, new String(yytext()));
          }
        case 99: break;
        case 15: 
          { return new Symbol(tabla_simbolos.tmayor, yycolumn, yyline, new String(yytext()));
          }
        case 100: break;
        case 21: 
          { cadena+=yytext();
          }
        case 101: break;
        case 29: 
          { return new Symbol(tabla_simbolos.tas, yycolumn, yyline, new String(yytext()));
          }
        case 102: break;
        case 37: 
          { return new Symbol(tabla_simbolos.tfor, yycolumn, yyline, new String(yytext()));
          }
        case 103: break;
        case 18: 
          { /*Espacios en blanco se ignoran*/
          }
        case 104: break;
        case 64: 
          { return new Symbol(tabla_simbolos.tconsole, yycolumn, yyline, new String(yytext()));
          }
        case 105: break;
        case 12: 
          { return new Symbol(tabla_simbolos.tparabrir, yycolumn, yyline, new String(yytext()));
          }
        case 106: break;
        case 61: 
          { return new Symbol(tabla_simbolos.tprivate, yycolumn, yyline, new String(yytext()));
          }
        case 107: break;
        case 7: 
          { return new Symbol(tabla_simbolos.tmenos, yycolumn, yyline, new String(yytext()));
          }
        case 108: break;
        case 66: 
          { return new Symbol(tabla_simbolos.tfunction, yycolumn, yyline, new String(yytext()));
          }
        case 109: break;
        case 41: 
          { return new Symbol(tabla_simbolos.telse, yycolumn, yyline, new String(yytext()));
          }
        case 110: break;
        case 26: 
          { return new Symbol(tabla_simbolos.tmayorigual, yycolumn, yyline, new String(yytext()));
          }
        case 111: break;
        case 32: 
          { return new Symbol(tabla_simbolos.tdim, yycolumn, yyline, new String(yytext()));
          }
        case 112: break;
        case 65: 
          { return new Symbol(tabla_simbolos.treadline, yycolumn, yyline, new String(yytext()));
          }
        case 113: break;
        case 24: 
          { return new Symbol(tabla_simbolos.tmenorigual, yycolumn, yyline, new String(yytext()));
          }
        case 114: break;
        case 48: 
          { return new Symbol(tabla_simbolos.tthen, yycolumn, yyline, new String(yytext()));
          }
        case 115: break;
        case 53: 
          { return new Symbol(tabla_simbolos.tmodule, yycolumn, yyline, new String(yytext()));
          }
        case 116: break;
        case 43: 
          { return new Symbol(tabla_simbolos.tnext, yycolumn, yyline, new String(yytext()));
          }
        case 117: break;
        case 55: 
          { return new Symbol(tabla_simbolos.telseif, yycolumn, yyline, new String(yytext()));
          }
        case 118: break;
        case 63: 
          { return new Symbol(tabla_simbolos.tinteger, yycolumn, yyline, new String(yytext()));
          }
        case 119: break;
        case 25: 
          { return new Symbol(tabla_simbolos.tdiferente, yycolumn, yyline, new String(yytext()));
          }
        case 120: break;
        case 1: 
          { System.out.println("Error Lexico: " + yytext() + ", en " + (yycolumn + 1) + ", " + (yyline + 1));
                                    Ventana.errores.add("Lexico-" + yytext() + "-" + (yycolumn + 1) + "-" + (yyline + 1));
          }
        case 121: break;
        case 13: 
          { return new Symbol(tabla_simbolos.tparcerrar, yycolumn, yyline, new String(yytext()));
          }
        case 122: break;
        case 28: 
          { return new Symbol(tabla_simbolos.tdo, yycolumn, yyline, new String(yytext()));
          }
        case 123: break;
        case 10: 
          { return new Symbol(tabla_simbolos.tpor, yycolumn, yyline, new String(yytext()));
          }
        case 124: break;
        case 23: 
          { String tmp=cadena+"\""; cadena=""; yybegin(YYINITIAL);  return new Symbol(tabla_simbolos.tcadena, yychar,yyline,tmp);
          }
        case 125: break;
        case 19: 
          { /*Salto de linea se ignora*/
          }
        case 126: break;
        case 67: 
          { return new Symbol(tabla_simbolos.twriteline, yycolumn, yyline, new String(yytext()));
          }
        case 127: break;
        case 40: 
          { return new Symbol(tabla_simbolos.tlong, yycolumn, yyline, new String(yytext()));
          }
        case 128: break;
        case 35: 
          { return new Symbol(tabla_simbolos.tand, yycolumn, yyline, new String(yytext()));
          }
        case 129: break;
        case 47: 
          { return new Symbol(tabla_simbolos.ttrue, yycolumn, yyline, new String(yytext()));
          }
        case 130: break;
        case 5: 
          { return new Symbol(tabla_simbolos.tcorcerrar, yycolumn, yyline, new String(yytext()));
          }
        case 131: break;
        case 54: 
          { return new Symbol(tabla_simbolos.tdouble, yycolumn, yyline, new String(yytext()));
          }
        case 132: break;
        case 27: 
          { return new Symbol(tabla_simbolos.tor, yycolumn, yyline, new String(yytext()));
          }
        case 133: break;
        case 60: 
          { return new Symbol(tabla_simbolos.treturn, yycolumn, yyline, new String(yytext()));
          }
        case 134: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(tabla_simbolos.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}