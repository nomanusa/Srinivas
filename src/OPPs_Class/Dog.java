package OPPs_Class;

public class Dog {
	
	int tail = 1;
	int legs = 4;
	String breed;
	int height;
	int length;
	int weight;
	
	public void sleep() {
		System.out.println("zzzzzzzzzzz");
	}
	
	public void bark() {
		System.out.println(".....bow...bow....bow....");
	}
	

	public static void main(String[] args) {
		
		Dog d1=new Dog();
		
		d1.breed = "Dman";
		d1.height = 9;
		d1.length =39;
		d1.weight = 40;
		System.out.println(d1.breed);
		System.out.println(d1.height);
		System.out.println(d1.length);
		System.out.println(d1.weight);
		d1.sleep();
		d1.bark();
		System.out.println();
		
		Dog d2=new Dog();
		d2.breed = "Fug";
		d2.height = 5;
		d2.length =25;
		d2.weight = 30;
		System.out.println(d2.breed);
		System.out.println(d2.height);
		System.out.println(d2.length);
		System.out.println(d2.weight);
		d2.sleep();
		d2.bark();
		

	}

}
