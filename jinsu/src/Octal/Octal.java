package Octal;

public class Octal {
		
	static final int JINSUNUM = 8;
	
	public static void main(String[] args) {
				
		int num = 8;
		int cnt = 0;
		int[] bin = new int[15];
		
		while(num >= 1) {
			bin[cnt] = num%JINSUNUM;
			cnt++;
			num = num/JINSUNUM;
		}
		
		 for(int i = cnt;  i>=0; i--) {
			 System.out.print(bin[i]);
		 }

	}

}


