package trainging1_1;
//가져온 정수 값은 약 몇인지 여부(논리 부정 연산자)
import java.util.Scanner;

public class Measure2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("변수A :"); int a = stdIn.nextInt();
		System.out.println("변수B :"); int b = stdIn.nextInt();

		if (a % b == 0)
			System.out.println("B는 A의 약수입니다.");
		else
			System.out.println("B는 A의 약수가 아닙니다.");
	}

}
