
public class DLinkList {

	Node head;
	Node tail;


	public DLinkList()
	{
		head = null;
		tail = null;
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

	public void insert (int value)
	{
		Node temp = new Node(value);

		if (head == null)
		{
			head = temp;
			tail = temp;
		}
		else
		{
			temp.setNext(head);
			head.setPrev(temp);
			head = temp;
		}
	}

	public void append(int value)
	{
		Node temp = new Node(value);
		if(tail==null)					// if(head == null) also ok
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

	public void deleteAll()
	{
		if(head == null)
		{
			System.out.println("DLL is Empty");
		}
		else
		{
			Node it = head;
			while (it != null)
			{
				Node tmp = it.getNext();
				it.setNext(null);
				it.setPrev(null);
				it = tmp;
				//	it = tmp.getNext();
			}

			head = null;				//not required but doing for safety
			tail = null;
		}
	}

	public void deleteFirst()
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

	public void deletelast()
	{
		if (head == null)
		{
			System.out.println("DLL is empty");
		}
		else if(head.getNext()== null)
		{
			Node temp = head;
			head = null;
			tail = null;
		}
		else
		{
			Node temp = tail;
			tail= temp.getPrev();
			//	tail = tail.getPrev();    //both are same
			tail.setNext(null);
			temp.setPrev(null);
		}
	}

	public void deleteBypos(int pos)
	{
		int n = getNoofNode();
		if(head==null)
		{
			System.out.println("DLL is Empty");
		}
		else if(pos == 1)
		{
			deleteFirst();
		}
		else if(pos == n)
		{
			deletelast();
		}
		else if(pos >1 && pos<n)
		{
			Node it = head;
			for (int i=1 ; i<pos-1; i++)
			{
				it = it.getNext();
			}
			Node temp = it.getNext().getNext();
			Node tempo = it.getNext();
			it.setNext(temp);
			temp.setPrev(it);
			tempo.setNext(null);
			tempo.setPrev(null);
		}
		else
		{
			System.out.println("Invalid Node!!!");
		}
	}

	public int getNoofNode()
	{
		Node it = head;
		int counter = 0;

		while (it!= null)
		{
			counter++;
			it = it.getNext();
		}
		return counter;
	}

	public void insertBypos(int value, int pos)
	{
		int n = getNoofNode();
		Node it = head;

		if (pos == 1)
		{
			insert(value);
		}

		else if(pos == n+1)
		{
			append(value);
		}

		else if(pos> 1 && pos<n+1)
		{
			for(int i = 1; i<pos-1; i++)
			{
				it=it.getNext();
			}
			//	Node tempo = it.getNext().getNext();     ///This line to replace a node
			Node  tempo = it.getNext(); 				// this line is for inserting the node
			Node temp = new Node(value);
			it.setNext(temp);
			temp.setPrev(it);
			temp.setNext(tempo);
			tempo.setPrev(temp);

		}
	}

	public void reverse()
	{
		if (head == null)
		{
			System.out.println("DLL is empty");
		}
		else 
		{
			Node it = head;
			Node itp = head.getPrev();	
			while(it!= null)
			{
				it.setPrev(it.getNext());
				it.setNext(itp);
				itp = it;
				it = it.getPrev();
			}
			Node temp = head;
			head = tail;
			tail = temp;	
		}
	}



}
