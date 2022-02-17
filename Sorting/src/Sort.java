
public class Sort{

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

					x = brr[i];
					brr[i] = temp ;                                                                                                                
					temp = x;


					//	brr[i] =swap(brr[i], brr[i]=temp);   //ninja technique
				}		 
			}
			brr[j] = temp;
			//brr[j] = tem;
		}
	}

	public static void insertionSort(int [] arr)
	{
		for(int i=0; i<arr.length;i++)
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
					/*temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;*/

					arr[j] = swap(arr[j+1], arr[j+1] = arr[j]);
					exchange ++;
				}		
			}
			if (exchange==0)
			{
				break;
			}
		}
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

				/*int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;*/

				arr[i] = swap(arr[j], arr[j] = arr[i]);
			}
			j++;
		}
		i++;
		/*int tmp = arr[i];
		arr[i]= arr[h];
		arr[h]=tmp;*/
		arr[i]= swap(arr[h], arr[h]= arr[i]);
		return i;
	}

	public static int swap(int firstvalue, int alreadycopied)
	{
		return firstvalue;
	}

	public static void mergesort(int [] arr, int l, int r)
	{
		if(l<r)
		{
			{
				int m = (l+r)/2;

				mergesort(arr, l, m);
				mergesort(arr, m+1, r);				/// overall agenda is copy original array into new array 
				merge(arr, l, m, r);				/// and then merge array in same array in sorted condition
			}
		}
	}

	private static void merge(int [] crr, int l, int m, int r  )
	{
		int [] arr = new int [m-l+1];
		int [] brr = new int [r-m];

		int i= 0, j=0, k=l;

		for(int n=0; n<arr.length;n++)
		{
			arr[n] = crr[k+n];
		}

		for(int n=0; n<brr.length; n++)
		{
			brr[n]= crr[m+1+n];
		}

		/// merging part started

		while (i<arr.length && j<brr.length)
		{
			if(arr[i] <= brr[j])
			{
				crr[k] = arr[i];
				i++;
			}
			else
			{
				crr[k] = brr[j];
				j++;
			}
			k++;
		}

		while (i<arr.length)
		{
			crr[k] = arr[i];
			i++;
			k++;
		}

		while (j<brr.length)
		{
			crr[k] = brr[j];
			j++;
			k++;
		}


	}



}

