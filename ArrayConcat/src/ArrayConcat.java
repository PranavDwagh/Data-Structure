
//import java.util.Scanner;
public class ArrayConcat {
	public static void main(String[] args) {

		int [] arr = new int[] { 1, 2,3,4,5};
		int [] brr = new int[] { 6,7,8,9,10,11,15,16,17,18,19,20};
		
		int [] crr = new int[arr.length+brr.length];
		
		concatArray(arr, brr, crr);
		
		display(arr);
		display(brr);
		display(crr);


	}
	private static void display(int[] arr) {
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+ ", ");
		}
		System.out.println("");
		
	}
	private static void concatArray(int[] arr, int [] brr, int [] crr) {
		
		int i, j,k;
		k=0;
		for (i=0; i<=arr.length-1; i++)
		{
			crr[k] = arr[i];
			k++;
		}
		
		for(j=0; j<=brr.length-1; j++)
		{
			crr[k] = brr[j];
			k++;
		}
		
		
	}		
		
		
	
}
