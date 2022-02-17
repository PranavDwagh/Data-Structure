
public class Linkedlist {

	Node head;

	public Linkedlist(){

		head = null;
	}

	public int getNumberOfNode()
	{
		int nodeCount=0;
		Node it = head;

		while (it!=null)
		{
			nodeCount++;
			it= it.getNext();
		}

		return nodeCount;
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
				//below to lines are enough to for entire else
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
			Node it = head;
			while (it.getNext()!=null)
				it=it.getNext();
			it.setNext(tmp);
			return;

		}

	}

	public void insertBypos(int value, int pos)
	{
		int numberOfNodes= getNumberOfNode();
		Node temp = new Node(value);

		if (pos == 1)									//function already made for insert first
		{
			insert(value);
		}

		else if(pos == numberOfNodes+1)					// function already made for append
		{
			append(value);								// numberOfNodes plus 1 taken because numberofnodes gives length of linklist when we insert one more element in that its length will increase by 1
		}

		else if (pos >1 && pos<numberOfNodes+1)				// pos<=numberofnodes can be use 
		{
			Node it = head;
			// int it_pos = pos -1;
			for (int i=1; i<pos-1; i++)
			{
				it= it.getNext();
			}
			temp.setNext(it.getNext());
			it.setNext(temp);
		}
		else 
		{
			System.out.println("invalid position");
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
  
	public void deletelast() {
		if (head == null)
		{
			System.out.println("LL is Empty");
		}
		
		else if (head.getNext()==null)			//if only one element in linked list.
		{
			Node temp= head;
			head = null;
		}
		
		else 
		{
			Node it = head;
			while(it.getNext().getNext()!=null)	 //checking last to last element next as once we move forward there is not path to return
			{
				it = it.getNext();
			}
			Node tmp = it.getNext();			//no need to capture value in tmp, this is procedure.
			it.setNext(null);	
			tmp.setNext(null);// setting last link to null
		}
	}
	
	public void deleteBypos(int pos)
	{
		
		int noOfNode = getNumberOfNode();
		
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
	
	public void reverselink()
	{
		Node itp = null ;				//itp taken to store previous node and it always follows it
		Node it = head;				
		Node itn= head;					// itn will be always next to it and it will follow itn. itn taken to store address of next node of it because after reversing thw node it must be accesible via itn
		while (it != null)
		{
			itn = itn.getNext(); 		// as itn initially pointing to head (means first node). move it one step forward 
			it.setNext(itp);		///////itp value will be assign to it which means as initially itp= null; after this step 'it' will be null
			itp = it;						// take itp to it position,so  that it can move forward to itn  position
			it = itn;						// take it to itn position
		}
		head = itp;					// as at last it and itn  will be null; and itp will be storing address of last node, assign it to head 
	}							/// now link is reversed
	
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
