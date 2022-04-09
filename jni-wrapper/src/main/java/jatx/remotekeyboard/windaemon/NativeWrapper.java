package jatx.remotekeyboard.windaemon;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class NativeWrapper {

	static {
		System.out.println("\nInit NativeWrapper class\n");
		
		System.out.println("OS: " + System.getProperty("os.name"));
		System.out.println("OS Version: " + System.getProperty("os.version"));
		System.out.println("OS Arch: " + System.getProperty("os.arch"));
		
		String arch = System.getProperty("os.arch");
		
		if (arch.equals("x86")) {
			try {
//				System.loadLibrary("libgcc_s_dw2-1");
//				System.loadLibrary("libstdc++-6");
//				System.loadLibrary("jni-wrapper");

				loadJarDll("/jni-wrapper.dll");
				System.out.println("\nNative Libs for Windows 32 bit loaded successfully");
			} catch (IOException e) {
				System.out.println("\ncannot load native libs");
				System.exit(0);
			}
		} else if (arch.equals("amd64")) {
			try {
				loadJarDll("/jni-wrapper.dll");
				System.out.println("\nNative Libs for Windows 64 bit loaded successfully");
			} catch (IOException e) {
				System.out.println("\ncannot load native libs");
				System.exit(0);
			}
		} else {
			System.out.println("\nNative Libs not found: wrong arch");
			System.exit(0);
		}
		
		System.out.println("\nInit NativeWrapper complete\n");
	}
	
	public static void init() {}
	
	public static native void pressKey(int keyCode);
	public static native void releaseKey(int keyCode);
	
	public static native void setRusLang();
	public static native void setEngLang();

	private static void loadJarDll(String name) throws IOException {
		InputStream in = NativeWrapper.class.getResourceAsStream(name);
		byte[] buffer = new byte[1024];
		int read = -1;
		File temp = File.createTempFile(name, "");
		FileOutputStream fos = new FileOutputStream(temp);

		while((read = in.read(buffer)) != -1) {
			fos.write(buffer, 0, read);
		}
		fos.close();
		in.close();

		System.load(temp.getAbsolutePath());
	}
}
