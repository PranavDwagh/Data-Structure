import java.util.Scanner;

public class TreeMain {
	
	public static void main(String[] args) {

			Tree  tree = new Tree();
			
			tree.insert(25);
			tree.insert(18);
			tree.insert(12);
			tree.insert(40);
			tree.insert(50);
			tree.insert(20);
			tree.insert(35);
			
			tree.preorderPrint();
			tree.inorderPrint();
			tree.postorderPrint();
			
			tree.search(35);
			
	}
}
