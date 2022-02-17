
public class MyHashCloseAddress {

	LinkList [] str;

	public MyHashCloseAddress(int size) 
	{
		str = new LinkList[size];
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
		int key = hashFunction(input);
		System.out.println("key=" + key);

		if(str[key] == null)
		{
			str[key] = new LinkList();
		}
		str[key].append(input);	
		System.out.println("Inserted at key=" + key);
	}

	public void search(String input)
	{
		int key = hashFunction(input);

		if(str[key] != null)
		{
			if( str[key].search(input) )
			{
				System.out.println("Got input '" +input+ "' inside str["+key+"]");
			}
			else
			{
				System.out.println("Not found");
			}
		}
		else
		{
			System.out.println("Not found");
		}
	}
	
	public String toString() 
	{
		String s = "*******  START  ********\n";
		
		for (int i = 0; i < this.str.length; i++) 
		{
			if(str[i] == null)
			{
				s = s + "str["+i+"]=\n";
			}
			else
			{
				s = s + "str["+i+"]=" + str[i].toString() + "\n";
			}
		}
		
		return s + "******** END ********\n";
	}

}
