package com.inputstick.api.layout;


public class PolishLayout extends KeyboardLayout {
	
	public static final String LOCALE_NAME = "pl-PL";
	
	
	
	private static final int[][] FAST_LUT = {
		{    0,	    0,	    0,	    0,	    0	},	
		{   27,	    1,	   47,	    0,	    0	},	
		{   28,	    1,	   49,	    0,	    0	},	
		{   29,	    1,	   48,	    0,	    0	},	
		{   32,	    0,	   44,	    0,	    0	},	
		{   33,	    2,	   30,	    0,	    0	},	
		{   34,	    2,	   52,	    0,	    0	},	
		{   35,	    2,	   32,	    0,	    0	},	
		{   36,	    2,	   33,	    0,	    0	},	
		{   37,	    2,	   34,	    0,	    0	},	
		{   38,	    2,	   36,	    0,	    0	},	
		{   39,	    0,	   52,	    0,	    0	},	
		{   40,	    2,	   38,	    0,	    0	},	
		{   41,	    2,	   39,	    0,	    0	},	
		{   42,	    2,	   37,	    0,	    0	},	
		{   43,	    2,	   46,	    0,	    0	},	
		{   44,	    0,	   54,	    0,	    0	},	
		{   45,	    0,	   45,	    0,	    0	},	
		{   46,	    0,	   55,	    0,	    0	},	
		{   47,	    0,	   56,	    0,	    0	},	
		{   48,	    0,	   39,	    0,	    0	},	
		{   49,	    0,	   30,	    0,	    0	},	
		{   50,	    0,	   31,	    0,	    0	},	
		{   51,	    0,	   32,	    0,	    0	},	
		{   52,	    0,	   33,	    0,	    0	},	
		{   53,	    0,	   34,	    0,	    0	},	
		{   54,	    0,	   35,	    0,	    0	},	
		{   55,	    0,	   36,	    0,	    0	},	
		{   56,	    0,	   37,	    0,	    0	},	
		{   57,	    0,	   38,	    0,	    0	},	
		{   58,	    2,	   51,	    0,	    0	},	
		{   59,	    0,	   51,	    0,	    0	},	
		{   60,	    2,	   54,	    0,	    0	},	
		{   61,	    0,	   46,	    0,	    0	},	
		{   62,	    2,	   55,	    0,	    0	},	
		{   63,	    2,	   56,	    0,	    0	},	
		{   64,	    2,	   31,	    0,	    0	},	
		{   65,	    2,	    4,	    0,	    0	},	
		{   66,	    2,	    5,	    0,	    0	},	
		{   67,	    2,	    6,	    0,	    0	},	
		{   68,	    2,	    7,	    0,	    0	},	
		{   69,	    2,	    8,	    0,	    0	},	
		{   70,	    2,	    9,	    0,	    0	},	
		{   71,	    2,	   10,	    0,	    0	},	
		{   72,	    2,	   11,	    0,	    0	},	
		{   73,	    2,	   12,	    0,	    0	},	
		{   74,	    2,	   13,	    0,	    0	},	
		{   75,	    2,	   14,	    0,	    0	},	
		{   76,	    2,	   15,	    0,	    0	},	
		{   77,	    2,	   16,	    0,	    0	},	
		{   78,	    2,	   17,	    0,	    0	},	
		{   79,	    2,	   18,	    0,	    0	},	
		{   80,	    2,	   19,	    0,	    0	},	
		{   81,	    2,	   20,	    0,	    0	},	
		{   82,	    2,	   21,	    0,	    0	},	
		{   83,	    2,	   22,	    0,	    0	},	
		{   84,	    2,	   23,	    0,	    0	},	
		{   85,	    2,	   24,	    0,	    0	},	
		{   86,	    2,	   25,	    0,	    0	},	
		{   87,	    2,	   26,	    0,	    0	},	
		{   88,	    2,	   27,	    0,	    0	},	
		{   89,	    2,	   28,	    0,	    0	},	
		{   90,	    2,	   29,	    0,	    0	},	
		{   91,	    0,	   47,	    0,	    0	},	
		{   92,	    0,	   49,	    0,	    0	},	
		{   93,	    0,	   48,	    0,	    0	},	
		{   94,	    2,	   35,	    0,	    0	},	
		{   95,	    2,	   45,	    0,	    0	},	
		{   96,	    0,	   53,	    0,	    0	},	
		{   97,	    0,	    4,	    0,	    0	},	
		{   98,	    0,	    5,	    0,	    0	},	
		{   99,	    0,	    6,	    0,	    0	},	
		{  100,	    0,	    7,	    0,	    0	},	
		{  101,	    0,	    8,	    0,	    0	},	
		{  102,	    0,	    9,	    0,	    0	},	
		{  103,	    0,	   10,	    0,	    0	},	
		{  104,	    0,	   11,	    0,	    0	},	
		{  105,	    0,	   12,	    0,	    0	},	
		{  106,	    0,	   13,	    0,	    0	},	
		{  107,	    0,	   14,	    0,	    0	},	
		{  108,	    0,	   15,	    0,	    0	},	
		{  109,	    0,	   16,	    0,	    0	},	
		{  110,	    0,	   17,	    0,	    0	},	
		{  111,	    0,	   18,	    0,	    0	},	
		{  112,	    0,	   19,	    0,	    0	},	
		{  113,	    0,	   20,	    0,	    0	},	
		{  114,	    0,	   21,	    0,	    0	},	
		{  115,	    0,	   22,	    0,	    0	},	
		{  116,	    0,	   23,	    0,	    0	},	
		{  117,	    0,	   24,	    0,	    0	},	
		{  118,	    0,	   25,	    0,	    0	},	
		{  119,	    0,	   26,	    0,	    0	},	
		{  120,	    0,	   27,	    0,	    0	},	
		{  121,	    0,	   28,	    0,	    0	},	
		{  122,	    0,	   29,	    0,	    0	},	
		{  123,	    2,	   47,	    0,	    0	},	
		{  124,	    2,	   49,	    0,	    0	},	
		{  125,	    2,	   48,	    0,	    0	},	
		{  126,	    0,	   44,	    2,	   53	},	
		{  211,	   66,	   18,	    0,	    0	},	
		{  243,	   64,	   18,	    0,	    0	},	
		{  260,	   66,	    4,	    0,	    0	},	
		{  261,	   64,	    4,	    0,	    0	},	
		{  262,	   66,	    6,	    0,	    0	},	
		{  263,	   64,	    6,	    0,	    0	},	
		{  280,	   66,	    8,	    0,	    0	},	
		{  281,	   64,	    8,	    0,	    0	},	
		{  321,	   66,	   15,	    0,	    0	},	
		{  322,	   64,	   15,	    0,	    0	},	
		{  323,	   66,	   17,	    0,	    0	},	
		{  324,	   64,	   17,	    0,	    0	},	
		{  346,	   66,	   22,	    0,	    0	},	
		{  347,	   64,	   22,	    0,	    0	},	
		{  377,	   66,	   27,	    0,	    0	},	
		{  378,	   64,	   27,	    0,	    0	},	
		{  379,	   66,	   29,	    0,	    0	},	
		{  380,	   64,	   29,	    0,	    0	},	
		{ 8364,	   64,	   24,	    0,	    0	},	
	};	
	
