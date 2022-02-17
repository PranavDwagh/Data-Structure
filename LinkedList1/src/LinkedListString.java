
public class LinkedListString {
	
	Node head;
	
	public void insert(String str)
	{
		Node temp = new Node(str);
		if(head==null)
		{
			head = temp;
		}
		else
		{
			temp.setNext(head);
			head = temp;
		}
	}
	
	public void display()
	{
		String str = "";
		Node it = head;
		if(it == null)
		{
			System.out.println("LL is empty");
		}
		else 
		{
			while(it.getNext()!=null)
			{
				str += it;
				it = it.getNext();
			}
			str += it;   // for last node
		}
		
		System.out.println(str);
	}

}
