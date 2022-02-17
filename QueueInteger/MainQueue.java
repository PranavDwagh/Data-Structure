
public class MainQueue {

	public static void main(String[] args) {
		
		Queue q1 = new Queue();
		Queue q2 = new Queue();
		
		q2.insert(33);
		q2.remove();
		q2.insert(24);
		q2.insert(36);
		q2.insert(48);
		q2.remove();
		
		System.out.println(q2);
		q1.sameAs(q2);
		System.out.println(q1);

		//Queue q3 = q2.concat(q1);
		
	//----------------------------
	}
}
