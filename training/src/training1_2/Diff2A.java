package training1_2;
// 읽은 두 정숫값의 차를 표시(방법1:if문)
import java.util.Scanner;

public class Diff2A {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("정수 a:"); int a= stdIn.nextInt();
		System.out.println("정수 b:"); int b= stdIn.nextInt();
		
		int diff;
		if (a >= b)
			diff= a- b;
		else 
			diff= b- a;
		
		System.out.println("두 값의 차는 " + diff + "입니다.");

	}

}
