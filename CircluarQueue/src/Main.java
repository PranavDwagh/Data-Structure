import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		CQueue q = new CQueue();
		q.remove();
		System.out.println(q);
		q.insert(500);
		q.insert(10);
		q.insert(50);
		q.insert(56);
		q.insert(05);
		q.remove();
		q.insert(50);
		q.insert(56);
		q.insert(05);
		q.remove();
		q.remove();
		q.remove();
		q.remove();
		q.remove();
		q.remove();
		q.remove();
		
		System.out.println(q);
	
	}
	

}
