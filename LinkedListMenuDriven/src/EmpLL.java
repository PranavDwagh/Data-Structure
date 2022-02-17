import java.util.Scanner;
public class EmpLL {

	EmpNode head;


	public EmpLL() {

		head = null;
	}

	public void insert(Employee e)
	{

		EmpNode temp = new EmpNode(e);

		if(head==null)
		{
			head = temp;
		}

		else
		{
			temp.setNext(head);
			head = temp;
		}

	}


	public void append (Employee e)
	{
		EmpNode tmp = new EmpNode(e);

		if(head==null)
		{
			head = tmp;
			return;
		}

		else 
		{
			EmpNode temp = head;
			while (temp.getNext()!= null)
			{
				temp = temp.getNext();
			}
			temp.setNext(tmp);
			return;
		}
	}

	public void deletelast ()
	{
		if (head ==null)
		{
			System.out.println("LL is Empty");
		}

		else if(head.getNext()==null)
		{
			EmpNode temp = head;
			head = null;
		}
		else
		{
			EmpNode it = head;
			while (it.getNext().getNext()!=null)
			{
				it = it.getNext();
			}
			EmpNode temp = it.getNext();
			it.setNext(null);
		}

	}

	public String toString()
	{
		String str = "";

		EmpNode it = head;

		while (it != null)
		{
			//	str+= ""+it.getData()+"--->";				//one way without using toString
			str+= ""+ it;
			it = it.getNext();
		}
		return str;
	}

	public void deletelist()
	{
		EmpNode temp = head;
		head = null;
	}

	public void salaryMorethan()
	{
		
		System.out.println("Enter Salary");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		
		EmpNode it = head;
		while (it !=null)
		{
			if(it.getData().getSalary()>s)
			{
				System.out.println(it.getData().getName()+ " has salary more than " + s);
			}
			it = it.getNext();
		}	
	}

	public void getDetailsById(int id) {
		
		EmpNode it = head;
		
		while(it!=null)
		{
			if (it.getData().getId()== id)
			{
				System.out.println(it);
				break;
			}
			it = it.getNext();
		}
		
	}
	
	public void nameStartWithletter(char c)
	{
		EmpNode it = head;
		
		while (it != null)
		{
			if (it.getData().getName().charAt(0)==c)
			{
				System.out.println("Name of Employee start "+ c+" letter are "+it.getData().getName());
				it = it.getNext();
			}
		}
		
	}



	







}
