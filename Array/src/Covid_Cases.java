import java.util.Scanner;

public class Covid_Cases {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of Cases og First Week");
		int [] Covid_case = new int [7];
		
		for(int i=0; i<Covid_case.length; i++)
		{
			System.out.println("Enter Cases for Week"+(i+1));
			Covid_case[i] = sc.nextInt();
		}
		
		System.out.println("");
		
		for(int i=0; i<Covid_case.length; i++)
		{
			System.out.print("Cases in week "+(i+1)+" ");
			System.out.println(Covid_case[i]);
		}
	
		getTotalCount(Covid_case);
	}

	private static void getTotalCount(int[] covid_case) {
		
		int count = 0;
		for(int i=0; i<covid_case.length;i++)
		{
			count = count + covid_case[i];
		}
		
		System.out.println("Total Count of Cases :"+ count);
		
	}
}
