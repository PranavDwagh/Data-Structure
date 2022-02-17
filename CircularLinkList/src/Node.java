
public class Node {

	int data;
	Node next;

	public Node(int d)
	{
		data = d;
		next = null;
	}
	public String toString()
	{
		String str = "";

		str += "" + data;

		return str;
	}
	public void setNext(Node n)
	{
		next = n;
	}
	
	public Node getNext()
	{
		return next;
	}
	
	public void setData(int d)
	{
		data = d;
	}
	
	public int getData()
	{
		return data;
	}
}