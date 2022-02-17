import java.util.Scanner;

public class Employee {
	
	private String name;
	private int  id ;
	private int salary;
	
	
	public Employee() {
		
		name = "UNKNOWN";
		id = 00;
		salary = 0;
	}
	
	public Employee (String n, int a , int s )
	{
		name = n;
		id = a; 
		salary = s;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	public String toString() {
		
		String str= "name=" + name + ", id=" + id + ", salary=" + salary + "ss\n";
		return str;
		
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
