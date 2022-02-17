
public class LinkList {

	Node head;

	public LinkList()
	{
		head = null;		
	}

	public void append(String value)
	{
		//Space = O(1)
		//time = O(n-1) = O(n)
		Node tmp = new Node(value);

		if(this.head == null)
		{
			head = tmp;
		}
		else
		{
			Node it = this.head;

			while(it.next != null)
			{
				it = it.next;
			}
			it.next = tmp;			
		}
	}

	public void deleteByPos(int pos)
	{
		int noOfNodes = getNumberOfNodes();

		if(pos == 1)
		{
			deleteFirst();
		}
		else if(pos == noOfNodes)
		{
			deleteLast();
		}
		else if(pos > 1  && pos < noOfNodes)
		{
			//now we have to delete node somewhere in middle
			Node itp = head;
			int x = pos-1;
			while(--x != 0)
			{
				itp = itp.next;
			}
			//itp reached pos-1 node

			Node it = itp.next;

			itp.next = it.next;

			it.next = null;
			it=null;			
		}
		else
		{
			System.out.println("Invalid Position...");
		}
	}

	private int getNumberOfNodes() 
	{
		Node it = head;
		int counter = 0;
		while(it != null)
		{
			counter++;
			it = it.next;
		}		
		return counter;
	}

	public void deleteFirst()
	{
		if(this.head != null)
		{
			//we have 1 or more node in LL.

			//Check if we have only 1 node
			if(this.head.next == null)
			{
				//Yes we have only 1 node in LL
				//Delete that node and make head=null
				Node tmp = this.head;
				this.head = null;

				//Java dont have delete.. so just make object ref as null
				//GC will delete this object ASAP
				tmp.next = null;
				tmp = null;				
			}
			else
			{
				//We have more than 1 node..
				Node tmp = this.head;				
				this.head = tmp.next;

				tmp.next = null;
				tmp = null;				
			}

		}
	}

	public void deleteLast()
	{
		if(this.head != null)
		{
			//we have 1 or more node in LL.

			//Check if we have only 1 node
			if(this.head.next == null)
			{
				//Yes we have only 1 node in LL
				//Delete that node and make head=null
				Node tmp = this.head;
				this.head = null;

				//Java dont have delete.. so just make object ref as null
				//GC will delete this object ASAP
				tmp.next = null;
				tmp = null;				
			}
			else
			{
				//Go to last node...
				Node it = this.head;

				while(it.next != null)
				{
					it = it.next;
				}

				//now it points to last node

				Node itp = this.head;
				while(itp.next != it)
				{
					itp = itp.next;
				}
				//Now itp points to last but one node.

				itp.next = null;
				it = null;	
			}
		}
	}

	public String toString() 
	{
		String str = "";

		if(this.head == null)
		{
			str = str + "LL is Empty";
		}
		else
		{
			Node it = head;

			while(it != null)
			{
				str = str + it.data + "->";
				it = it.next;
			}
		}
		return str;
	}

	public boolean search(String input) 
	{
		boolean found = false;
		
		Node it = head;
		while(it != null)
		{
			if( it.data.equals(input) == true)
			{
				found = true;
				break;
			}
			it = it.next;
		}
		
		return found;
	}

}
