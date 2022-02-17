
public class MainString {
	public static void main(String[] args) {
		
		Stack s1 = new Stack();
		
		Student ram = new Student("Ram", 14);
		Student sham = new Student ("Sham", 20);
		Student don = new Student ("don", 20);
		Student sun = new Student ("sun", 36);
		
		s1.push(ram);
		s1.push(sham);
		s1.push(sun);
		s1.push(don);
		s1.push(don);
		s1.push(don);
		s1.pop();
		s1.push(don);
		s1.push(sham);
		s1.push(sham);
		s1.push(sham);
		s1.push(sham);
		
		s1.pop();
		
		System.out.println(s1);
		
		
		
		
		
	}
	

}
