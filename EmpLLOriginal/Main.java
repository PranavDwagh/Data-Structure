
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		LinkList empList = new LinkList();


		System.out.println("***** Welcome *******");
		while(true)
		{
			ShowMenu();
			int option = sc.nextInt();

			if(option == 9)
				break;
			
			switch (option) {

			case 1:
			{
				Employee e = getNewEmp(sc);
				empList.insert(e);
				System.out.println("Inserted !");
			}
			break;

			case 2:
			{
				Employee e = getNewEmp(sc);
				empList.append(e);
				System.out.println("Appended !");
			}
			break;
			
			case 5:
			{
				System.out.println("Enter Employee ID:");
				int id = sc.nextInt();
				Employee e = empList.getEmployeeById(id);
				System.out.println(e);
			}
			break;
			
			case 4:
				System.out.println(empList);
			break;
			
			default:
				System.out.println("TBD");
				break;
			
			}
			
			System.out.println();
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		}
	}

	private static Employee getNewEmp(Scanner sc) {

		System.out.println("Enter Emp ID:");
		int id = sc.nextInt();
		System.out.println("Enter Emp Name:");
		String name = sc.next();
		System.out.println("Enter Emp Sal:");
		int sal = sc.nextInt();

		Employee e = new Employee(id, name, sal);
		return e;
	}

	private static void ShowMenu() {

		System.out.println("What you want to do?");
		
		System.out.println("Press 1 to insert new employee");
		System.out.println("Press 2 to append new employee");
		System.out.println("Press 3 to delete Last employee");
		System.out.println("Press 4 to print employee list");
		System.out.println("Press 5 to print employee details by id");
		System.out.println("Press 6 to print all Emp with sal > 2000");
		System.out.println("Press 7 to print all Emp name start with letter 'a' ");
		System.out.println("Press 8 to delete empty list");
		System.out.println("Press 9 for exit");
	}
}
