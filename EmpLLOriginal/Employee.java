
public class Employee {

	private String name;
	private int id;
	private int sal;
	
	public int getId()
	{
		return id;
	}
	
	public Employee(int id, String name, int sal) 
	{
		this.id = id;
		this.sal = sal;
		this.name = name; 
	}
	
	public String toString() 
	{
		String str = "";
		str = "Emp ID: " + id + ", Emp Name: " + name + ", Emp Sal: " + sal;
		return str;
	}
	
}
