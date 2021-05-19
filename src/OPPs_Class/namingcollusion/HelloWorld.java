package OPPs_Class.namingcollusion;

import java.util.Scanner;
//import java.util.*; ( "*" means all Scanner related inbuilt classes)
import static java.lang.Math.PI;
//import static java.lang.Math.*; ("*" means all math related inbuilt classes)

public class HelloWorld {
	
	public void nCollusion() {
		System.out.println("This is same class");
	}
	
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("I am a Scanner");
		
		System.out.println(Math.PI);
		System.out.println(PI); // (Because I import Math class)
		System.out.println(Math.sqrt(9));
		//System.out.println(sqrt(9)); (Its making error bcz i did not import all(*))
		

	}

}
