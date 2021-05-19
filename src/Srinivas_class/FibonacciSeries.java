package Srinivas_class;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;
		
		for (int i=0 ; i<25; i++) {
			System.out.print(a+", ");         //1,1,2,3,5,8,13
		c = a+b;
		a = b;
		b = c;
		}
	}

}
