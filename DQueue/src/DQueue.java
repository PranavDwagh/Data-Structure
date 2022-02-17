
public class DQueue {

	Node head;
	Node tail;

	public DQueue()
	{
		head = null;
		tail = null;
	}

	public void remove()
	{
		if(head == null)
		{
			System.out.println("DLL is Empty");
		}

		else if(head.getNext() ==null)
		{
			Node tmp = head ;
			head = null;
			tail = null;
		}
		else
		{
			Node tmp = head ;
			head = tmp.getNext();
			head.setPrev(null);
			tmp.setNext(null);
		}
	}

	public void insert(int value)
	{
		Node temp = new Node(value);
		if(tail==null)
		{
			head = temp;
			tail = temp;
		}

		else
		{
			temp.setPrev(tail);
			tail.setNext(temp);
			tail = temp;
		}

	}

	public String toString()
	{
		String str= "";
		Node it= head;

		while(it != null) 
		{
			str += ""+ it;
			it = it.getNext();
		}
		return str;
	}


}
