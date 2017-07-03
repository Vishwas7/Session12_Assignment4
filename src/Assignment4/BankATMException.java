package Assignment4;

public class BankATMException extends Exception {

	public BankATMException(){
		 // it will call the super constructor of parent class and display the message 
		 super("You can not withdraw the amount || your account balance is below 10000")
			 ;
	 
	 } 
}
