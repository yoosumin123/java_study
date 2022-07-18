package training2_6;

import java.util.Scanner;

public class Clock {
	
	static String[] abc = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n",
			"o","p","q","r","s","t","u","v","w","x","y","z"};
	
	static void Diamond(int top) {
		for(int i=0;i<=top/2;i++) {
			for(int j=i;j<=top/2;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(abc[j]);
			}
			for(int j=0;j<=i;j++) {
				System.out.print(abc[i-j]);
			}
			System.out.println();
		}
		for(int i=0;i<=top/2;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=top/2;j++) {
				System.out.print(abc[j-i]);
			}
			for(int j=i;j<=top/2;j++) {
				System.out.print(abc[(top/2)-j]);
			}
			System.out.println();
		}
	}
	
	static void Sandglass(int top) {
		System.out.println();
		for(int i=0;i<=top/2;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=top/2;j++) {
				System.out.print(abc[j]);
			}
			for(int j=i;j<=top/2;j++) {
				System.out.print(abc[(top/2)-j]);
			}
			System.out.println();
		}
		for(int i=0;i<=top/2;i++) {
			for(int j=i;j<=top/2;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(abc[j]);
			}
			for(int j=0;j<=i;j++) {
				System.out.print(abc[i-j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int top;
		do {
			System.out.print("출력할 높이(짝수,2~50) : ");top = sc.nextInt();
		} while (top%2==1 || top>50 || top<2);
		
		Diamond(top);
		System.out.println();
		Sandglass(top);
		
	}
}