	public static final int LUT[][] = {
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	0	,	(int)'1'	,	0x21	,	-1	,	-1	,	-1	}	,
		{	0	,	(int)'2'	,	0x40	,	-1	,	-1	,	-1	}	,
		{	0	,	(int)'3'	,	0x23	,	-1	,	-1	,	-1	}	,
		{	0	,	(int)'4'	,	0x24	,	-1	,	-1	,	-1	}	,
		{	0	,	(int)'5'	,	0x25	,	-1	,	-1	,	-1	}	,
		{	0	,	(int)'6'	,	0x005e	,	-1	,	-1	,	-1	}	,
		{	0	,	(int)'7'	,	0x26	,	-1	,	-1	,	-1	}	,
		{	0	,	(int)'8'	,	0x002a	,	-1	,	-1	,	-1	}	,
		{	0	,	(int)'9'	,	0x28	,	-1	,	-1	,	-1	}	,
		{	0	,	(int)'0'	,	0x29	,	-1	,	-1	,	-1	}	,
		{	0	,	0x002d		,	0x005f	,	-1	,	-1	,	-1	}	,
		{	0	,	0x003d		,	0x002b	,	-1	,	-1	,	-1	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
	
		{	1	,	(int)'q'	,	(int)'Q'	,	-1	,	-1	,	-1	}	,
		{	1	,	(int)'w'	,	(int)'W'	,	-1	,	-1	,	-1	}	,
		{	5	,	(int)'e'	,	(int)'E'	,	-1	,	0x119	,	0x118	}	,
		{	1	,	(int)'r'	,	(int)'R'	,	-1	,	-1	,	-1	}	,
		{	1	,	(int)'t'	,	(int)'T'	,	-1	,	-1	,	-1	}	,
		{	1	,	(int)'y'	,	(int)'Y'	,	-1	,	-1	,	-1	}	,
		{	1	,	(int)'u'	,	(int)'U'	,	-1	,	0x20ac	,	-1	}	,
		{	1	,	(int)'i'	,	(int)'I'	,	-1	,	-1	,	-1	}	,
		{	5	,	(int)'o'	,	(int)'O'	,	-1	,	0x00f3	,	0x00d3	}	,
		{	1	,	(int)'p'	,	(int)'P'	,	-1	,	-1	,	-1	}	,
		{	0	,	0x005b	,	0x007b	,	0x001b	,	-1	,	-1	}	,
		{	0	,	0x005d	,	0x007d	,	0x001d	,	-1	,	-1	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	5	,	(int)'a'	,	(int)'A'	,	-1	,	0x105	,	0x104	}	,
		{	5	,	(int)'s'	,	(int)'S'	,	-1	,	0x015b	,	0x015a	}	,
	
		{	1	,	(int)'d'	,	(int)'D'	,	-1	,	-1	,	-1	}	,
		{	1	,	(int)'f'	,	(int)'F'	,	-1	,	-1	,	-1	}	,
		{	1	,	(int)'g'	,	(int)'G'	,	-1	,	-1	,	-1	}	,
		{	1	,	(int)'h'	,	(int)'H'	,	-1	,	-1	,	-1	}	,
		{	1	,	(int)'j'	,	(int)'J'	,	-1	,	-1	,	-1	}	,
		{	1	,	(int)'k'	,	(int)'K'	,	-1	,	-1	,	-1	}	,
		{	5	,	(int)'l'	,	(int)'L'	,	-1	,	0x142	,	0x141	}	,
		{	0	,	0x003b	,	0x003a	,	0x001d	,	-1	,	-1	}	,
		{	0	,	0x27	,	0x22	,	-1	,	-1	,	-1	}	,
		{	0	,	0x60	,	0x007e	,	-1	,	-1	,	-1	}	, 
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	0	,	0x005c	,	0x007c	,	0x001c	,	-1	,	-1	}	,
		{	5	,	(int)'z'	,	(int)'Z'	,	-1	,	0x017c	,	0x017b	}	,
		{	5	,	(int)'x'	,	(int)'X'	,	-1	,	0x017a	,	0x179	}	,
		{	5	,	(int)'c'	,	(int)'C'	,	-1	,	0x107	,	0x106	}	,
		{	1	,	(int)'v'	,	(int)'V'	,	-1	,	-1	,	-1	}	,
	
