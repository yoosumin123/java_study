package jinsu;

public class Binary {

	public static void main(String[] args) {
		
		int num = 8;
		int cnt = 0;
		int[] bin = new int[15];
		
		while(num >= 1) {
			bin[cnt] = num%2;
			cnt++;
			num = num/2;
		}
		
		 for(int i = cnt;  i>=0; i--) {
			 System.out.print(bin[i]);
		 }

	}

}
