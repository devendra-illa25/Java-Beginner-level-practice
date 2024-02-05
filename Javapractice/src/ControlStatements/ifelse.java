package ControlStatements;

import java.util.Scanner;

public class ifelse {
	public static void main(String[] args)
	{
//		check whether 10 and 20 are equal or notSystem.out.println("Enter value for x:");
		
		/*Scanner sc=new Scanner(System.in); //System.in is a standard input stream
		System.out.println("Enter valur for x:");
		int x= sc.nextInt(); // int nextInt, float nextFloat, double nextDouble, byte nextByte
							//  String nextLine(), nextBoolean(), nextLong, nextShort()
		
		System.out.println("Enter valur for y:");
		int y=sc.nextInt();
	
		if(x==y) {
			System.out.println("Both x and y are equal");
		}else {
				System.out.println("Both are not same");
		}*/
		
//	WAP to check whether 10is positive or negative
		Scanner sc=new Scanner(System.in); //System.in is a standard input stream
		System.out.println("Enter valur for x:");
		int x= sc.nextInt();
		
		if(x>0) {
			System.out.println("It is Positive number");
		}else {
				System.out.println("it is negative number");
		
	}

}
}
