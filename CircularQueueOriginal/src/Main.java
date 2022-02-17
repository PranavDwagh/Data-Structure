
public class Main {

	public static void main(String[] args) {
	
		CQueue q = new CQueue();
		
		q.remove();
		q.insert(500);
		q.insert(10);
		q.insert(50);
		q.insert(56);
		q.insert(05);
		q.remove();
		q.insert(50);
		q.insert(56);
		q.insert(05);
		
		
		/*
		 * q1.isEmpty()
		 * q1.isFull()
		 * CQueue q3 = q1.buildOddNumberQueue();
		 * 
		 */
		System.out.println(q);
	}
	
}
