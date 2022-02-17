import java.util.Scanner;

public class Main {

	public static void main(String [] args)
	{
		Linkedlist l1 = new Linkedlist();

			l1.insert(10);
			l1.insert(20);
			l1.insert(30);
			l1.insert(60);
			
		//	l1.deletefirst();
			
			System.out.println(l1);
			l1.deleteBypos(3);
			System.out.println(l1);
 } 
	

}