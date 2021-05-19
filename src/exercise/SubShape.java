package exercise;

public class SubShape extends SuperShape {
	
	@Override
	public void Father() {
		System.out.println("Hi i am S.car");
	}

	public static void main(String[] args) {
		SubShape obj = new SubShape();
		obj.Father();
		obj.person();
	}

}
