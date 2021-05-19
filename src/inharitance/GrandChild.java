package inharitance;

public class GrandChild extends Child1 {
	
	String name = "Hossain";
	
	public void gcName() {
		System.out.print(name);
		
	}

	public static void main(String[] args) {
		GrandChild obj = new GrandChild();
		obj.child1Name();
	//	System.out.print("\t\t");
		obj.gcName();
	//	System.out.print("\t\t");
		obj.fatherName();

	}

}
