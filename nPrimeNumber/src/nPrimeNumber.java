import java.util.Scanner;

public class nPrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int counter=0;
		int i, j,n;
		System.out.println("Enter No. of prime numbers required");
		n = sc.nextInt();
		///condition for prime number
		int flag = 1;
		for(i=2; i<=n; i++)
		{
			for(j=2; j<i; j++)
			{
				if((i%j)==0)
					flag = 0;
			}

			if(flag == 1)
			{
				System.out.println(i+" ");
			}
		}
	}
}