
public class QueueLL {
	
	Node head;
	
	
	public QueueLL()
	{
		head = null;
	}
	
	public void insert(int value)			// append function of linklist
	{
		Node temp = new Node(value);
		
		if (head == null)
		{
			head = temp;
		}
		
		else
		{
		Node it = head;
		
		while(it.getNext()!= null)
		{
			it = it.getNext();
		}
		it.setNext(temp);
		}
	}
	
	public void remove()			//deletefirst() function of linklist  
	{
		if(head == null)
		{
			System.out.println("Queue is empty");
		}
		
		else
		{
			Node temp = head;
			head = temp.getNext();
			temp.setNext(null);
		}
		
	}
	
	public String toString()
	{
		String str = "";
		
		Node it = head;
		
		while(it!= null)
		{
			str += " "+ it;
			it = it.getNext();
		}
		
		return str;
	}
	
	
	
	
	
	
	
	

}
