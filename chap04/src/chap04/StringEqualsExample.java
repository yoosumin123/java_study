package chap04;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "유수민";
		String strVar2 = "유수민";
		
		if(strVar1 == strVar2) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
		
		if(strVar1.equals(strVar2) ) {
			System.out.println("같음");
		}
		String strVar3 = new String ("유수민");
		String strVar4 = new String ("유수민");
			
		if(strVar3 == strVar4) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("같음");
		}
		

	}

}
