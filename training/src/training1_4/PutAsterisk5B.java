package training1_4;
//읽은 개수만큼 * 표시(5개 단위로 줄 바꿈) (방법2)
import java.util.Scanner;

public class PutAsterisk5B {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("몇 개의 *를 표시할까요?:");
		int n = stdIn.nextInt();
		if (n > 0 ) {
			for (int i =0; i < n/ 5; i++)
				System.out.println("*****");
			int rest = n % 5;
			if (rest > 0 ) {
				for (int i=0; i <rest; i++)
					System.out.println("*");
				System.out.println();
			}
		}

	}

}
