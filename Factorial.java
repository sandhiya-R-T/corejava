package mypack;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int n;
		long fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		
		for(int i=n;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println("Factorial of a number is "+fact);
		sc.close();
	}

}
