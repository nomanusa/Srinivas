package exercise;

public class ObjectConcept {
	String name = "Noman";
	static char section = 'A';
	
	public static void students() {
		System.out.println(section);
		}
	
	public void group(float a, int b, int c) {
		System.out.println(name);
		}
	
	public void group(int a, float b, int c) {
		System.out.println(name);
		}
	
	public void group(int a, float b) {
		System.out.println(name);
		}
	

	public static void main(String[] args) {
		students();
		
		ObjectConcept obj = new ObjectConcept();
		obj.group(56, 58.68f);

	}

}
