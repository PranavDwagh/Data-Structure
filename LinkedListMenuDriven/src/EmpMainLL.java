import java.util.Scanner;

public class EmpMainLL {
	public static void main(String[] args) {
	
		EmpLL emplist = new EmpLL();
		
		Scanner sc = new Scanner(System.in);
		
		Employee e1;
		
		while (true)
		{
			showmenu();
			
			System.out.println("Enter a Choice");
			int option = sc.nextInt();
			if(option==9)
			{
				System.out.println("Program Terminated...!!!");
				break;
			}
				
			switch(option) 
			{
			
			case 1 :
				
				e1 = populateEmployee();
			
				emplist.insert(e1);
				System.out.println("Details inserted Successfully");
				break;
				
			case 2 :
				e1 = populateEmployee();
				
				emplist.append(e1);
				System.out.println("Details appended Successfully");
				break;

			case 3 : 
			
				
				emplist.deletelast();
				System.out.println("Last Employee record Deleted");
				break;
				
			case 4 :
				
				System.out.println(emplist);
				break;
				
			case 5 :
				System.out.println("Enter ID of Employee");
				int id= sc.nextInt();
				emplist.getDetailsById(id);
				break;
				
			case 6 :
				emplist.salaryMorethan();
				break;
				
			case 7 :
				System.out.println("Enter first char of Employee");
				char c = sc.next().charAt(0);
				emplist.nameStartWithletter(c);
				break;
				
			case 8 :
				
				emplist.deletelist();
				System.out.println("Record Deleted...!!!");
				System.out.println(emplist);
			}
		}
	}
	
	public static void showmenu()
	{
		
		System.out.println("Enter a choice");
		System.out.println("1. Insert new Employee");
		System.out.println("2. Append new Employee");
		System.out.println("3. Delete Last Employee");
		System.out.println("4. Print Employee List");
		System.out.println("5. Print Employee Details by ID");
		System.out.println("6. Print all Employee having specific salary");
		System.out.println("7. Print all Employee Start with specific letter");
		System.out.println("8. Delete Employee list");
		System.out.println("9. Exit");
	
	}
	
	
	public static Employee populateEmployee()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name");
		String n = sc.next();
		System.out.println("Enter Employee ID");
		int a = sc.nextInt();
		System.out.println("Enter Employee salary");
		int s = sc.nextInt();
		
		Employee e = new Employee(n, a , s);
		
		return e;
		
	}
	

}
