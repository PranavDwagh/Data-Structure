import java.util.Scanner;

public class OddNoNodeMain {
	
	public static void main(String[] args) {

			OddNoLL ll = new OddNoLL();
			
			ll.insert(100);
			ll.insert(90);
			ll.insert(80);
			ll.insert(70);
			ll.insert(60);
			ll.insert(50);
			ll.insert(40);
			ll.insert(30);
			ll.insert(20);
			ll.insert(10);
			
			ll.insert(100);
			ll.insert(90);
			ll.insert(80);
			ll.insert(70);
			ll.insert(60);
			ll.insert(50);
			ll.insert(40);
			ll.insert(30);
			ll.insert(20);
			ll.insert(10);
			
			ll.insert(100);
			ll.insert(90);
			ll.insert(80);
			ll.insert(70);
			ll.insert(60);
			ll.insert(50);
			ll.insert(40);
			ll.insert(30);
			ll.insert(20);
			ll.insert(10);
			ll.append(110);
			ll.append(120);
			System.out.println(ll);
			ll.deleteOdd();
		
			System.out.println(ll);
			
			



	}
}
