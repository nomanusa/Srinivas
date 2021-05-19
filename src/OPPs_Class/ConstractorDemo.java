package OPPs_Class;

public class ConstractorDemo {
	
	int width;
	int length;
	float radius;
	
//	public ConstractorDemo() {
//		System.out.println("Hey i am constractor");
//	}
	
	public ConstractorDemo(int e, int f, float g) {
		width = e;
		length = f;
		radius = g;
	}
	
	public void areaOfSqure() {
		int area1 = length * length;
		System.out.println("Squre : " + area1);
	}
	
	public void areaOfRectangle() {
		int area2 = 2 * (length + width); // length * width
		System.out.println("Area of Rectangle : " + area2);
	}
	
//	public void areaOfTriangle() {
//		int area2 = 2 * (length + width);
//		System.out.println("Area of Rectangle : " + area2);
//	}
	
	public void areaOfCircle() {
		double area3 = 2 * Math.PI * radius;
		System.out.println("Area of cirle : " + area3);
	}
	


	public static void main(String[] args) {
		
		ConstractorDemo obj = new ConstractorDemo(89, 85, 92.54f);
		System.out.println(obj.width);
		System.out.println(obj.length);
		System.out.println(obj.radius);
		System.out.println("..............................");
		
		ConstractorDemo obj1 = new ConstractorDemo(78, 76, 95.64f);
		System.out.println(obj1.width);
		System.out.println(obj1.length);
		System.out.println(obj1.radius);
		
		obj.areaOfSqure();
		obj.areaOfRectangle();
		obj.areaOfCircle();
		
	}

}
