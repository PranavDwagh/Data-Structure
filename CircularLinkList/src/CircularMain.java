import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CircularMain {
	
	public static void main(String[] args) {
		
		CircularLL cll = new CircularLL();
		cll.insert(50);
		cll.insert(60);
		cll.append(40);
		cll.append(30);
		cll.insert(70);
		System.out.println(cll);		
		
		cll.deletelast();
		
		System.out.println(cll);
		
		cll.insertBypos(500, 6);
		System.out.println(cll);
		cll.reverse();
		System.out.println(cll);
		
	}	
	
	
}
