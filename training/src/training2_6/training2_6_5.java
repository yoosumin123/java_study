package training2_6;

import java.util.Scanner;

public class training2_6_5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int check;
		do {
			System.out.print("확인할 정수(2이상) : "); check = sc.nextInt();
		} while (check<2);
		for(int i=2;i<check;i++) {
			if(check%i==0) {
				System.out.println(check+"는 소수가 아님.");
				break;
			}
			if(i==check-1) {
				System.out.println(check+"는 소수임.");
			}
		}
	}
}
