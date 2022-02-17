
public class Node {

	int data;
	Node next;


	public Node(int a) {

		data = a;
		next = null;
	}

	public Node(int a, Node n)
	{
		data = a;
		next = n;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public String toString() {

		String str = "";
		

		str = ""+ data+ "-->";

		return str;
	}
















}



