package usingSuperAndThis;

public class ShapeParent {
	
	public int length;
	public int width;
	public float radius;
	
	public void areaOfRectangle(int length, int width) {
		this.length = length;
		this.width = width;
		int area = length * width;
		System.out.println("Area Of Rectangle : " + area);
	}
	
	public void areaOfCircle(float radius) {
		this.radius = radius;
		double circle = Math.PI * Math.pow(radius, 2);
		System.out.println("Area of Circle : " + circle);
	}
	
	public ShapeParent(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	
	

	public static void main(String[] args) {
		ShapeParent obj = new ShapeParent(4, 6);
		obj.areaOfRectangle(4, 6);

	}

}
