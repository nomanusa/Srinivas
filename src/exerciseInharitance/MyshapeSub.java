package exerciseInharitance;

public class MyshapeSub extends MyshapeSuper {
	
	float radius;
	
	public void areaOfCircle(float a) {
		radius = a;
		double circle = Math.PI * Math.pow(a, 2);
		System.out.println("Area Of Circle : " + circle);
	}

	public static void main(String[] args) {
		
		MyshapeSub obj = new MyshapeSub();
		System.out.println("Area Of Ractangle : " + obj.areaOfRactangle(3, 5));
		obj.areaOfCircle(5);
		obj.areaOfSqure(5);
		
		

	}

}
