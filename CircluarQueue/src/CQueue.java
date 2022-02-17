
public class CQueue {

	int [] arr;
	int F;
	int R;

	public CQueue()
	{
		arr = new int [5];
		F=R=-1;
	}

	public CQueue(int size)
	{
		arr = new int[size];
		F=R=-1;
	}

	public void insert (int value)
	{
		
		if((F==0 && R==arr.length-1) || (R+1==F))    // after one round for full queue condition R+1=F
		
		{
			System.out.println(" Your Queue is Full");
		}
		else
		{
			if (R==arr.length-1)			//modified
				R=0;
			else
				R++;
			
			arr[R] = value;

			if(F==-1)
				F++;	
		}
	}
	
	/*public void insert(int value)
	{
		if( (F==0 && R==arr.length-1) || (R+1 == F) )
		
		{
			System.out.println("Queue is Full!");
		}
		else
		{
			//we have some space in CQueue
			if(R == arr.length-1)
				R = 0;
			else
				R++;
			
			//now insert element in queue
			arr[R] = value;
			
			//Check if this is the first element in CQueue 
			if(F == -1)
				F++;
		}
	}*/
	
	

	public int remove()
	{
		int value = 0;

		if (F==-1)
		{
			System.out.println("Nothing filled in Queue");
			return 0;
		}
		else 
		{
			value = arr[F];
			
			if (F==R)
			{	
				F = R = -1;
			}
			else
				if(F==arr.length-1)
					F=0;
				else
					F++;
			
		}
		return value;
	}
	/*
	public String toString() {
		
		String str = "";
		
		if(F == -1)
		{
			str = "CQueue is empty!";
		}
		else
		{
			int i=F;
			
			while( i != R )
			{
				str = str + arr[i] + ", ";
				
				if(i == arr.length-1)
					i = 0;
				else 
					i++;
				
				//i = (++i % arr.length);
			}
			//to capture last element
			str = str + arr[i] + ", ";
		}
		return str;
	}*/
	 
	public String toString()
	{
		String str = "";
		if(F == -1)
		{
			System.out.println("Queue is Empty");
		}

		else 
		{
			int i=F;
			while(i!= R)
			{
				str = str +arr[i] + ",";
				if (i==arr.length-1)
					i = 0;
				else
					i++;

				//	i = ++i % (arr.length());         //  another method
			}

			str = str + arr[i] + ",";       //to access value of last element;
		}
		return str;
	}


}









