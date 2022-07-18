package Assignment2_06;

import java.util.Scanner;

public class Assignment2_06_4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("확인할 년도 : ");int year = sc.nextInt();
		
		if(year%2==0 && year%100!=0) {
			System.out.println("윤년입니다.");
		}else if(year%400==0){
			System.out.println("윤년입니다.");
		}else {
			System.out.println("윤년이 아닙니다.");
		}
	}
}
