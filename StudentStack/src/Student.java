
public class Student {
	int age; 
	String name;
	int rollno;
	char gender;
	int std;

	public Student(String n, int a)
	{
		name=n;
		age=a;
	}
	public Student(String n, int ag, int rn, char c, int a)
	{
		name = n;
		age = ag;
		rollno = rn;
		gender = c;
		std = a;	
	}

	public String toString()
	{
		String str = "Name :" +name+ " Age : "+ age+ " RollNo: "+rollno+ " Gender: "+gender+ " Standard : "
				+std+"\n";
		return str;
	}

	public void assignRollno(int rn)
	{
		rollno=rn;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setGender(char c)
	{
		gender = c;
	}

	public char getGender()
	{
		return gender;
	}
}