package Conditional_statements;

import java.util.Scanner;

public class Nested_if {

	public static void main(String[] args) {
		String examStatus="pass";
//		if(examStatus.equals("pass"))
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("what is your Online assesment ?");
		String examStatus=scanner.nextLine();*/
			if(examStatus=="pass") {
				System.out.println("Plz Wait for further rounds");
				String round1Status="pass";
				if(round1Status=="pass") {
					System.out.println("Plz Wait for round 2");
					String round2Status="pass";
					if(round2Status=="pass") {
						System.out.println("Plz Wait to meet HR");
					}
					else {
						System.out.println("you can goto home");
					}
				}
					else {
						System.out.println("you can goto home");
					}
				}
			
			else {
				System.out.println("you can goto home");
			}
			}
		
	}

