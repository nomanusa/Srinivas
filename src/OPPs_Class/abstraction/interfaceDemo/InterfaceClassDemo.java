package OPPs_Class.abstraction.interfaceDemo;

public class InterfaceClassDemo implements InterfaceDeme {

	

//	@Override
//	public void paypall() {
//		System.out.println("I am pay pall");
//		
//	}
	
	
	@Override
	public boolean confirmPayment() {
		System.out.println("Payment Comfirm");
		return true;
	}

	@Override
	public boolean reduceAmount() {
		System.out.println("Payment deducted");
		return true;
	}
	


	
	
	public static void main(String[] args) {
		
		InterfaceClassDemo obj = new InterfaceClassDemo();
		//obj.paypall();
		System.out.println(obj.PI_VAL);
		//obj.PI_VAL=3.58f; -> By default it is constant. You can't change value.
		System.out.println(obj.confirmPayment());
		System.out.println(obj.reduceAmount());

	}


}
