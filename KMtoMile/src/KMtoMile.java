import java.util.Scanner;

public class KMtoMile {

	public static void main(String[] args) {
		
		System.out.println("Enter KM");
		
		Scanner sc = new Scanner(System.in);
		
		int km = sc.nextInt();
		
		float mile;
		
		mile = 0.62f * km;
		
		System.out.println("Answer in Mile : "+mile);
		
		
	}
	
	
}
