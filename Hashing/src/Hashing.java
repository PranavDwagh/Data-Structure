
public class Hashing {

	String [] str;

	public Hashing(int size)
	{
		str = new String[size];
	}

	public void insert(String inputStr)
	{
		int key = hash_function(inputStr);

		if (str[key] == null)
		{
			str [key] = inputStr;
		}
		else
		{
			while(true)
			{
				key++;
				if(key == str.length)
					key =0;

				if(str[key] == null)
				{
					str [key] = inputStr;
					break;
				}
			}
		}

	}

	public int hash_function(String inputStr)
	{
		int sum= 0;
		for (int i=0; i<inputStr.length();i++)
		{
			sum = sum + (inputStr.charAt(i));
		}

		int key = sum % str.length;
		return key;
	}

	public void search(String inputStr)
	{
		int key = hash_function(inputStr);
		int temp = key;

		if(str[key].equals(inputStr))
		{
			System.out.println("Key of " + inputStr + " is " + temp + " and it is Found at index " + key);
		}
		else
		{
			while (true)
			{
				++key;
				if(key == str.length);
				key =0;

				if (str[key].equals(inputStr))
				{
					System.out.println("Key of " + inputStr + " is " + temp + " and it is Found at index " + key);
					break;
				}
			}
		}
	}



}
