package exerciseInharitance;

public class MyshapeSuper {
	
	int side1;
	int length;
	int width;
	
	
	protected void areaOfSqure(int a) {
		side1 = a;
		double squre = Math.pow(a, 2);
		System.out.println("Area of Squre : " + squre);
	}
	
	public long areaOfRactangle(int b, int c) {
		length = b;
		width = c;
		int rac = (2 * (b + c));
		return rac;
	}
	

	public static void main(String[] args) {
		
		MyshapeSuper obj = new MyshapeSuper();
		obj.areaOfSqure(20);
		System.out.println("Area of Ractangle : " + obj.areaOfRactangle(7, 10));

	}

}
