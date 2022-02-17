
public class Node {
	
	private Employee data;
	private Node next;
	
	public Employee getData() {
		return data;
	}
	
	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node(Employee d) {
		data = d;
		next = null;	
	}
	
	public Node(Employee d, Node n) {
		data = d;
		next = n;
	}
	
	public String toString()
	{
		//System.out.println("Node::toString");
		String str = "";
		str = "" + data + "-->\n";
		return str;
	}
	
	
}
