package Methods;

public class Bank {
	static int currentBalance=1000;
	
	public static void greetCustomer() {
		// if we didn't return any data so we use void as return type
		//method body
		System.out.println("Hello, Welcome to banking application");
		
	}
	public void deposit(int amount) {
	//It is non static method and we are using parameter
		currentBalance= currentBalance + amount;
		System.out.println("Amount is deposited successfully");
	}
	public static void withdrawal(int amount) {
		currentBalance= currentBalance - amount;
		System.out.println("Amount is withdrawn successfully");
	}
	public int getCurrentBalance() {
		return currentBalance;
		//here we are returning value
		
	}
	public static void main(String[] args) {
		Bank dep =new Bank();
		
		greetCustomer();
		System.out.println("Current Balance is :" +dep.getCurrentBalance());
		
		//we need to call method in main method
		dep.deposit(5000);
		System.out.println("Current Balance is :" +dep.getCurrentBalance());
		dep.withdrawal(1000);
		System.out.println("Current Balance is :" +dep.getCurrentBalance());
	}

}
