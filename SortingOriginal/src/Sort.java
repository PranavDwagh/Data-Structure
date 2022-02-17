
public class Sort {

	public static void Insertion(int[] arr, boolean isDes) {
		
		for(int i=1; i<arr.length; i++)
		{
			int tmp = arr[i];
			int k = i-1;
			
			while(k >= 0)
			{
				if(isDes)
				{
					if(tmp > arr[k])
					{
						arr[k+1] = arr[k];
						k--;
					}
					else
						break;
				}
				else
				{
					if(tmp < arr[k])
					{
						arr[k+1] = arr[k];
						k--;
					}
					else
						break;
				}
			}
			arr[k+1] = tmp;
		}
	}
		
	public static void Selection(int[] arr, boolean isDes) {
		
		for(int j=0; j<arr.length-1; j++)
		{
			int tmp = arr[j];
			for(int i=j+1; i<arr.length; i++)
			{
				if(isDes)
				{
					//D
					if(arr[i] > tmp)
					{
						int x = arr[i];
						arr[i] = tmp;
						tmp = x;
					}
				}
				else
				{
					//A
					if(arr[i] < tmp)
					{
						int x = arr[i];
						arr[i] = tmp;
						tmp = x;
					}
				}
			}
			arr[j] = tmp;
		}
	}

	public static void Bubble(int[] arr, boolean isDes)
	{
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=0; j<arr.length-1; j++)
			{
				if(isDes)
				{
					if(arr[j+1] >  arr[j])
					{
						int x = arr[j+1];
						arr[j+1] = arr[j];
						arr[j] = x;
					}
				}
				else
				{
					if(arr[j+1] <  arr[j])
					{
						int x = arr[j+1];
						arr[j+1] = arr[j];
						arr[j] = x;
					}
				}
			}
		}
	}
	
	public static void Quick(int[] arr)
	{
		quicksort(arr, 0, arr.length-1);
	}

	private static void quicksort(int[] arr, int l, int h) 
	{
		if(l < h)
		{
			int loc = partition(arr, l, h);
			//Sort left side of the location
			quicksort(arr, l, loc-1);
			//Sort right side of the location
			quicksort(arr, loc+1, h);
		}
	}

	private static int partition(int[] arr, int l, int h) {
		
		//int pi = arr[h];
		int j = l;
		int i = j-1;
		
		while(j <= h)
		{
			if(arr[j] < arr[h])
			{
				i++;
				//swap(arr[i], arr[j]);
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
			j++;
		}
		i++;
		//swap(arr[i], arr[h]);
		int tmp = arr[i];
		arr[i] = arr[h];
		arr[h] = tmp;
		
		return i;
	}

	public static void mergesort(int []arr, int l, int r)
	{
		if(l<r)
		{
			int m = (l + r)/2;

			mergesort(arr, l, m);
			mergesort(arr, m+1, r);

			merge(arr, l, m, r);
		}
	}

	//merge_in_same_array
	private static void merge(int [] crr, int l, int m, int r)
	{
		int [] arr = new int[m-l+1];
		int [] brr = new int[r-m];

		int i=0, j=0, k=l;

		for (int n = 0; n < arr.length; n++) 
		{
			arr[n] = crr[k+n];
		}

		for (int n = 0; n < brr.length; n++) 
		{
			brr[n] = crr[m+1+n];
		}

		// crr = merge(arr,  brr)
		while(i<arr.length  &&  j<brr.length)
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

		//any left over?
		while(i<arr.length)
		{
			crr[k] = arr[i];
			i++;
			k++;
		}

		while(j<brr.length)
		{
			crr[k] = brr[j];
			j++;
			k++;
		}
	}

	
	public static void heapSort(int arr[])
    {
        int n = arr.length;
 
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            max_heapify(arr, n, i);
 
        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
            // call max max_heapify on the reduced heap
            max_heapify(arr, i, 0);
        }
    }
 
    // To max_heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    private static void max_heapify(int arr[], int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2
 
        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;
 
        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;
 
        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
 
            // Recursively max_heapify the affected sub-tree
            max_heapify(arr, n, largest);
        }
    }

}

