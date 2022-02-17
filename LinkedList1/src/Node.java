
public class Node {
	
	private String string;
	private Node next;
	
	public Node() {
		// TODO Auto-generated constructor stub
	}
	
	public Node(String str)
	{
		string = str;
		next = null;
	}
	public String toString()
	{
		String str = "";
		str += string+"->";
		return str;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	

}
