
public class StudentDLL {
	
	Node head;
	Node tail;

	public StudentDLL()
	{
		head = null;
		tail = null;
	}
	
	public String toString()
	{
		String str= "";
		Node it = head;
		
		while (it != null)
		{
			str+= ""+ it+ "\n";
			it = it.getNext();
		}
		
		return str;
	}
	
	public void push(Student s)
	{
		Node temp = new Node(s);
		
		if (head == null)
		{
			head = temp;
		}
		else
		{
		temp.setNext(head);
		head.setPrev(temp);
		temp.setPrev(null);
		head = temp;
		}
		
	}
	
	public void pop()
	{
		if(head == null)
		{
			System.out.println("Nothing in Student DLL");
		}
		else
		{
			Node temp = head;
			head = head.getNext();
			head.setPrev(null);
			temp.setNext(null);
		}
	}


}
