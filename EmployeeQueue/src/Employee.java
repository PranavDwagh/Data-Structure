
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


	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void display_fun()
	{
		System.out.println("Name: "+empName+ "\nEmpID: "+empID+ "\n Gender :"+gender);
	}








}