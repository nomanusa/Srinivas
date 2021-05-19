package OPPs_Class;

public class MethodsDemo {
	
	public float radius = 9.66f;
	public int length = 7;
	public int width = 9;
	
	public void areaOfCircle() {
		double a = Math.PI * radius * radius;
		System.out.println("Area of circle : " + a);
	}
	
	public void areaOfSquare(int side) {
		int a = side * side;
		System.out.println("area of Square : " + a);
	}
	
	public int areaOfRectangle() {
		int a = length * width;
		return a;
	}
	
	public float areaOfTraingle(float s1, float s2) {  //Access Modifiear
		float a = (s1 + s2) / 2;
		return a;
	}

	public static void main(String[] args) {
		
		MethodsDemo obj = new MethodsDemo();
		obj.areaOfCircle();
//		int a = 21;
//		obj.areaOfSquare(a);
//		or 
		obj.areaOfSquare(21);
		int ar = obj.areaOfRectangle();
		System.out.println("Area of Rectangle : " + ar);
		float at = obj.areaOfTraingle(53.26f, 63.25f);
		System.out.println("Area of Traingle : " + at);

	}

}
