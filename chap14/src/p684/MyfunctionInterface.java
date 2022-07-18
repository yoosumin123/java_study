package p684;

public class MyfunctionInterface {

	public static void main(String[] args) {
		
		MyfunctionlInterface fi;
		
		fi = (x,y) ->{
			int result = x+ 5;
			return result;
		};
		System.out.println(fi.method(2, 5));
		
		fi =(x, y) ->  {return x +y ;};
		System.out.println(fi.method(2,5));
		
		fi =(x, y) ->  x +y;
		System.out.println(fi.method(2,5));
		
	
	}

}
