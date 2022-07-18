package training2_3;

public class maxmintest {

	public static void main(String[] args) {
	int arr[] = {1,10   };
	
	int max = arr[0];
	int min = arr[0];
	
	max = arr[0]>arr[1] ? arr[0] : arr[1];

	min = arr[0]>arr[1] ? arr[1] : arr[0];

	System.out.println("최대값:" + max);
	System.out.println("최소값:" + min);
	
	
	}
}
