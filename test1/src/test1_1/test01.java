package test1_1;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("구구셈 몇단: ");
			int dan = scan.nextInt();
			if(!(dan==0|| dan==1)) {
				System.out.println(dan+ "단 출력");
				for (int j = 1; j<=9; j++) {
					System.out.println(dan + "*" +j + "=" + dan*j + "\n");
				}
			}
			else {
			System.out.println("프로그램을 종료합니다.");
			break;
			}
			
		}

	}
}
