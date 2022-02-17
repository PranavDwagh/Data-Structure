
public class Main 
{

	public static void main(String[] args) {
		
		int [] arr = new int[]{2,45,5,67,12,18,75,50};
		
		printArray(arr);
		Sort.mergesort(arr, 0, arr.length-1);
		printArray(arr);
	}

	public static void printArray(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ ", ");
		}
		System.out.println();
	}
	
	
}
