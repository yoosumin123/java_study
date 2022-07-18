package training2_3;

public class minmaxtest {

	public static void main(String[] args) {
	
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int max = arr[0] ;
		int min = arr[0] ;
		
		for(int i=0; i<arr.length; i++) {
			max = max > arr[i] ? max : arr[i] ;
			min = min < arr[i] ? min : arr[i] ;
		}
		
		System.out.println("max:" + max);
		System.out.println("min:" + min);
		
	}
}


