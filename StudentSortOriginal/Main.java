import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		int noOfStudents = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("How Many Students?");
		noOfStudents = sc.nextInt();

		Student [] students = new Student[noOfStudents];
		populate_students(students, sc);
		
		print_students(students);
		Sort.Selection(students, true);
		print_students(students);
		
	}

	private static void print_students(Student[] students) {
		
		System.out.println("********** START **********");
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
	}

	private static void populate_students(Student[] students, Scanner sc) {

		for (int i = 0; i < students.length; i++) {

			int rollNo=0;
			String name="";

			System.out.println("Enter Student Name:");
			name = sc.next();

			System.out.println("Enter Student RollNo:");
			rollNo = sc.nextInt();

			//Now create the students...
			students[i] = new Student(name, rollNo);
		}
	}

}
