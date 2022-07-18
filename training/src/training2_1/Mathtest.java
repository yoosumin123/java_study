package training2_1;

public class Mathtest {

	public static void main(String[] args) {
		
		double roundresult = Math.round(3.14); // 반올림 구하기
		double ceilresult = Math.ceil(3.5);    // 올림 구하기
		int powresult = (int) Math.pow(3,2 );  // 거듭제곱 구하기
		int sqrtresult = (int) Math.sqrt(16);  // 제곱근 구하기
		int randomresult = (int) (Math.random() * 6) + 1 ; // 랜덤 숫자 구하기
		int absresult = Math.abs(-5);          // 절댓값 구하기
		double cbrtresult = Math.cbrt(5);      // 세제곱근 구하기
		
		System.out.println(roundresult);
		System.out.println(ceilresult);
		System.out.println(powresult);
		System.out.println(sqrtresult);
		System.out.println(randomresult);
		System.out.println(absresult);
		System.out.println(cbrtresult);								
	}
}
