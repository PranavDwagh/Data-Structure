
public class Main {
	
	public static void main(String[] args) {
		
		Tree tree = new Tree();
		tree.insert(20);
		tree.insert(10);
		tree.insert(15);
		tree.insert(67);
		tree.insert(34);
		
		tree.inOrderPrint();
		
		//tree.printSmallestValue();
		//tree.printLargestValue();
		
		//tree.search(22);
		
	//	tree.delete(34);
		tree.insert(50);
		tree.inOrderPrint();
		
		tree.search(334);
		
	}
}
