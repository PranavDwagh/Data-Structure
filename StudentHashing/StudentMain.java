import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		System.out.println("Enter Size of Hashing");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		StringHashing sh = new StringHashing(size);
		
		populateStudent(sh , sc, size);
		
		System.out.println("Enter mobile no to search");
		String str = sc.next();
		
		sh.search(str);
		

	}

	public static void populateStudent(StringHashing sh, Scanner sc, int size)
	{	
		for (int i=0; i<size; i++)
		{
		System.out.println("Enter name of Student");
		String name = sc.next();
		System.out.println("Enter age of Student");
		int age = sc.nextInt();
		System.out.println("Enter Mobile Number");
		String mobNo= sc.next();
		System.out.println("Enter Email ID");
		String email = sc.next();
	Student s = new Student(name, age, mobNo, email);
	sh.insert(s);
		}
	}
	
	
	
	
	
}
