import java.util.Scanner;
public class Concatination {
	
	public static void main(String[] args) {
		
		int []arr = new int[] {10,55,45,65,20};
		int [] brr = new int[] {6,8,4,9,5};
		int [] crr = new int [10];
		
		printarray(arr);
		printarray(brr);
		concatArray(arr, brr, crr);
		printarray(crr);
		
	} 
	
	public static void concatArray(int []arr, int[] brr, int []crr)
	{
		int i, k =0;
		for(i=0; i<arr.length; i++,k++)
		{
			crr[k] = arr[i];
		}
		
		for(int j=0; j<brr.length;j++,k++)
		{
			crr[k] = brr[j];
		}
		
	}
	
	
	public static void printarray(int []crr)
	{
		int i = 0;
		for(i= 0; i<crr.length; i++)
		{
			System.out.print(crr[i]+", ");
		}
		System.out.println();;
	}
	
	
	
	

}
