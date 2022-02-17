
public class StringHashing {

	Student [] arr;


	public StringHashing(int size)
	{
		arr = new Student[size];
	}

	public void insert(Student s)
	{
		int key = hash_function(s.mobNo);
		
		System.out.print("Got "+ key + " index for input "+ s.mobNo );
		
		if(arr[key] == null)
		{
			arr[key] = s;
		}
		
		else 
		{
			while(true)
			{
				key++;
				
				if (key == arr.length)
				{
					key = 0;
				}
				else
				{
					if (arr[key]== null)
					{
						arr[key]= s;
						break;
					}
				}
			}
		}
		
		System.out.println("is places at " +key);
		
	}

	private int hash_function(String mobNo) {

		int sum = 0;
			for(int j=0; j<mobNo.length(); j++)
			{
				sum =  ((mobNo.charAt(0)-mobNo.charAt(j))* (mobNo.charAt(0)-mobNo.charAt(j)));
			}
			int key = sum % arr.length;            ///logic can be anything but % arr.length is important
			return key;
	}

	public void search(String mobNo)
	{
		int key = hash_function(mobNo);
		int temp = key;
		
		if ((arr[key].mobNo).equals(mobNo))
		{
			System.out.println("Key of " + mobNo + " is " + temp+ " and it is Found at index " + key);
			System.out.println(arr[key]);
			return;
		}
		else
		{
			while(true)
			{
				key++;
				if(key == arr.length)
				{
					key = 0;
				}
				if((arr[key].mobNo).equals(mobNo))
				{
					System.out.println("Key of " + mobNo + " is " + temp+ " and it is Found at index " + key);
					System.out.println(arr[key]);
					break;
				}
			}
		}
			
	}




}
