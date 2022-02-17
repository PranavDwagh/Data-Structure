import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		DQueue q = new DQueue();
		
		q.insert(10);
		q.insert(20);
		q.insert(30);
		
		System.out.println(q);
		
		q.remove();
		System.out.println(q);
		
	}
}
