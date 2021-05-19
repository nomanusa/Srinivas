package inharitance;

public class Test {

	public static void main(String[] args) {
		
		Father obj1 = new Father();
		obj1.fatherName();
		System.out.println("..................");
		Child1 obj2 =new Child1();
		obj2.fatherName();
		obj2.child1Name();
		System.out.println("..................");
		Child2 obj3 = new Child2();
		obj3.fatherName();
		obj3.Child2Name();

	}

}
