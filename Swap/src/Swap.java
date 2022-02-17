import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {

		System.out.println("Enter two numbers");
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("A = "+a+ " B= "+b);
		a = swap(b, b=a);
		System.out.println("A = "+a+ " B= "+b);



	}


	public static int swap(int x, int y)
	{
		return x;
	}


}