		{	1	,	(int)'b'	,	(int)'B'	,	-1	,	-1	,	-1	}	,
		{	5	,	(int)'n'	,	(int)'N'	,	-1	,	0x144	,	0x143	}	,
		{	1	,	(int)'m'	,	(int)'M'	,	-1	,	-1	,	-1	}	,
		{	0	,	0x002c	,	0x003c	,	-1	,	-1	,	-1	}	,
		{	0	,	0x002e	,	0x003e	,	-1	,	-1	,	-1	}	,
		{	0	,	0x002f	,	0x003f	,	-1	,	-1	,	-1	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	0	,	0x20	,	0x20	,	0x20	,	-1	,	-1	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
	
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,	
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,	
	
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,	
		{	0	,	0x002c	,	0x002c		,	-1	,	-1	,	-1	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,	
		{	0	,	0x005c	,	0x007c		,	0x001c	,	-1	,	-1	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,	
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,
		{	-1	,	0			,	0		,	0	,	0	,	0	}	,		
	
		
	};
	
	public static final int DEADKEYS[] = {
		0x007e
	};
	
	public static final int DEADKEY_LUT[][] = {
		{	0x007e	,	0x006e	,	0x0144	}	,
		{	0x007e	,	0x0063	,	0x0107	}	,
		{	0x007e	,	0x0078	,	0x017a	}	,
		{	0x007e	,	0x007a	,	0x017c	}	,
		{	0x007e	,	0x0061	,	0x0105	}	,
		{	0x007e	,	0x0073	,	0x015b	}	,
		{	0x007e	,	0x006c	,	0x0142	}	,
		{	0x007e	,	0x0065	,	0x0119	}	,
		{	0x007e	,	0x006f	,	0x00f3	}	,
		{	0x007e	,	0x004e	,	0x0143	}	,
		{	0x007e	,	0x0043	,	0x0106	}	,
		{	0x007e	,	0x0058	,	0x0179	}	,
		{	0x007e	,	0x005a	,	0x017b	}	,
		{	0x007e	,	0x0041	,	0x0104	}	,
		{	0x007e	,	0x0053	,	0x015a	}	,
		{	0x007e	,	0x004c	,	0x0141	}	,
		{	0x007e	,	0x0045	,	0x0118	}	,
		{	0x007e	,	0x004f	,	0x00d3	}	,
		{	0x007e	,	0x0020	,	0x007e	}	,
	};	
	
	private static PolishLayout instance = new PolishLayout();
	
	private PolishLayout() {
	}
	
	public static PolishLayout getInstance() {
		return instance;
	}	

	@Override
	public int[][] getLUT() {
		return LUT;
	}

	@Override
	public int[][] getFastLUT() {
		return FAST_LUT;
	}

	@Override
	public void type(String text) {
		super.type(FAST_LUT, text, (byte)0);
	}	
	
	@Override
	public void type(String text, byte modifiers) {
		super.type(FAST_LUT, text, modifiers);
	}

	@Override
	public char getChar(int scanCode, boolean capsLock, boolean shift, boolean altGr) {
		return super.getChar(LUT, scanCode, capsLock, shift, altGr);
	}

	@Override
	public String getLocaleName() {		
		return LOCALE_NAME;
	}	
	
	@Override
	public int[][] getDeadkeyLUT() {		
		return DEADKEY_LUT;
	}

	@Override
	public int[] getDeadkeys() {
		return DEADKEYS;
	}

}
