package abstractandInheritance;

public abstract class Teacher {
	
	public int a = 10;
	public float f =20.50f;
	
	public void schoolTeacher() {
		System.out.println("Hi i am a School Teacher");
	}
	
	public abstract void schoolTeacher1();
	
	public static void schoolTeacher2() {
		System.out.println("Hi I am school teacher 2");
	}
	
}
