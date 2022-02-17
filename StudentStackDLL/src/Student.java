
public class Student {

	char gender;
	String name;
	int age;


	public Student()
	{
		age = 0;
		name = "UNKNOWN";
		gender = 'U';
	}

	public Student (int a ,String n, char m)
	{
		age = a;
		name = n;
		gender =  m;
	}

	public void setGender(char m)
	{
		gender = m ;
	}
	
	public char getGender()
	{
		return gender ;
	}
	
	
	public String toString()
	{
		String str = "\nName :" +name+ "\nAge :" +age+ "\nGender :"+gender;
		return str;
	}


}






























