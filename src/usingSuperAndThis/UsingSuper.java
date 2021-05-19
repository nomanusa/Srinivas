package usingSuperAndThis;

public class UsingSuper extends ShapeParent {
	public int length;
	public int width;
//	or
//	public int length, width;
	
	public float radius;
	
	@Override
	public void areaOfRectangle(int length, int width) {
		super.length = length;
		super.width = width;
		int area = length * width;
		System.out.println("Area Of Rectangle : " + area);
		}
	public UsingSuper(int length, int width, float radius) {
		super(length, width);
		this.radius = radius;
	}
	
	
	
	

	public static void main(String[] args) {
		UsingSuper obj = new UsingSuper(8, 7, 9.85f);
		obj.areaOfRectangle(10, 15);
		

	}

}
