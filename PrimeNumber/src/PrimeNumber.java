import java.util.Scanner;

public class PrimeNumber {


	public static void print_primes_till_N(int N)
	{

		int i, j, flag=1, counter=0;


		System.out.println("Prime numbers between 1 and "
				+ N + " are:");
		while(counter<N)
		
		{
			for (i = 2; i >0; i++)
			{
				
				
				if (i == 1 || i == 2)
					continue;

				flag = 1;

				for (j = 2; j <= i; ++j)
				{

					if (i % j == 0)
					{
						flag = 0;

						break;
					}
				}

				if (i==j)
				{
					if(counter>N)
					{
						break;
					}
					System.out.println(i + " ");
					counter++;
					
				}
			}

		}
	}
	// Driver code
	public static void main (String[] args)
	{
		int N;
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		print_primes_till_N(N);
	}
}

// This code is contributed by AnkitRai01



