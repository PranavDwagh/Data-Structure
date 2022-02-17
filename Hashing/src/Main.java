import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		
		Hashing stringHash = new Hashing(size);
		
		for(int i=0; i<size; i++)
		{
			System.out.println("Enter String ");
			String inputStr = sc.next();
			stringHash.insert(inputStr);
			
		}

		System.out.println("Input search string");
		String inputString = sc.next();
		stringHash.search(inputString);
		
		
	}

}
