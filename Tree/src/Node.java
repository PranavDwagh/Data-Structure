
public class Node {
		
	Node left;
	Node right;
	int data;
	
	public Node(int d)
	{
		data = d;
		left = null;
		right = null;
	}
	
	public String toString()
	{
		String str = "";
		
		str += "" + data;
		
		return str;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	
	
	
}
