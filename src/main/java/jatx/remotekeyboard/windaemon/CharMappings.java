package jatx.remotekeyboard.windaemon;

import java.util.HashMap;
import java.util.Map;

public class CharMappings {
	public static final Map<Character,int[]> charMapEng;
	public static final Map<Character,int[]> charMapRus;
	
	public static final int LANG_ENG = 0;
	public static final int LANG_RUS = 1;
	
	private static int lang = LANG_ENG;
	
	static {
		charMapEng = new HashMap<Character,int[]>();
		charMapRus = new HashMap<Character,int[]>();
		
		initEngMap();
		initRusMap();
	}
	
	public static void setLang(int lng) {
		lang = lng;
	}
	
	public static int[] getCharMapping(char c) {
		if (lang==LANG_ENG) {
			return charMapEng.get(c);
		} else {
			return charMapRus.get(c);
		}
	}
	
	private static void initEngMap() {
		///// LETTERS:
		
		charMapEng.put('a', new int[]{WinKeyCodes.KEY_A});
		charMapEng.put('A', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_A});
		charMapEng.put('b', new int[]{WinKeyCodes.KEY_B});
		charMapEng.put('B', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_B});
		charMapEng.put('c', new int[]{WinKeyCodes.KEY_C});
		charMapEng.put('C', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_C});
		
		charMapEng.put('d', new int[]{WinKeyCodes.KEY_D});
		charMapEng.put('D', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_D});
		charMapEng.put('e', new int[]{WinKeyCodes.KEY_E});
		charMapEng.put('E', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_E});
		charMapEng.put('f', new int[]{WinKeyCodes.KEY_F});
		charMapEng.put('F', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_F});
		
		charMapEng.put('g', new int[]{WinKeyCodes.KEY_G});
		charMapEng.put('G', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_G});
		charMapEng.put('h', new int[]{WinKeyCodes.KEY_H});
		charMapEng.put('H', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_H});
		charMapEng.put('i', new int[]{WinKeyCodes.KEY_I});
		charMapEng.put('I', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_I});
		
		charMapEng.put('j', new int[]{WinKeyCodes.KEY_J});
		charMapEng.put('J', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_J});
		charMapEng.put('k', new int[]{WinKeyCodes.KEY_K});
		charMapEng.put('K', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_K});
		charMapEng.put('l', new int[]{WinKeyCodes.KEY_L});
		charMapEng.put('L', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_L});
		
		charMapEng.put('m', new int[]{WinKeyCodes.KEY_M});
		charMapEng.put('M', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_M});
		charMapEng.put('n', new int[]{WinKeyCodes.KEY_N});
		charMapEng.put('N', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_N});
		charMapEng.put('o', new int[]{WinKeyCodes.KEY_O});
		charMapEng.put('O', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_O});
		
		charMapEng.put('p', new int[]{WinKeyCodes.KEY_P});
		charMapEng.put('P', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_P});
		charMapEng.put('q', new int[]{WinKeyCodes.KEY_Q});
		charMapEng.put('Q', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_Q});
		charMapEng.put('r', new int[]{WinKeyCodes.KEY_R});
		charMapEng.put('R', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_R});

		charMapEng.put('s', new int[]{WinKeyCodes.KEY_S});
		charMapEng.put('S', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_S});
		charMapEng.put('t', new int[]{WinKeyCodes.KEY_T});
		charMapEng.put('T', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_T});
		charMapEng.put('u', new int[]{WinKeyCodes.KEY_U});
		charMapEng.put('U', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_U});
		
		charMapEng.put('v', new int[]{WinKeyCodes.KEY_V});
		charMapEng.put('V', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_V});
		charMapEng.put('w', new int[]{WinKeyCodes.KEY_W});
		charMapEng.put('W', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_W});
		charMapEng.put('x', new int[]{WinKeyCodes.KEY_X});
		charMapEng.put('X', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_X});
		
		charMapEng.put('y', new int[]{WinKeyCodes.KEY_Y});
		charMapEng.put('Y', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_Y});
		charMapEng.put('z', new int[]{WinKeyCodes.KEY_Z});
		charMapEng.put('Z', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_Z});
		
		///// OEM:
		
		charMapEng.put(';', new int[]{WinKeyCodes.KEY_OEM_1});
		charMapEng.put(':', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_OEM_1});
		charMapEng.put('/', new int[]{WinKeyCodes.KEY_OEM_2});
		charMapEng.put('?', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_OEM_2});
		charMapEng.put('`', new int[]{WinKeyCodes.KEY_OEM_3});
		charMapEng.put('~', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_OEM_3});
		charMapEng.put('[', new int[]{WinKeyCodes.KEY_OEM_4});
		charMapEng.put('{', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_OEM_4});
		charMapEng.put('\\', new int[]{WinKeyCodes.KEY_OEM_5});
		charMapEng.put('|', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_OEM_5});
		charMapEng.put(']', new int[]{WinKeyCodes.KEY_OEM_6});
		charMapEng.put('}', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_OEM_6});
		charMapEng.put('\'', new int[]{WinKeyCodes.KEY_OEM_7});
		charMapEng.put('"', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_OEM_7});
		
		/////
		
		charMapEng.put('=', new int[]{WinKeyCodes.KEY_OEM_PLUS});
		charMapEng.put('+', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_OEM_PLUS});
		charMapEng.put('-', new int[]{WinKeyCodes.KEY_OEM_MINUS});
		charMapEng.put('_', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_OEM_MINUS});
		charMapEng.put(',', new int[]{WinKeyCodes.KEY_OEM_COMMA});
		charMapEng.put('<', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_OEM_COMMA});
		charMapEng.put('.', new int[]{WinKeyCodes.KEY_OEM_PERIOD});
		charMapEng.put('>', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_OEM_PERIOD});
			
		
		///// NUMBERS:
		
		charMapEng.put('1', new int[]{WinKeyCodes.KEY_1});
		charMapEng.put('!', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_1});
		charMapEng.put('2', new int[]{WinKeyCodes.KEY_2});
		charMapEng.put('@', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_2});
		charMapEng.put('3', new int[]{WinKeyCodes.KEY_3});
		charMapEng.put('#', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_3});
		charMapEng.put('4', new int[]{WinKeyCodes.KEY_4});
		charMapEng.put('$', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_4});
		charMapEng.put('5', new int[]{WinKeyCodes.KEY_5});
		charMapEng.put('%', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_5});
		
		charMapEng.put('6', new int[]{WinKeyCodes.KEY_6});
		charMapEng.put('^', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_6});
		charMapEng.put('7', new int[]{WinKeyCodes.KEY_7});
		charMapEng.put('&', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_7});
		charMapEng.put('8', new int[]{WinKeyCodes.KEY_8});
		charMapEng.put('*', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_8});
		charMapEng.put('9', new int[]{WinKeyCodes.KEY_9});
		charMapEng.put('(', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_9});
		charMapEng.put('0', new int[]{WinKeyCodes.KEY_0});
		charMapEng.put(')', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_0});
		
		/////
		
		charMapEng.put(' ', new int[]{WinKeyCodes.KEY_SPACE});
		charMapEng.put('\t', new int[]{WinKeyCodes.KEY_TAB});
		charMapEng.put('\n', new int[]{WinKeyCodes.KEY_ENTER});
	}
	
	private static void initRusMap() {
		///// LETTERS:
		
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_F});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_F});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_OEM_COMMA});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_OEM_COMMA});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_D});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_D});
		
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_U});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_U});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_L});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_L});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_T});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_T});
		
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_OEM_3});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_OEM_3});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_OEM_1});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_OEM_1});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_P});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_P});
		
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_B});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_B});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_Q});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_Q});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_R});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_R});
		
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_K});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_K});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_V});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_V});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_Y});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_Y});
		
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_J});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_J});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_G});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_G});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_H});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_H});
		
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_C});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_C});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_N});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_N});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_E});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_E});
		
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_A});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_A});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_OEM_4});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_OEM_4});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_W});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_W});
		
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_X});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_X});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_I});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_I});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_O});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_O});
		
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_OEM_6});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_OEM_6});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_S});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_S});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_M});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_M});
		
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_OEM_7});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_OEM_7});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_OEM_PERIOD});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_OEM_PERIOD});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_Z});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_Z});
		
		///// NUMBERS:
		
		charMapRus.put('1', new int[]{WinKeyCodes.KEY_1});
		charMapRus.put('!', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_1});
		charMapRus.put('2', new int[]{WinKeyCodes.KEY_2});
		charMapRus.put('"', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_2});
		charMapRus.put('3', new int[]{WinKeyCodes.KEY_3});
		charMapRus.put('�', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_3});
		charMapRus.put('4', new int[]{WinKeyCodes.KEY_4});
		charMapRus.put(';', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_4});
		charMapRus.put('5', new int[]{WinKeyCodes.KEY_5});
		charMapRus.put('%', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_5});
			
		charMapRus.put('6', new int[]{WinKeyCodes.KEY_6});
		charMapRus.put(':', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_6});
		charMapRus.put('7', new int[]{WinKeyCodes.KEY_7});
		charMapRus.put('?', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_7});
		charMapRus.put('8', new int[]{WinKeyCodes.KEY_8});
		charMapRus.put('*', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_8});
		charMapRus.put('9', new int[]{WinKeyCodes.KEY_9});
		charMapRus.put('(', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_9});
		charMapRus.put('0', new int[]{WinKeyCodes.KEY_0});
		charMapRus.put(')', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_0});
		
		///// OEM:
		
		charMapRus.put('.', new int[]{WinKeyCodes.KEY_OEM_2});
		charMapRus.put(',', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_OEM_2});
		charMapRus.put('\\', new int[]{WinKeyCodes.KEY_OEM_5});
		charMapRus.put('/', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_OEM_5});
			
		/////
			
		charMapRus.put('=', new int[]{WinKeyCodes.KEY_OEM_PLUS});
		charMapRus.put('+', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_OEM_PLUS});
		charMapRus.put('-', new int[]{WinKeyCodes.KEY_OEM_MINUS});
		charMapRus.put('_', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_OEM_MINUS});		
			
		/////
		
		charMapRus.put(' ', new int[]{WinKeyCodes.KEY_SPACE});
		charMapRus.put('\t', new int[]{WinKeyCodes.KEY_TAB});
		charMapRus.put('\n', new int[]{WinKeyCodes.KEY_ENTER});
	}
}
