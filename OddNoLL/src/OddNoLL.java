
public class OddNoLL {

	Node head;

	public OddNoLL()
	{
		head = null;
	}

	public void insert(int value) {

		Node tmp = new Node (value);

		if (head==null)			//check for empty condition
		{
			head = tmp;				///assign value send by user to head 
		}
		else
		{
			if(head.getNext()==null) 			// there there is alredy some nodes present in ll
			{										
				tmp.setNext(head);							///head address will be given to temp...now onwards temp will point where head was pointing
				head = tmp;									// how head will be point to data which was brought by temp via value.
			}
			else
			{
				tmp.setNext(head);							//if and else both the condition are same
				head = tmp;
			}
		}
	}

	public void append(int value) {

		Node tmp = new Node(value);

		if(head == null)
		{
			head = tmp;
			return ; 

		}
		else 
		{
			Node temp = head;
			while (temp.getNext()!=null)
				temp=temp.getNext();
			temp.setNext(tmp);
			return;

		}

	}

	public void deleteOdd()
	{
		int i = 0;
		for (i = getNoofNodes(); i>0; i--)
			//	for (i = 0; i<getNoofNodes(); ++i)
				if(i%2 != 0)
				{
					deleteBypos(i);
				}
	}
	
	public void deleteBypos(int pos)
	{
		
		int noOfNode = getNoofNodes();

		if(head == null)
		{
			System.out.println("LL is empty");
		}

		else if(pos==1)
		{
			deletefirst();
		}

		else if(pos == noOfNode )
		{
			deletelast();
		}

		else if(pos>1 && pos <noOfNode)
		{
			//Node temp = new Node();

			Node it = head;


			for (int i=1; i<pos-1; i++)
			{
				it = it.getNext();
			}
			/*Node temp = it.getNext().getNext();
			 Node tempo = it.getNext();													// this is also correct
			 tempo.setNext(null);
			 it.setNext(temp);*/

			/*	Node temp = it.getNext();
			 it.setNext(temp.getNext());					// this is also correct...draw diagram for better understanding
			 temp.setNext(null);*/

			Node temp = it;
			it = it.getNext();
			temp.setNext(it.getNext());
			it.setNext(null);

		}	
	}

	private void deletelast() {

		if (head == null)
		{
			System.out.println("LL is Empty");
		}
		else if (head.getNext() == null)
		{
			Node temp= head;
			head = null;
		}
		else
		{
			Node it= head;

			while (it.getNext().getNext() != null)
			{
				it = it.getNext();
			}

			Node temp = it.getNext();
			it.setNext(null);
			temp.setNext(null);

		}

	}

	public void deletefirst() {

		if(head == null)
		{
			System.out.println("ll is Empty");
		}
		else 
		{
			if(head.getNext()==null)			//checking if there is only one link in linklist
			{
				Node temp = head;				//as there is only one element in link list capturing its value to temp and setting to null
				head = null;
			}
			else									
			{
				Node temp = head;					// if there are more than one nodes in link list 
				head = temp.getNext();						// first head value captured in temp and then take what is in next of temp (i.e what is next to head)
				temp.setNext(null);			/// and finally attach its node to head and make that first element null which are free now  
			}
		}
	}

	public int  getNoofNodes()
	{
		Node it = head;
		int counter = 0;

		while (it != null)
		{
			it = it.getNext();
			counter++;
		}
		return counter;
	}

	public String toString() {
		String str = "";

		Node it = head;

		while (it != null)
		{
			//	str+= ""+it.getData()+"--->";				//one way without using toString
			str+= ""+ it;
			it = it.getNext();
		}

		return str;
	}

}
