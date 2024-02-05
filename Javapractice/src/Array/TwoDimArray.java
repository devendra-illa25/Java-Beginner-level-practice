package Array;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]=new int[5][2];//declaration
//		Storing elements /values into array
		/*a[0][0]=10;
		a[0][1]=20;
		
		a[1][0]=30;
		a[1][1]=40;
		
		a[2][0]=50;
		a[2][1]=60;*/
		
//		Classic for loop
		/*for(int i=0;i<=2;i++) {
			for(int j=0;j<=1;j++) {
				System.out.println(a[i][j]);//10 20 30 40 50 60 
			}
		}*/
		
//		for each loop
		/*for(int i[]:a) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}*/
		Object o[][]={{10,20},{'c','d'},{"Deva","false"},{true,false},{10.25,25.5}};
		
		for(Object i[]:o) {
			for(Object j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
	}

}
}
