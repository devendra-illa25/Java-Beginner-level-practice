package Array;

public class Single {

	public static void main(String[] args) {
		
//		int a[]=new int[5]; // Single Dimension array
//							declaration of array with 5 Elements
		
		int a[]=new int[7];  //integer array (For each loop)
		// Store elements into array
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		
		//System.out.println(a[3]); //40
		
		
		//Read elements from an array (For loop)
		/*for(int i=0;i<=4 ;i++)
		{
			System.out.println(a[i]);//10,20,30,40,50
		}*/
		
		
	
//		for each loop:  
//			int a[]=new int[7];  //integer array
		for(int i:a)
		{
			System.out.println(i);//10,20,30,40,50,0,0
		}
		
	}

}
