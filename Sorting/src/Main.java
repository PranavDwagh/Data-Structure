import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		int  n;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of elements in array");
		n = sc.nextInt();

		int [] arr = new int [n];
		for(int i=0; i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
		}
		
		printArray(arr);
		Sort.mergesort(arr, 0, arr.length-1);
		printArray(arr);
 
	}
	
	public static void printArray(int []brr)
	{
		System.out.println("Your array is ");
		for (int i=0; i<brr.length; i++)
		{
			System.out.print(brr[i]+", ");
		}
		System.out.println("");
	}


}

