package practice;

public class StringHash {
	
	String [] str; 
	
	public StringHash(int size)
	{
		str = new String[size];
	}

	public void insert (String inputString)
	{
		int key = hash_function(inputString);
		
		if (str[key] == null)
		{
			str[key] = inputString;
		}
		else
		{
			while (true) {
				{
					key++;
					if (key == str.length)
						key = 0;

					if (str[key] == null) {
						str[key] = inputString;
						break;
					}
				} 
			}
		}
	}

	private int hash_function(String inputString) {

		int sum=0;
		
		for (int i=0; i<inputString.length();i++)
		{
			sum = sum + (inputString.charAt(i));
		}

		int key = sum % str.length;
		
		return key;
	}
	
	public void search (String inputString)
	{
		int key = hash_function(inputString);
		
		if (str[key].equals(inputString))
		{
			System.out.println(str[key]);
		}
		else
		{
			while (true) {
				
				++key;
				if (key == str.length)
				key =0;
				
				if (str[key].equals(inputString))
				{
					System.out.println("Found string in while loop"+ str[key]);
					break;
				}
				
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
