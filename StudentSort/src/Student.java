
public class Student {
	
	private int rollNo;
	private String studentName;
	
	public Student(String n, int rn )
	{
		rollNo = rn;
		studentName = n;
	}
	
	public String toString() {
		String str = "";
		str = "RollNo: " + rollNo + ", Name: " + studentName;
		return str;
	}
	
	public int getRollNo()
	{
		return rollNo;
	}

}

