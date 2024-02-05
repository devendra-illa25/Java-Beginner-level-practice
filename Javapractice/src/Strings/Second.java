package Strings;

public class Second {

	public static void main(String[] args) {
		// Both are not equal
		String s1="Hello";
		String s2=new String("Hello");
		String s4=new String("Hello");
		String s3="Hello";
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s4);
		System.out.println(s1.equals(s2));
	
	}

}
