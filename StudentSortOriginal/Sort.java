

public class Sort {

	public static void Selection(Student[] arr, boolean isDes) {
		
		for(int j=0; j<arr.length-1; j++)
		{
			Student tmp = arr[j];
			for(int i=j+1; i<arr.length; i++)
			{
				if(isDes)
				{
					//D
					//if(arr[i].isGraterThan(tmp))
					if(arr[i].getRollNo() > tmp.getRollNo())
					{
						Student x = arr[i];
						arr[i] = tmp;
						tmp = x;
					}
				}
				else
				{
					//A
					if(arr[i].getRollNo() < tmp.getRollNo())
					{
						Student x = arr[i];
						arr[i] = tmp;
						tmp = x;
						
					}
				}
			}
			arr[j] = tmp;
		}
	}

	
}

