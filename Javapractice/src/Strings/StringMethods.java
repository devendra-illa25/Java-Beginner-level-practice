package Strings;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// String Methods will return boolean type
		String s1="HE  llo";
		String s2=" hello world  ";
		String s3="HELLO";
		String s4="Hellow World How Are you";
		String s5="886";
		
		//equals
		System.out.println(s1.equals(s2));
		
		//equalsIgnoreCase
		System.out.println(s1.equalsIgnoreCase(s2));
		
		//contains
		System.out.println(s1.contains("HE"));
		System.out.println(s1.contains("l"));
		System.out.println(s1.contains("z"));
		
		//startsWith
		System.out.println(s1.startsWith("HE"));
		
		//endsWith
		System.out.println(s1.endsWith("HE"));
		
		//length
		System.out.println(s1.length());
		
		//trim will remove leading and trailing spaces.
		System.out.println(s2.length());
		System.out.println(s2.trim());
		System.out.println(s2.trim().length());
		
		//toLowerCase
		System.out.println(s3.toLowerCase());	
		
		//toUpperCase
		System.out.println(s2.toUpperCase());
		
		//toCharArray
		System.out.println(s2.toCharArray());
		
		/* to preview into CharArray we need to configure into Debug*/
		char[] a=s1.toCharArray(); //doubt
		//indexOf index will start from zero
		System.out.println(s2.indexOf("l"));
		System.out.println(s2.indexOf(" "));
		System.out.println(s2.indexOf("8"));
		System.out.println(s2.indexOf("o"));//if no char is there -1 will display
		
		//lastindexOf
		System.out.println(s2.lastIndexOf('o'));
		
		//substring
		System.out.println(s2.substring(2));
		System.out.println(s2.substring(2,5));
		
		//split
		System.out.println(s4.split(" "));
		System.out.println(Arrays.toString(s4.split(" ")));
		
		//charAt
		System.out.println(s4.charAt(5));
		
		//replace
		System.out.println(s4.replace("o","z"));
		System.out.println(s4.replace("How","When"));
		
		//valueOf
		//conversionof string to integer
		String s6="123456";
		int i=Integer.valueOf(s6);
		System.out.println(Integer.valueOf(s6));
		
		//conversion of Integer to String
		int j=123456;
		String s7=String.valueOf(j);
		System.out.println(s7);
		
		//isEmpty //isBlank
		String a1;
		String a2="  ";
		String a3="";
		System.out.println(a2.length());
		System.out.println(a2.isEmpty());
		System.out.println(a2.isBlank());//is equal to trim().length()
			
	}

}
