
public class MergeArray {

	public static void main(String[] args) {

		int [] arr = new int [] {10,13,25,40,55};
		int [] brr = new int [] {8,13,38,41,60};
		int [] crr = new int [arr.length+brr.length]; 

		MergeArray(crr, arr, brr);


		printArray(arr);
		printArray(brr);
		printArray(crr);

	}


	public static void MergeArray(int []crr, int []arr, int [] brr)
	{
		int ai=0, bi=0, ci=0;
		while(ai<arr.length && bi<brr.length)
		{
			if(arr[ai]<brr[bi])
			{
				crr[ci] = arr[ai];
				ci++;
				ai++;
			}

			else if(arr[ai]>brr[bi])
			{
				crr[ci]= brr[bi];
				ci++;
				bi++;
			}

			else
			{
				crr[ci] = arr[ai];
				ai++;
				bi++;
				ci++;
			}

		}

		while (ai<arr.length)
		{
			crr[ci] = arr[ai];
			ci++;
			ai++;
		}

		while (bi<brr.length)
		{
			crr[ci] = brr[bi];
			ci++;
			bi++;
		}

	}


	public static void printArray(int[] prr) {

		for (int i = 0; i < prr.length; i++) {
			System.out.print(prr[i]+ ", ");
		}
		System.out.println();
	}



}


