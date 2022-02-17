import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		
		String	str = sc.nextLine();
		
		System.out.println("Input String "+str);
		
		String string = str.toUpperCase();
		
		char [] d = new char[string.length()];
		
		char [] c = str.toCharArray();
		
		for (int i=0; i<string.length(); i++)
		{
			d [i] = string.charAt(i);
		}
		
		for(int i = 0; i<d.length; i++)
		{
			System.out.println(d[i]);
		}
		
	
		
	}

}
