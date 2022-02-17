
public class Searching {

	public static int searching(int [] arr, int  key)
	{
		boolean flag = false;
		int pos = -1;    // with any value pos can be initialize;
		for (int i=0; i<arr.length; i++)
		{
			if(arr[i]== key)
			{
				pos = i+1;		/// actually i should be return  but for user convenience returning i+1;
				flag = true;
				break;
			}
		}
		if(flag == false)
		{
			System.out.println("value not found");
			return -1;
		}
		else
		{
			return pos;
		}
	}


//	public static int Bin_search(int [] arr , int key)
//	{
//		int low, high, mid;
//		low = 0;
//		high = arr.length-1;
//
//		mid = (low +high)/2;
//
//		while ((arr[mid] != key) && (low <high))
//		{
//			if (arr[mid] == key)
//			{
//				return mid +1;
//			}
//			if(key <arr[mid])
//			{
//				high = mid-1;
//			}
//			else
//			{
//				low = mid +1;
//			}
//			mid = (low + high)/2;
//		}
//
//		return -1;
//	}
//

//Error need resolve







}
