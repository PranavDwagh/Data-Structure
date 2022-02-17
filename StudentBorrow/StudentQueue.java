

public class StudentQueue {

	Student [] arr;
	int F;
	int R;


	public StudentQueue()
	{
		arr = new Student[3];
		F=R=-1;
	}

	public StudentQueue(int size)
	{
		arr = new Student[size];
		F=R=-1;
	}

	public void insert(Student value)
	{
		//if (R==arr.length-1)
		if (R<arr.length-1)
		{
			R++;
			arr[R] = value;
			if(F==-1)
				F ++;
		
		}
		else
			System.out.println("Queue is full");
		
	}
	/*{
		if(R < arr.length-1 )
		{
			R++;
			arr[R] = value;

			//Check for 1st value insertion
			if(F == -1)
				F=0;
		}
		else
			System.out.println("Queue is FULL!");		
	}*/

	public Student remove()
	{
		Student value =null;
		if (F==-1)  
		{
			System.out.println("Que is not filled yet ");
			return null;
		}
		else
		{
			value = arr [F];
			if(F==R)
				F=R=-1;
			else
				F++;
		}
		return value;
	}

	/*{
		//First check for empty condition
		if(F == -1)
		{
			System.out.println("Queue is Empty!");
			return null;
		}

		Student value = arr[F];

		//Check if this is was the last value..  
		if(F == R)
			F=R= -1;
		else
			F++;

		return value;
	}*/                    


	public String toString()
	{
		String str = "";
		if(F==-1)
			System.out.println("Your String is Empty");
		else
		{
			for (int i= F; i<=R; i++)
			{
				str= str + arr[i];
			}
		}

		return str;
	}
	
	public StudentQueue  Marks_Above75()
	{
		if(F==-1)
			System.out.println("Queue is Empty");

		StudentQueue q = new StudentQueue(10);
		///not getting proper output
		for(int i=F; i<=R; i++)
		{
			int [] marks = arr[i].getMarks();

			if(marks[i]< 75)
			{
				q.insert(arr[i]); 

			}
		}
		return q;
	}
}
	
















/*
public class StudQueue {

	Student []arr;
	int F;
	int R;
	
	StudQueue()
	{
		arr = new Student[5];
		F = R = -1;
	}
	StudQueue(int size)
	{
		arr = new Student[size];
		F = R = -1;
	}
	public void insert(Student s)
	{
		if(R < arr.length-1)
		{
			R++;
			arr[R]=s;
		//check for first value insertion
			if(F==-1)
			   F=0;
		}
		else
			System.out.println("Queue is FULL");
		
	}
	public Student remove()
	{
		//check empty condition
		if(F==-1)
		{
			System.out.println("Queue is EMPTY");
			return null;
		}
		Student s = arr[F];
		//check if this is last value
		if(F==R)
		F=R=-1;
		else
			F++;
		return s;
	}
	public String toString()
	{
		String str = "";
		//check empty condition
		if(F==-1)
		{
			str = "Queue is EMPTY";
		}
		else
		{
			for (int i=F; i<=R; i++)
			{
				str=str+arr[i] + " ";
				
			}
		}
		return str;
		
	}
	
	public StudQueue Marksmorethan75()
	{	String str;
		
		if(F==-1)
			str= "Queue is empty";
		StudQueue q= new StudQueue(5);
		 for (int i=F; i<=R; i++)
		{
			 int[]marks=arr[i].getMarks();
			if(marks[i]>75)
				q.insert(arr[i]);
			
		}
		// System.out.println(q);
		return q;
	}
}
	
*/