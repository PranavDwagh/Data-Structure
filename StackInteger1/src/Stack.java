
public class Stack {

	int [] arr;
	int top;

	public Stack()
	{
		top =-1;
		arr = new int [5];
	}

	public void push(int value)
	{
		if(top == arr.length-1)
		{
			System.out.println("Stack Overflow");
		}
		else
		{
			top++;
			arr[top] = value;
		}
	}

	public int pop() {
		int value = 0;
		if(top<=-1)
		{
			System.out.println("Stack iss Empty");
		}
		if (top>=0)						//if  if (top<=-1) condition use then it will show stack is empty on zero as well	
		{
			value = arr[top];
			top--;
		}
		
		return value;
	}

	public String toString()
	{
		String str = "";
		/*if(top==-1)
		{
			System.out.println("Stack Underflow");
		}
		else*/
		{
			for(int j= top; j>=0; j-- ) {
				str += arr[j]+",";					
				//	System.out.print(arr[j]+ " ");						//use any one
			}
			System.out.println("");
			
		}
		return str;
	}

	public String display()
	{
		String str = "";
		for(int j= top; j>=0; j-- )
		{
			str += arr[j]+",";	
		}
		return str;
	}
}

