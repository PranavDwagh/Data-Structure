import java.util.Scanner;
public class ArraySorting {

	public static void main(String[] args) {

		//int  [] arr = new int [] {10,25,65,18,55};

		System.out.println("Enter no of elements of array");

		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int [] brr = new int [n];
		System.out.println("Enter elements in array");
		for (int i=0; i<brr.length; i++)
		{
			brr[i] = sc.nextInt();
		}

		printArray(brr);

		bubbleSort(brr);
		printArray(brr);
		/*printArray(brr);

		selectionSort(brr);

		printArray(brr);

		insertionSort(brr);
		printArray(brr);
		insertionSort(brr);
		printArray(brr);*/

	}

	public static int swap(int a, int tmp)
	{
		return a;
	}


	public static void selectionSort(int [] brr)
	{
		int x = 0;
		int tem = 0;
		for(int j=0; j<brr.length-1; j++ )
		{
			int temp = brr[j];

			for(int i=j+1; i<brr.length; i++ )
			{
				if(brr[i]<temp)
				{
					/*
					x = brr[i];
					brr[i] = temp ;                                                                                                                
					temp = x;
					 */

					brr[i] =swap(brr[i], brr[i]=temp);   //ninja technique
				}		 
			}
			//brr[j] = temp;
			brr[j] = tem;
		}

	}

	public static void insertionSort(int [] arr)
	{
		for(int i=1; i<arr.length;i++)
		{
			int temp = arr[i];
			int k = i-1;
			while(k>=0)
			{
				if(temp< arr[k])
				{
					arr[k+1] = arr[k];
				}
				else
				{
					arr[k+1] = temp;
					break;
				}
				k--;
			}

			arr[k+1] = temp;
		}
	}

	public static void bubbleSort(int [] arr)
	{
		int i, j,temp, exchange;

		for(i=0; i<arr.length-1;i++)
		{
			exchange = 0;
			for(j=0 ; j<(arr.length-1)-i; j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
					exchange ++;
				}		
			}
			if (exchange==0)
			{
				break;
			}
		}
	}

	public static void printArray(int [] brr)
	{
		System.out.println("Your array is ");
		for (int i=0; i<brr.length; i++)
		{
			System.out.print(brr[i]+", ");
		}
		System.out.println("");
	}

	public static void quickSort(int []arr)
	{
		quicksort(arr, 0, arr.length-1);
	}

	public static void quicksort(int []arr, int l, int h)
	{
		if(l<h)
		{
			int loc = partrition(arr, l, h);
			quicksort(arr, l, loc-1);
			quicksort(arr, loc+1, h);
		}
	}

	public static int partrition(int []arr, int l, int h)
	{
		int j = l;
		int i = j-1;

		while(j<=h)
		{
			if (arr[j]<arr[h])
			{
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
			j++;
		} 
		i++;
		int tmp = arr[i];
		arr[i]= arr[h];
		arr[h]=tmp;

		return i;
	}

}





