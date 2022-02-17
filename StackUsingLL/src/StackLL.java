
public class StackLL {

	Node head;

	public  void push (int value)				// insert operation
	{
		Node temp = new Node (value);

		if (head == null)
		{
			head = temp;
		}

		else if(head.getNext()==null)
		{
			temp.setNext(head);
			head = temp;
		}

		else
		{
			temp.setNext(head);
			head = temp;
		}
	}


	public void pop()				// deleteFirst
	{

		if(head == null)
		{
			System.out.println("LL is Empty");
		}

		else if (head.getNext()== null)
		{
			Node temp = head;			//no need of this but formalities
			head = null;
		}

		else
		{
			Node temp = head ;
			head = head.getNext();
			temp.setNext(null);
		}

	}



	public String toString() {

		String str = "";

		Node it = head;

		while(it != null)
		{
			str += " " +it ;
			it = it.getNext();
		}
		return str;


	}














}
