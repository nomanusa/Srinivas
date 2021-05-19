package OPPs_Class;

public class AccessModifiersDemo {
	
	public int p = 78; // public
	private float pr = 70.58f; // private
	String name = "Noman"; //Non-Access Modifier or packege private 
	
	public void printP() {
		System.out.println(p);
		System.out.println(pr);
		System.out.println(name);
		}
	
	private void printPr() {
		System.out.println(pr);
	}
	
	void printname() {
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		
		AccessModifiersDemo obj = new AccessModifiersDemo();
		obj.printP();
		obj.printPr();
		obj.printname();
		
		System.out.println(obj.p);
		System.out.println(obj.pr);
		System.out.println(obj.name);

	}

}
