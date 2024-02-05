package Practice;

public class Variables {

	static int c=30; //Static Variable//
	int a=10; //Instance Variable//
	public static void main(String [] args) {
		int b=20; //Local Variable//
		System.out.println(c);
		System.out.println(b);
//		System.out.println(a);
		Variables obj=new Variables(); //Obj creation//
		System.out.println(obj.a);
		System.out.println(c);
		System.out.println(b);
	}
}

/* O/P:
    30
    20
    10
 */
		