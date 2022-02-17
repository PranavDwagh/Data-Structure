
public class EmpDLL {

	Node head;
	Node tail;


	public EmpDLL()
	{
		head = null;
		tail = null;
	}

	public String toString()
	{
		String str= "";

		Node it = head;

		while(it != null)
		{
			str+= ""+ it+"\n";
			it = it.getNext();
		}
		return str;
	}

	public void insert(Employee value)				//append of Linked list
	{
		Node temp = new Node(value);

		if(tail == null)
		{
			head = temp;
			tail = temp;
		}
		else
		{
			Node it = tail;

			it.setNext(temp);
			temp.setPrev(it);

			tail = temp;
		}

	}

	public void remove()				//deletefirst()
	{
		if (head==null)
		{
			System.out.println("DLL is Empty");
		}

		else
		{
			Node temp = head;
			head = temp.getNext();
			temp.setNext(null);
			//head.setPrev(null);
		}
	}
	
	public void maleEmployee( char g) 
	{
		
		Node it = head;
		while(it!=null)
		{
			if (it.getData().gender==g)
			{																					//this is also correct
				System.out.println(it.getData().empName+" is a " +g+" Employee");
				it = it.getNext();
			}
			
		}
		
	/*	public void maleEmployee(EmpDLL l, char g) 
		{
		Node it = l.head;
		while(it!=null)
		{
			if (it.getData().gender==g)
			{
				this.insert(it.getData());				//using "this" operator
			}											////but this stupid thing stores output(So not recommended)
			it = it.getNext();*/
		}
	
	
	public boolean isEmpty()
	{
		   if(head == null)
		   {
			   return true;
		   }
		   else
		   {
			   return false;
		   }
	}
	
	
}
