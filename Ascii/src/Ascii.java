import java.util.Scanner;

public class Ascii {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Char");
		while (true)
		{
		char c = sc.next().charAt(0);
		int d = (char) c;
		
		if (c == '`')
			break;
		
		System.out.println("Ascii "+ d);
		}
		
		
	}

	
	
	
}
