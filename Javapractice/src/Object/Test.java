package Object;

public class Test {

	int i=10;
	int j=20;
	public Test() {
		// TODO Auto-generated constructor stub
	}
	
	public Test(int a) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	Test t1=new Test();
	Test t2=new Test(10);
	Test t3=new Test(20);
	System.out.println(t1.hashCode());
	System.out.println(t2.hashCode());
	System.out.println(t3.hashCode());
	}
	
	public int add() {
		
	}

}
