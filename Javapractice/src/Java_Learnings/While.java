package Java_Learnings;

public class While {
	public static void main(String[]args) {
		//WAP to print 1 to 30 using while loop
		/*int i=1;
		while(i<=30) {
			System.out.println(i);
			i++;
		}*/
		
		//.WAP to print 30 to 5 using while loop
		/*int i=35;
		while(i>=5) {
			System.out.println(i);
			i--;
		}*/
		
		//.WAP to print
//		c. alternate charcters
		
		/*char ch='a'	;
		while(ch<='z') {
			System.out.print(ch);
			ch+=2;
		}*/
		
		//WAP to find reverse of a number
		/*int num=123,rev=0,rem;
		while(num>0) {
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
			
		}
		System.out.println(rev);*/
		
		//.WAP to check whether your number is pallindrome or not
		int num=123,rev=0,rem,tem=num;
		while(num>0) {
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
			
		}
		System.out.println(rev);
		if(tem==rev) {
			System.out.println("number is palindrome");
		}
			else {
				System.out.println("number is not palindrome");
			}
		}
	}


