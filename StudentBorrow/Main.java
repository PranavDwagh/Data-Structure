
public class Main {

	public static void main(String[] args) {

		int[]marks=new int[]{88,87,89,86,88};
		int[]marks1=new int[]{65,63,66,55,56};
		int[]marks2=new int[]{71,72,77,78,79};
		int[]marks3=new int[]{71,59,66,69,65};
		
		
		StudentQueue q1 = new StudentQueue();
		Student s1= new Student("asdf",12,marks);
		Student s2= new Student("abcd",13,marks1);
		Student s3= new Student("efgh",15,marks2);
		Student s4= new Student("ijkl",15,marks3);
		
		
		StudentQueue q2 = new StudentQueue();
		
		
		
		
		q1.insert(s1);
		
		q1.insert(s2);
		
		q1.insert(s3);
		
		q1.insert(s4);
		
		
		q1=q1.Marks_Above75();
	
		System.out.println(q1);
		
		
		

	}

}
