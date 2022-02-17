import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		System.out.println("Enter Number of Students");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Student [] s = new Student[n];

		populateStudent(s, sc);
		print_students(s);
		Sort.selectionsort(s);

		print_students(s);



	}
	private static void print_students(Student[] students) {

		System.out.println("Details of Student");
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
	}

	public  static void populateStudent(Student [] student, Scanner sc)
	{
		for(int i=0; i<student.length;i++)
		{
			int rollNo=0;
			String name="";

			System.out.println("Enter Student Name:");
			name = sc.next();

			System.out.println("Enter Student RollNo:");
			rollNo = sc.nextInt();

			student[i] = new Student(name, rollNo);
		}



	}

}
