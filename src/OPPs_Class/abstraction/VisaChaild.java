package OPPs_Class.abstraction;

public class VisaChaild extends ParentAbstraction {

	
	@Override
	public String confirmPayment() {
		System.out.println("Checking user detiels");
		System.out.println(cardno);
		System.out.println(custname);
		return "Payment accepted";
	}
	
	@Override
	public boolean reduceAmount() {
		System.out.println("Deduct amount from user account");
		System.out.println("Add amount to trade account");
		return true;
	}
	
	
	public static void main(String[] args) {
		VisaChaild obj = new VisaChaild();
		obj.collectCardDetails();
		System.out.println(obj.confirmPayment());
		System.out.println(obj.reduceAmount());

	}


	


}
