package OPPs_Class.abstraction;

public abstract class ParentAbstraction { // Final class can't be parent class
	
	String cardno;
	String custname;
	
	public final void getCardDetails() {  //Final methods can't override in Child
		System.out.println("User Card Details");
	}
	
	public abstract String confirmPayment();
	public abstract boolean reduceAmount();
	
	public void collectCardDetails() {
		cardno = "3251 4587 5894 4975";
		custname = "Noman Siddiki";
	}

}
