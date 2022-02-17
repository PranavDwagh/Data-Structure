
public class Sort {

	public static void selectionsort(Student [] arr)
	{

		for (int i=0; i<arr.length;i++)
		{
			Student temp = arr[i];
			for (int j=0; j<arr.length; j++)
			{
				if(arr[j].getRollNo()<temp.getRollNo())
				{
					Student tmp = arr[j];
					arr[j] = temp;
					temp = tmp;
				}
				arr[j] = temp;
			}
		}
	}
}
