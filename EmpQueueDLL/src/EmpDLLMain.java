import java.util.Scanner;

public class EmpDLLMain {

	public static void main(String[] args) {
		
		EmpDLL edll = new EmpDLL();
	//	EmpDLL l = new EmpDLL();
		Scanner sc= new Scanner (System.in);
		
		while (true)
		{
			showfun();
			int option = sc.nextInt();
			if(option == 0)
			{
				System.out.println("Out of the Loop");
				break;
			}
			else if(option>5)
			{
				System.out.println("Invalid Choice");
			}
			else
			{
				switch(option)
				{
				case 1:
					Employee e1 = populateEmployee();
					edll.insert(e1);
					System.out.println("Employee Inserted");
					break;
					
				case 2:
					
					edll.remove();
					System.out.println(edll);
					break;
					
				case 3:
					System.out.println("Enter Employee gender:");
					char gn = sc.next().charAt(0);
				//	l.maleEmployee(edll, gn);							//using "this" operator
					edll.maleEmployee(gn);
				//	System.out.println(edll);						
					break;	
					
				case 4:
					System.out.println(edll);
					break;
					
				case 5:
					if(edll.isEmpty()==true)
					{
						System.out.println("Employee DLL is Empty");
					}
					else
					{
						System.out.println("Employee DLL is not Empty");
					}
					
					break;
				}
			}
		}
	}
	
	public static Employee populateEmployee()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Name :");
		String na = sc.next();
		
		System.out.println("Enter ID of Employee");
		int i = sc.nextInt();
		
		System.out.println("Enter Gender of Employee");
		char g = sc.next().charAt(0);
		
		Employee e = new Employee(i, na, g);
		
		return e;
	}
	
	public static void showfun()
	{
		System.out.println("***Enter a choice***");
		System.out.println("1. Insert employee in queue");
		System.out.println("2. Remove employee from queue");
		System.out.println("3. Get Male Employee");
		System.out.println("4. Print Employee");
		System.out.println("5. Check list Empty or not");
		System.out.println("0. Exit");
	}
	
	
}
