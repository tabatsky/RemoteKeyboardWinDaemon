/*
 * CppTest.cpp
 *
 *  Created on: 17 июня 2015 г.
 *      Author: User
 */
 
/// 0x0501 - Win XP
/// 0x0502 - Win Server 2003
/// 0x0600 - Win Vista
/// 0x0601 - Win 7
/// 0x0602 - Win 8
/// 0x0603 - Win 8.1

#define WINVER 0x0501
 
#include "jatx_remotekeyboard_windaemon_NativeWrapper.h"

#include <windows.h>

JNIEXPORT void JNICALL Java_jatx_remotekeyboard_windaemon_NativeWrapper_pressKey (JNIEnv *env, jclass clazz, jint keyCode) {
	INPUT ip = {0};

	ip.type = INPUT_KEYBOARD;
	
	ip.ki.wVk = keyCode; 
	ip.ki.dwFlags = 0; // 0 for key press
	SendInput(1, &ip, sizeof(INPUT));  
}
  
JNIEXPORT void JNICALL Java_jatx_remotekeyboard_windaemon_NativeWrapper_releaseKey (JNIEnv *env, jclass clazz, jint keyCode) {
	INPUT ip = {0};

	ip.type = INPUT_KEYBOARD;
	
	ip.ki.wVk = keyCode; 
	ip.ki.dwFlags = KEYEVENTF_KEYUP; // 0 for key press
	SendInput(1, &ip, sizeof(INPUT));  
}

JNIEXPORT void JNICALL Java_jatx_remotekeyboard_windaemon_NativeWrapper_setRusLang (JNIEnv *env, jclass clazz) {
	int rus = 0x0419;
	
	//HKL current = GetKeyboardLayout(0);
	//printf("%x\n", current);
	
	PostMessage(HWND_BROADCAST, WM_INPUTLANGCHANGEREQUEST, 0, rus); 
	PostMessage(GetForegroundWindow(), WM_INPUTLANGCHANGEREQUEST, 0, rus); 
}

JNIEXPORT void JNICALL Java_jatx_remotekeyboard_windaemon_NativeWrapper_setEngLang (JNIEnv *env, jclass clazz) {
	int eng = 0x0409;
	
	//HKL current = GetKeyboardLayout(0);
	//printf("%x\n", current);
	
	PostMessage(HWND_BROADCAST, WM_INPUTLANGCHANGEREQUEST, 0, eng); 
	PostMessage(GetForegroundWindow(), WM_INPUTLANGCHANGEREQUEST, 0, eng); 
}

/*
	//const char* RUS_LANG = "00000419";
	//HKL rusHkl = LoadKeyboardLayout(RUS_LANG, 0);
	//const char* ENG_LANG = "00000409";
	//HKL engHkl = LoadKeyboardLayout(ENG_LANG, 0);
*/