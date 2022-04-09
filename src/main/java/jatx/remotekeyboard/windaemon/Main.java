package jatx.remotekeyboard.windaemon;

public class Main {
	private static Daemon sDaemon;
	
	public static void main(String[] args) {
		NativeWrapper.init();
		
		//test();
		
		sDaemon = new Daemon();
		sDaemon.start();
	}
	
	public static void test() {		
		printString("Test bla !*( -=_+");
		
		
		try {
			NativeWrapper.setEngLang();
			Thread.sleep(5000);
			NativeWrapper.setRusLang();
			Thread.sleep(5000);
			NativeWrapper.setEngLang();
			Thread.sleep(5000);
			NativeWrapper.setRusLang();
			Thread.sleep(5000);
		} catch (Exception e) {
			
		}
		
		printString("1234567890-= !@#$%^&*()_+ \t\t`~\n\n[{}]\\|.,<>/?");
		
		CharMappings.setLang(CharMappings.LANG_RUS);
		
		printString("Хуй, пизда и Джигурда!!! Ёбаный пиздец");
	}
	
	public static void printString(String str) {
		for (int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			
			int[] mapping = CharMappings.getCharMapping(c);
			
			//System.out.println(mapping.length);
			
			
			for (int j=0; j<mapping.length; j++) {
				NativeWrapper.pressKey(mapping[j]);
			}
			
			for (int j=mapping.length-1; j>=0; j--) {
				NativeWrapper.releaseKey(mapping[j]);
			}
		}
	}

}
