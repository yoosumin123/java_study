package trainging1_1;
//읽은 정숫값인지 약수인지 판별(등가 연산자)
import java.util.Scanner;

public class Measure1 {

	public static void main(String[] args) {
		Scanner stdIn= new Scanner (System.in);
		
		System.out.println("변수 A: "); int a = stdIn.nextInt();
		System.out.println("변수 b:"); int b= stdIn.nextInt();
		
		if (a % b == 0)
			System.out.println("B는 A의 약수입니다.");
		else
			System.out.println("B는 A의 약수가 아닙니다.");

	}

}
