package p687;

import p685.MyFuntionlInterface;

public class UsingLocalVariable {
	void method(int arg) {
		int localVar = 40;
		
		MyFuntionlInterface fi = () -> {
			System.out.println("arg : " + arg);
			System.out.println("localVar: " + localVar + "\n");
		};
		fi.method();
	}
}
