package training2_2;

import java.util.Scanner;

public class test {

    static void add(int a,int b) {
	System.out.println("a + b = "+(a+b));
    }
	
    static void sub(int a,int b) {
	System.out.println("a - b = "+(a-b));
    }
	
    static void mul(int a,int b) {
	System.out.println("a * b = "+(a*b));
    }
	
    static void div(int a,int b) {
	System.out.println("a / b = "+(a/b) + " 나머지는 "+(a%b)+"입니다." );
    }
	
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("정수 a를 입력하세요 : "); int a = scan.nextInt();
	System.out.print("정수 b를 입력하세요 : "); int b = scan.nextInt();
		
	add(a,b);
	sub(a,b);
	mul(a,b);
	div(a,b);
    }
}






