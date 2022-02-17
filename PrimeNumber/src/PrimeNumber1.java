import java.util.Scanner;
public class PrimeNumber1 {

	public static void main(String[] args) {

		System.out.println("Enter how many numbers required");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int i, j, counter= 0;

		while(counter<n)                     
		{
			//  for(i=3; i>0 ; i++)
				for(i=3; i<i+1 ; i++)
				{			
					for(j=2; j<=i;j++)
					{
						if(i%j==0)
						{
							break;
						}
					}
					if (i==j)
					{
						if(counter>n-1)             //n-1 taken because its displaying 6 values when 5 input given
						{
							break;
						}
						counter++;
						System.out.println(i);
					}
				}
		}

	}


}
