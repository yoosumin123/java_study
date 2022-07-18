package Assignment2_06;

public class Assignment2_06_3 {
	public static void main(String[] args) {
		
		System.out.println("1부터 20까지의 2 또는 3의 배수 출력");
		for(int i=1;i<=20;i++) {
			if(i%2==0 || i%3==0) {
				System.out.print(i+" ");
			}
		}
	}
}
