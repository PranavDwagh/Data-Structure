import java.util.Scanner;

public class StudentDLLMain {

	public static void main(String[] args) {

		StudentDLL sdll = new StudentDLL();
		
		Student s = new Student();

		while(true)
		{
			showmenu();
			
			Scanner sc = new Scanner(System.in);
			
			int choice = sc.nextInt();
			
			if(choice==0)
			{
				System.out.println("Out of the loop");
				break;
			}
			else if (choice>3)
			{
				System.out.println("Invalid Choice");
			}
			
			switch (choice)
			{
			case 1:
				s = populateStudent();
				sdll.push(s);
				System.out.println(sdll);
				break;

			case 2:
				sdll.pop();
				System.out.println(sdll);
				break;
				
			case 3:
				System.out.println(sdll);
				break;
			}
			
		}

	}

	private static void showmenu() {
		
		System.out.println("*****Enter Your Choice******");
		System.out.println("1. Push Student in Stack");
		System.out.println("2. Pop Student from Stack");
		System.out.println("3. Print Student");
		System.out.println("0. Exit");
		
	}

	public static Student populateStudent() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Name of Student");
		String n = sc.next();

		System.out.println("Enter age of Student");
		int a = sc.nextInt();

		System.out.println("Enter Gender of Student");
		char g = sc.next().charAt(0);

		Student s = new Student(a, n, g);
		
		return s;

	}

}
