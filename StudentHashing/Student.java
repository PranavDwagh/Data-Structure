
public class Student {
	
	int age;
	String name;
	String mobNo;
	String Email;

	
	public Student(String n, int a, String m, String e)
	{
		name = n;
		age = a;
		mobNo = m;
		Email = e;
	}
	
	
	public String toString()
	{
		String str = "";
		
		str = "Name : " +name+ " Age : "+age+ " Mobile No: "+ mobNo+ "Email : "+ Email;
		return str;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMobNo() {
		return mobNo;
	}


	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}
	
	
	
}
