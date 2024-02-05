package Practice;

public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5;
		int j=5;
		System.out.println(i); //5
		System.out.println(i++); //5
		System.out.println(--i); //5
		System.out.println(i+ ++i); //5+6
		System.out.println(i); //6
		System.out.println(--j); //4
		System.out.println(j + --i); //4+5
		System.out.println(j++);//4
		System.out.println(j + j++);//5+5
		System.out.println(--i + --j); //5+4

	}

}
