
public class Student {

	int [] mark;
	String name;
	int age;



	public Student()
	{
		age = 0;
		name = "UNKNOWN";
		mark = new int [5];
	}

	public Student (int a ,String n,   int [] m)
	{
		age = a;
		name = n;
		mark =  m;
	}

	public void setMarks(int [] m)
	{
		mark = m ;
	}
	
	public int [] getMarks()
	{
		return mark ;
	}
	


	public String toString()
	{
		String str = "\nName :" +name+ "\nAge :" +age+ "\nMarks :"+getMarksinString();
		return str;
	}

	public String getMarksinString()
	{
		String M = "{";
		for (int i=0; i<mark.length; i++)
		{
			M+= mark[i]+",";
		}

		M+="}";
		return M;
	}

}






























