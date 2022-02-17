
public class MyHashOpenAddress {

	String [] str;
	int count;
	
	public MyHashOpenAddress(int size) 
	{
		str = new String[size];
		count=0;
	}
	
	private int hashFunction(String input) 
	{
		int key = 0;
		int sum = 0;
		
		for (int i = 0; i < input.length(); i++) 
		{
			sum = sum + input.charAt(i);
		}
		
		key = sum%str.length;
		return key;
	}
	
	public void insert(String input)
	{
		if(count == str.length)
		{
			System.out.println("HASH Table is Full..");
			return;
		}
			
		int key = hashFunction(input);
		System.out.println("key=" + key);
		
		if(str[key] == null)
		{
			str[key] = input;
		}
		else
		{
			while(true)
			{
				key++;
				if( key == str.length )
					key=0;
				
				if(str[key] == null)
				{
					str[key] = input;
					break;
				}
			}
		}
		count++;
		System.out.println("Inserted at key=" + key);
	}

	public void search(String input)
	{
		int key = hashFunction(input);
		
		while(true)
		{
			if(str[key].equals(input))
			{
				System.out.println("Got at " + key);
				break;
			}
			
			key++;
			if( key == str.length )
				key=0;
		}
	}
	
}
