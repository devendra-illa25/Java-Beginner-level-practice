package Array;

public class Stringmethods {

	public static void main(String[] args) {
		
		String s="Welcome";
		
		//s.length(); //Return how many characters in string
		System.out.println(s.length());
		
		//s.concat(); joining of one or more strings
		
		String s1="Welcome to";
		String s2="Trainig";
		System.out.println(s1+" "+s2);
		
		System.out.println(s1.concat(s2));//another way
		
		System.out.println("Welcome to" + "Training");
		System.out.println("Welcome".concat("Training"));
		
		//s.equals(); //which is used for comparing the two different strings
						//return true or false
		
		String s3="WELCOME";
		String s4="welcome";
		
		System.out.println(s3.equals(s4));
		
//	 to Ignore case senstivity
		System.out.println(s3.equalsIgnoreCase(s4));
		
		//s.contains(); particular words present in string or not gives true or false
		
		System.out.println(s3.contains("WEL"));
		System.out.println(s3.contains("abc"));
		
		//s.substring();  
		/*it requires two parameters(Starting index and ending index)
		index start with zero(starting) one for (Ending)
		
		 0 1 2 3 4 5 6 (starting index always stars with zero)
		 W E L C O M E
		 1 2 3 4 5 6 7 (Ending index starts with one)*/
		
		System.out.println(s3.substring(0,3));
		System.out.println(s.substring(2,5));
		
		//s.replace();
		/* replace one character with another character
		*/
		
		
		System.out.println(s.replace('e','a')); //single character
		System.out.println(s.replace("come","deva"));// multiple
		
		
	}

}
