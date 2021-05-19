package abstractandInheritance;

public class ImplementDemo extends ChildStudent implements Paypall {

	
	@Override
	public void visa() {
		System.out.println("I am visa");
		
	}

	@Override
	public void masterCard() {
		System.out.println("Hi I am master Card");
		
	}
	public static void main(String[] args) {
		ImplementDemo obj = new ImplementDemo();
		obj.masterCard();
		obj.schoolTeacher();
		obj.schoolTeacher1();
		obj.student1();
		obj.visa();
		schoolTeacher2();
		
		
	}

}
