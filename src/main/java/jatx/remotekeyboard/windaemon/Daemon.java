package jatx.remotekeyboard.windaemon;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class Daemon extends Thread {
	public static final int CONNECT_PORT = 10307;	
	public static final int SO_TIMEOUT = 3000;
	
	public static final byte PRESS = 1;
	public static final byte RELEASE = 2;
	public static final byte PRESS_RELEASE = 3;
	public static final byte PSEUDO = 16;
	public static final byte DUMMY = (byte)128;
	
	@Override
	public void run() {
		System.out.println("daemon thread started");
		
		ServerSocket ss = null;
		
		try {
			while (true) {
				try {
					Thread.sleep(100);
					
					ss = new ServerSocket(CONNECT_PORT);
					System.out.println("new server socket");
					ss.setSoTimeout(SO_TIMEOUT);
					
					Socket s = ss.accept();
					System.out.println("connection accepted");
					
					session(s);
				} catch (SocketTimeoutException e) { 
					System.out.println("server socket timeout");
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						ss.close();
						System.out.println("server socket closed");
					} catch (Exception e) {
						System.out.println("server socket close error");
					}
				}
				
			}
		} catch (InterruptedException e) {
			System.out.println("daemon thread interrupted");
		}
	}
	
	private void session(Socket socket) {
		System.out.println("session start");
		
		InputStream is = null;
		
		try {
			is = socket.getInputStream();
			int byteCounter = 0;
			
			byte[] word = new byte[2];
			
outer:		while (true) {
				while (byteCounter<2) {
					int bytesRead = is.read(word, byteCounter, 2-byteCounter);
					
					if (bytesRead>=0) {
						byteCounter += bytesRead;
					} else {
						break outer;
					}
					
				}
				
				byteCounter = 0;
				
				if (word[0]==DUMMY&&word[1]==DUMMY) {
					//System.out.println("DUMMY");
					continue outer;
				}
				
				int b0 = 0x000000FF&word[0];
				int b1 = 0x000000FF&word[1];
					
				if (b0==PRESS) {
					NativeWrapper.pressKey(b1);
				} else if (b0==RELEASE) {
					NativeWrapper.releaseKey(b1);
				} else if (b0==PRESS_RELEASE) {
					NativeWrapper.pressKey(b1);
					NativeWrapper.releaseKey(b1);
				} else if (b0==(PSEUDO|PRESS)) {
					if (b1==(WinKeyCodes.PSEUDO_KEY_EN_RU&0x000000FF)) {
						NativeWrapper.setRusLang();
					} else if (b1==(WinKeyCodes.PSEUDO_KEY_EXIT&0x000000FF)) {
						System.out.println("Exit Command Received");
						System.exit(0);
					}
				} else if (b0==(PSEUDO|RELEASE)) {
					if (b1==(WinKeyCodes.PSEUDO_KEY_EN_RU&0x000000FF)) {
						NativeWrapper.setEngLang();
					}
				} 
				
				System.out.println(Integer.toString(b0) + "," + Integer.toString(b1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				System.out.println("input stream closed");
			} catch (Exception e) {
				System.out.println("input stream close error");
			}
			
			try {
				socket.close();
				System.out.println("socket closed");
			} catch (Exception e) {
				System.out.println("socket close error");
			}
			
			System.out.println("session end");
		}
	}
}
