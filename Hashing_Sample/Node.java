
public class Node 
{
	String data;
	Node next;
	
	public Node(String d) 
	{
		data = d;
		next = null;
	}
	
	public Node(String d, Node n) 
	{
		data = d;
		next = n;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
}
