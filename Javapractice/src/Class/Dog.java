package Class;

public class Dog
{
/* public is access modifier (Is the visibility)
 * by default we use public
 * class
 * First is class name
 */

	//creating variable (to store information)
	public String breed="German shepard";
	public int height=30;
	public int weight=35;
	

	public static void main(String[] args){
//	with out main method there will be no execution
		System.out.println("Test");
		
		//to use variables we need to create obj
		Dog d1=new Dog();
		/*Dog-Classname
		 * Dog()-Constructor both should be same
		 * new-keyword
		 * variable name-d1
		 */
		System.out.println(d1.breed);		
		

	}

}
