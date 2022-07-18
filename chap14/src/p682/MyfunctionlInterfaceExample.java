package p682;

public class MyfunctionlInterfaceExample {

	public static void main(String[] args) {
		
		
		MyfunctionlInterface fi;
		
		fi = () -> {
			String str = "method call1";
			System.out.println(str);
		};
		
		fi.method();
		
		fi = () -> {System.out.println("method call2");};
		fi.method();
		
		
	}

}
