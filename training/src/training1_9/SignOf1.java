package training1_9;

import java.util.Scanner;

public class SignOf1 {
	static int signOf(int n) {
		int sign = 0;
		
		if(n>0)
			sign=1;
		else if(n<0)
			sign =-1;
		
		return sign ;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 x:");
		int x = stdIn.nextInt();
		
		int s = signOf(x);
		System.out.println("signOf(x)는 " +s + "입니다.");

	}

}
