
public class Stack {
	Student [] arr;
	int top;
	
	public Stack()
	{
		top = -1;
		arr = new Student [5];
	}

	public Stack(int size)
	{
		top = -1;
		arr = new Student [size];
	}

	public void push(Student value) {

		if(top <arr.length-1)
		{
			top++;
			arr[top] = value;
		}
		else
			System.out.println("Stack is overflow");
	}

	public  Student pop() {
		Student value = null;
		if(top > -1)
		{
			value =arr[top];
			System.out.println("pop out = "+value);
			top--;
			System.out.println("now top = "+top);
		}
		else
		{
			System.out.println();
		}

		return value;
	}

	public String toString()
	{
		String str = "";
		if(top == -1)
		{
			str = "Stack is Empty ";
		}
		else
		{
			for (int j = top; j>=0; j-- )
				str = str + arr[j];
		}
		return str;
	}

}
