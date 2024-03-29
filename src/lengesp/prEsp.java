package lengesp;

import java.util.ArrayList;

/* prEsp.java */
/* Generated By:JavaCC: Do not edit this line. prEsp.java */
    public class prEsp implements prEspConstants {
//Propiedad para guardar los tokens
        ArrayList<Token> lista;
//Aqui termina el analizador lexico
//Parser-gramatica
  final public void tokens() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case INICIO:{
      jj_consume_token(INICIO);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case FIN:{
      jj_consume_token(FIN);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case ENT:{
      jj_consume_token(ENT);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case DEC:{
      jj_consume_token(DEC);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case CAD:{
      jj_consume_token(CAD);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case LEER:{
      jj_consume_token(LEER);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case IMPRIMIR:{
      jj_consume_token(IMPRIMIR);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case SUMA:{
      jj_consume_token(SUMA);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case RESTA:{
      jj_consume_token(RESTA);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case MULT:{
      jj_consume_token(MULT);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case DIV:{
      jj_consume_token(DIV);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case MOD:{
      jj_consume_token(MOD);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case POT:{
      jj_consume_token(POT);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case RCD:{
      jj_consume_token(RCD);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case ASIG:{
      jj_consume_token(ASIG);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case AENT:{
      jj_consume_token(AENT);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case ADEC:{
      jj_consume_token(ADEC);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case ACAD:{
      jj_consume_token(ACAD);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case COMA:{
      jj_consume_token(COMA);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case PYC:{
      jj_consume_token(PYC);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case P1:{
      jj_consume_token(P1);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case P2:{
      jj_consume_token(P2);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case C1:{
      jj_consume_token(C1);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case C2:{
      jj_consume_token(C2);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case B1:{
      jj_consume_token(B1);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case B2:{
      jj_consume_token(B2);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case IF:{
      jj_consume_token(IF);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case ELIF:{
      jj_consume_token(ELIF);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case ELSE:{
      jj_consume_token(ELSE);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case FOR:{
      jj_consume_token(FOR);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case WHILE:{
      jj_consume_token(WHILE);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case VAR:{
      jj_consume_token(VAR);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case ENTERO:{
      jj_consume_token(ENTERO);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case DECIMAL:{
      jj_consume_token(DECIMAL);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case LESST:{
      jj_consume_token(LESST);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case MORET:{
      jj_consume_token(MORET);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case EQT:{
      jj_consume_token(EQT);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case LESSEQT:{
      jj_consume_token(LESSEQT);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case MOREEQT:{
      jj_consume_token(MOREEQT);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case DIF:{
      jj_consume_token(DIF);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case AND:{
      jj_consume_token(AND);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case OR:{
      jj_consume_token(OR);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case NOT:{
      jj_consume_token(NOT);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    case CADENA:{
      jj_consume_token(CADENA);
      if (lista !=null) {
          lista.add(token);
      }
      break;
      }
    default:
      jj_la1[0] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void probar() throws ParseException {
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case INICIO:
      case FIN:
      case LEER:
      case IMPRIMIR:
      case ENT:
      case DEC:
      case CAD:
      case SUMA:
      case RESTA:
      case MULT:
      case DIV:
      case MOD:
      case POT:
      case RCD:
      case ASIG:
      case AENT:
      case ADEC:
      case ACAD:
      case COMA:
      case PYC:
      case P1:
      case P2:
      case C1:
      case C2:
      case B1:
      case B2:
      case IF:
      case ELIF:
      case ELSE:
      case FOR:
      case WHILE:
      case VAR:
      case ENTERO:
      case DECIMAL:
      case LESST:
      case MORET:
      case EQT:
      case LESSEQT:
      case MOREEQT:
      case DIF:
      case AND:
      case OR:
      case NOT:
      case CADENA:{
        ;
        break;
        }
      default:
        jj_la1[1] = jj_gen;
        break label_1;
      }
      tokens();
    }
    jj_consume_token(0);
}

  /** Generated Token Manager. */
  public prEspTokenManager token_source;
  JavaCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[2];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
	   jj_la1_init_0();
	   jj_la1_init_1();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {0xfffffffe,0xfffffffe,};
	}
	private static void jj_la1_init_1() {
	   jj_la1_1 = new int[] {0x7ffc,0x7ffc,};
	}

  /** Constructor with InputStream. */
  public prEsp(java.io.InputStream stream) {
	  this(stream, null);
          lista=null;
  }
  /** Constructor with Arraylist, InputStream */
  public prEsp(ArrayList<Token> lista,java.io.InputStream stream) {
	  this(stream, null);
          this.lista=lista;
  }
  /** Constructor with InputStream and supplied encoding */
  public prEsp(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream = new JavaCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source = new prEspTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
	  ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public prEsp(java.io.Reader stream) {
	 jj_input_stream = new JavaCharStream(stream, 1, 1);
	 token_source = new prEspTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
	   jj_input_stream = new JavaCharStream(stream, 1, 1);
	} else {
	   jj_input_stream.ReInit(stream, 1, 1);
	}
	if (token_source == null) {
 token_source = new prEspTokenManager(jj_input_stream);
	}

	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public prEsp(prEspTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(prEspTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
	 Token oldToken;
	 if ((oldToken = token).next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 if (token.kind == kind) {
	   jj_gen++;
	   return token;
	 }
	 token = oldToken;
	 jj_kind = kind;
	 throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
	 if (token.next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 jj_gen++;
	 return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
	 Token t = token;
	 for (int i = 0; i < index; i++) {
	   if (t.next != null) t = t.next;
	   else t = t.next = token_source.getNextToken();
	 }
	 return t;
  }

  private int jj_ntk_f() {
	 if ((jj_nt=token.next) == null)
	   return (jj_ntk = (token.next=token_source.getNextToken()).kind);
	 else
	   return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
	 jj_expentries.clear();
	 boolean[] la1tokens = new boolean[55];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 2; i++) {
	   if (jj_la1[i] == jj_gen) {
		 for (int j = 0; j < 32; j++) {
		   if ((jj_la1_0[i] & (1<<j)) != 0) {
			 la1tokens[j] = true;
		   }
		   if ((jj_la1_1[i] & (1<<j)) != 0) {
			 la1tokens[32+j] = true;
		   }
		 }
	   }
	 }
	 for (int i = 0; i < 55; i++) {
	   if (la1tokens[i]) {
		 jj_expentry = new int[1];
		 jj_expentry[0] = i;
		 jj_expentries.add(jj_expentry);
	   }
	 }
	 int[][] exptokseq = new int[jj_expentries.size()][];
	 for (int i = 0; i < jj_expentries.size(); i++) {
	   exptokseq[i] = jj_expentries.get(i);
	 }
	 return new ParseException(token, exptokseq, tokenImage);
  }

  private boolean trace_enabled;

/** Trace enabled. */
  final public boolean trace_enabled() {
	 return trace_enabled;
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

                        }
