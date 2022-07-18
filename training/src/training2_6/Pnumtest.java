package training2_6;

import java.util.Scanner;

public class Pnumtest {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자입력"); int num= scan.nextInt();
		
			for(int i=2; i<num; i++) {
				if(num%i==0) {
					System.out.println("num:" + "소수아님");
					break;
				}
				if(i == num-1) {
					System.out.println("num:" + "소수");
				}
			}	
	}
}
