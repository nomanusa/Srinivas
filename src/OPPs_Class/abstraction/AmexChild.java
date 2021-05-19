package OPPs_Class.abstraction;

public class AmexChild extends ParentAbstraction {

	

	@Override
	public String confirmPayment() {
		System.out.println("Checking user detiels");
		System.out.println(cardno);
		System.out.println(custname);
		return "Not enough balance";
	}

	@Override
	public boolean reduceAmount() {
		System.out.println("Deduct amount from user account");
		System.out.println("Add amount to trade account");
		return false;
	}
	
	public static void main(String[] args) {
		AmexChild obj = new AmexChild();
		obj.collectCardDetails();
		System.out.println(obj.confirmPayment());
		System.out.println(obj.reduceAmount());

	}

}
