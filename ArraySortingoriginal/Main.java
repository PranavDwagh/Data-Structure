
public class Main {


	public static void main(String[] args) {

		int [] arr = new int[]{2,45,-3,67,67,78,42,10,34,27};

		printArray(arr);
		quickSort(arr);
		printArray(arr);
		

	}

	public static void insertionSortA(int[] arr) {

		for(int i=1; i<arr.length; i++)
		{
			int tmp = arr[i];
			int k = i-1;

			while(k >= 0)
			{
				if(tmp < arr[k])
				{
					arr[k+1] = arr[k];
					k--;
				}
				else
					break;
			}
			arr[k+1] = tmp;
		}
	}

	public static void insertionSortD(int[] arr) {

		for(int i=1; i<arr.length; i++)
		{
			int tmp = arr[i];
			int k = i-1;

			while(k >= 0)
			{
				if(tmp > arr[k])
				{
					arr[k+1] = arr[k];
					k--;
				}
				else
					break;
			}
			arr[k+1] = tmp;
		}
	}

	public static void selectionSortA(int[] arr) {

		for(int j=0; j<arr.length-1; j++)
		{
			int tmp = arr[j];
			for(int i=j+1; i<arr.length; i++)
			{
				if(arr[i] < tmp)
				{
					int x = arr[i];
					arr[i] = tmp;
					tmp = x;
				}
			}
			arr[j] = tmp;
		}
	}
	public static void selectionSortD(int[] arr) {

		for(int j=0; j<arr.length-1; j++)
		{
			int tmp = arr[j];
			for(int i=j+1; i<arr.length; i++)
			{
				if(arr[i] > tmp)
				{
					int x = arr[i];
					arr[i] = tmp;
					tmp = x;
				}
			}

			arr[j] = tmp;
		}
	}

	public static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ ", ");
		}
		System.out.println();
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































