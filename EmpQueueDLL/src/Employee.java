
public class Employee {
	int empID;
	String empName;
	char gender;



public Employee()
{
	empID=00;
	empName = "UNKNOWN";
	gender = 'N';
	
}

public Employee(int i, String n, char g)
{
	empName = n;
	empID = i;
	gender = g;
}


public String toString()
{
	String str = "Name : "+empName + ", EmpID: "+empID+ ", Gender : "+gender;
	return str;
}


public void display_fun()
{
	System.out.println("Name: "+empName+ "\nEmpID: "+empID+ "\n Gender :"+gender);
}








}