package inharitance;

public class Child1 extends Father {
	
	String name1 = "Kamal";
	
	public void child1Name() {
		
		System.out.print(name1);
	}
	
	public static void main(String[] args) {
		
		Child1 obj = new Child1();
		
		obj.child1Name();
		obj.fatherName();
	}

}
