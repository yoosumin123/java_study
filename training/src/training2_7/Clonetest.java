package training2_7;

public class Clonetest implements Cloneable  { 

	public static void main(String[] args) {

		int[] a = { 8, 5, 2, 4, 6, 3, 7, 9 };
		int[] aCl = a.clone();

		int[][] b = { { -1, 5, 6, 7 }, { 6, 7, 8, 9 } };
		int[][] bCl = b.clone();

		for (int i = 0; i < a.length; i++) {
			System.out.print("[" + a[i] + "]");
		}

		System.out.println();

		for (int i = 0; i < aCl.length; i++) {
			System.out.print("[" + aCl[i] + "]");
		}

		System.out.println();
		System.out.println();
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print("[" + b[i][j] + "]");
			}
			System.out.println();
		}
		
		for (int i = 0; i < bCl.length; i++) {
			for (int j = 0; j < bCl[i].length; j++) {
				System.out.print("[" + bCl[i][j] + "]");
			}
			System.out.println();
		}
	}
}
