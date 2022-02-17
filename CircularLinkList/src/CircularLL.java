
public class CircularLL {

	Node head;

	public CircularLL()
	{
		head = null;
	}

	public void insert(int value)
	{
		Node temp = new Node(value);

		if(head == null)
		{
			head = temp;
			head.setNext(head);
		}
		else
		{
			Node it = head;
			while(it.getNext() != head)
			{
				it = it.getNext();
			}
			it.setNext(temp);
			temp.setNext(head);
			head = temp;	
		}
	}

	public void append(int value)
	{
		Node temp = new Node(value);

		if(head == null)
		{
			head = temp;
			head.setNext(temp);    ///change
		}

		Node it = head;

		while(it.getNext()!=head)
		{
			it = it.getNext();	
		}
		it.setNext(temp);
		temp.setNext(head);
	}

	public String toString()
	{
		String str = "";

		if(head == null)
		{
			System.out.println("CLL is Empty");
		}
		else
		{
			Node it = head;
			do {

				str += ""+ it+"-->";
				it = it.getNext();
			}
			while(it!=head);
		}
		return str;
	}

	public int getNoofNodes()
	{
		Node it = head;
		int counter = 0;
		do {
			it = it.getNext();
			counter ++;
		}while(it!=head);

		return counter;
	}

	public void deletefirst()
	{
		if(head == null)
		{
			System.out.println("CLL is Empty");
		}
		else
		{
			Node it = head;						
			Node itn = it.getNext();					///Swap head and head.next data and  delete head.next
			int x = it.getData();							// this we are doing to avoid iterations 
			it.setData(itn.getData());					// and same deletefirst can be done by iteration; 
			itn.setData(x);

			head.setNext(itn.getNext());
			itn.setNext(null);
		}
	}

	public void deletelast()
	{
		Node it =head;
		if(head == null)
		{
			System.out.println("CLL is Empty");
		}
		else if(it.getNext()==head)
		{

			head.setNext(null);
			head = null;
		}
		/*do {
													///this is also correct
			it = it.getNext();
		}while(it.getNext().getNext()!=head);*/
		else
		{
			while (it.getNext().getNext() != head)
			{
				it = it.getNext();
			}

			Node temp = it.getNext();
			it.setNext(head);
			temp.setNext(null);

		}
	}

	public void deleteBypos(int pos)
	{
		int n = getNoofNodes();

		if(pos == 1)
		{
			deletefirst();
		}
		else if(pos == n)
		{
			deletelast();
		}

		else if(pos>1 && pos<n)
		{
			Node it = head;
			for(int i=1; i<pos-1; i++)
			{
				it = it.getNext();
			}
			Node tempo = it.getNext();
			Node temp = tempo.getNext();
			it.setNext(temp);
			tempo.setNext(null);
		}
		else
		{
			System.out.println("Invalid Position!!");
		}

	}

	public void insertBypos(int value, int pos)
	{
		int n = getNoofNodes();

		if(pos == 1)
		{
			insert(value);
		}
		else if(pos == n+1)
		{
			append(value);
		}

		else if(pos>1 && pos<n+1)
		{
			Node temp = new Node(value);
			Node it = head;
			for (int i=1; i<pos-1;i++)
			{
				it = it.getNext();
			}
			Node itn = it.getNext();
			it.setNext(temp);
			temp.setNext(itn);
		}
		else
		{
			System.out.println("Can't Insert...Invalid Position");
		}
	}

	public void reverse()
	{
		Node itp = head;
		Node it = head.getNext();
		Node itn = head.getNext();
		
		while (it != head)
		{
			itn = itn.getNext();
			it.setNext(itp);
			itp = it;
			it = itn;
		}
		head.setNext(itp);
		head = itp;
	}
}












