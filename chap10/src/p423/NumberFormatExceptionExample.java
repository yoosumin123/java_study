package p423;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		
		String data1 = "100";
		String data2 = "a100";
		
		int value1 = Integer.parseInt(data1);
//		int value2 = Integer.parseInt(data2);
		
		System.out.println(data1 + 5);
		System.out.println(value1 + 5);
		
		
		
	}

}
