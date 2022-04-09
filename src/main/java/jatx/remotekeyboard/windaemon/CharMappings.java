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
		
		charMapRus.put('à', new int[]{WinKeyCodes.KEY_F});
		charMapRus.put('À', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_F});
		charMapRus.put('á', new int[]{WinKeyCodes.KEY_OEM_COMMA});
		charMapRus.put('Á', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_OEM_COMMA});
		charMapRus.put('â', new int[]{WinKeyCodes.KEY_D});
		charMapRus.put('Â', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_D});
		
		charMapRus.put('ã', new int[]{WinKeyCodes.KEY_U});
		charMapRus.put('Ã', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_U});
		charMapRus.put('ä', new int[]{WinKeyCodes.KEY_L});
		charMapRus.put('Ä', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_L});
		charMapRus.put('å', new int[]{WinKeyCodes.KEY_T});
		charMapRus.put('Å', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_T});
		
		charMapRus.put('¸', new int[]{WinKeyCodes.KEY_OEM_3});
		charMapRus.put('¨', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_OEM_3});
		charMapRus.put('æ', new int[]{WinKeyCodes.KEY_OEM_1});
		charMapRus.put('Æ', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_OEM_1});
		charMapRus.put('ç', new int[]{WinKeyCodes.KEY_P});
		charMapRus.put('Ç', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_P});
		
		charMapRus.put('è', new int[]{WinKeyCodes.KEY_B});
		charMapRus.put('È', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_B});
		charMapRus.put('é', new int[]{WinKeyCodes.KEY_Q});
		charMapRus.put('É', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_Q});
		charMapRus.put('ê', new int[]{WinKeyCodes.KEY_R});
		charMapRus.put('Ê', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_R});
		
		charMapRus.put('ë', new int[]{WinKeyCodes.KEY_K});
		charMapRus.put('Ë', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_K});
		charMapRus.put('ì', new int[]{WinKeyCodes.KEY_V});
		charMapRus.put('Ì', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_V});
		charMapRus.put('í', new int[]{WinKeyCodes.KEY_Y});
		charMapRus.put('Í', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_Y});
		
		charMapRus.put('î', new int[]{WinKeyCodes.KEY_J});
		charMapRus.put('Î', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_J});
		charMapRus.put('ï', new int[]{WinKeyCodes.KEY_G});
		charMapRus.put('Ï', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_G});
		charMapRus.put('ð', new int[]{WinKeyCodes.KEY_H});
		charMapRus.put('Ð', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_H});
		
		charMapRus.put('ñ', new int[]{WinKeyCodes.KEY_C});
		charMapRus.put('Ñ', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_C});
		charMapRus.put('ò', new int[]{WinKeyCodes.KEY_N});
		charMapRus.put('Ò', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_N});
		charMapRus.put('ó', new int[]{WinKeyCodes.KEY_E});
		charMapRus.put('Ó', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_E});
		
		charMapRus.put('ô', new int[]{WinKeyCodes.KEY_A});
		charMapRus.put('Ô', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_A});
		charMapRus.put('õ', new int[]{WinKeyCodes.KEY_OEM_4});
		charMapRus.put('Õ', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_OEM_4});
		charMapRus.put('ö', new int[]{WinKeyCodes.KEY_W});
		charMapRus.put('Ö', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_W});
		
		charMapRus.put('÷', new int[]{WinKeyCodes.KEY_X});
		charMapRus.put('×', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_X});
		charMapRus.put('ø', new int[]{WinKeyCodes.KEY_I});
		charMapRus.put('Ø', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_I});
		charMapRus.put('ù', new int[]{WinKeyCodes.KEY_O});
		charMapRus.put('Ù', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_O});
		
		charMapRus.put('ú', new int[]{WinKeyCodes.KEY_OEM_6});
		charMapRus.put('Ú', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_OEM_6});
		charMapRus.put('û', new int[]{WinKeyCodes.KEY_S});
		charMapRus.put('Û', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_S});
		charMapRus.put('ü', new int[]{WinKeyCodes.KEY_M});
		charMapRus.put('Ü', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_M});
		
		charMapRus.put('ý', new int[]{WinKeyCodes.KEY_OEM_7});
		charMapRus.put('Ý', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_OEM_7});
		charMapRus.put('þ', new int[]{WinKeyCodes.KEY_OEM_PERIOD});
		charMapRus.put('Þ', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_OEM_PERIOD});
		charMapRus.put('ÿ', new int[]{WinKeyCodes.KEY_Z});
		charMapRus.put('ß', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_Z});
		
		///// NUMBERS:
		
		charMapRus.put('1', new int[]{WinKeyCodes.KEY_1});
		charMapRus.put('!', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_1});
		charMapRus.put('2', new int[]{WinKeyCodes.KEY_2});
		charMapRus.put('"', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_2});
		charMapRus.put('3', new int[]{WinKeyCodes.KEY_3});
		charMapRus.put('¹', new int[]{WinKeyCodes.KEY_SHIFT, WinKeyCodes.KEY_3});
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
