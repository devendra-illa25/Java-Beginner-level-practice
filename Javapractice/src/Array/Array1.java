package Array;

public class Array1 {

	public static void main(String[] args) {
	
//		String array in single dimension array
		
		String st[]=new String[3];
		st[0]="Welcome";
		st[1]="to";
		st[2]="Array Concept";
		 
		System.out.println(st.length); //Returns length of an Array
		
		for(String i:st)
		{
			System.out.println(i);
		}
	}

}
