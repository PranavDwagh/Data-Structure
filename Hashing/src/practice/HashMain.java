package practice;

import java.util.Scanner;

public class HashMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Size of array ");
		int size = sc.nextInt();
		StringHash stringHash = new StringHash(size);
		
		for (int i = 0; i < size; i++) {
			
			System.out.println("Enter String "+(i+1));
			String inputString = sc.next();
			
			stringHash.insert(inputString);
		}
		
		System.out.println("Enter String to Search ");
		String str1 = sc.next();
		
		stringHash.search(str1);
	}

}
