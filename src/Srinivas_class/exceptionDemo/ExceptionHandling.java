package Srinivas_class.exceptionDemo;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
		String sv = "4848.648";
		int iv = Integer.valueOf(sv); // Syntextically it is crrect. Logically it's wrong. bcz it is float value.
		System.out.println(iv);
		}catch(Exception e) {
			System.out.println("Caugth an exception");
		}
		
		System.out.println("---------- Another --------");
		
		int [] i = {45, 65, 84, 59}; //Array
		
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		try {
		System.out.println(i[4]); //Exception
		}catch(Exception e) {
			System.out.println("Caught an exception");
		}
		System.out.println(i[3]);
		
		System.out.println("---------- Another --------");

		try {
			Thread.sleep(3000);
			System.out.println(i[4]);
		} catch (Exception e) {
			System.out.println("Caught an exception");
			e.printStackTrace(); // To print what kind of exception
		
		}
		
	}

}
