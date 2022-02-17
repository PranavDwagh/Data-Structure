
public class EmpNode {
	
	Employee data;
	EmpNode next;
	
	public EmpNode(Employee d) {
		
			data = d ;
			next = null;
	}

	public EmpNode(Employee d, EmpNode n) {
		
		data = d;
		next = n;
	}
	
	public String toString()
	{
		String str = "";
		str += " "+ data ;
		return str;
	}

	public Employee getData() {
		return data;
	}

	public void setData(Employee data) {
		this.data = data;
	}

	public EmpNode getNext() {
		return next;
	}

	public void setNext(EmpNode next) {
		this.next = next;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
