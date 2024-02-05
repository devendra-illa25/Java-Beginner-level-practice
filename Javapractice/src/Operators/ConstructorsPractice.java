package Operators;

public class ConstructorsPractice {

	public int i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorsPractice cp=new ConstructorsPractice(56);
	 System.out.println(cp.i);	
	}	
	public ConstructorsPractice() {
		i=20;//explicit paramaterless constructor
	}

	public ConstructorsPractice(int a) {
		i=a;
		
	}
	}


