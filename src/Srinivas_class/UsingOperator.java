package Srinivas_class;

import java.util.Scanner;

public class UsingOperator {
	
	
	
	public static void main(String[] args) { // () Prances
		byte n1 = 45;
		byte n2 = 30;
		short res = (short) (n1+n2); // Type casting 
		System.out.println("res : " + res);
		
		
		int a = 5;
		int b = 10;
		int c = 15;
		double d;
		d = (a + (b+c)*(a+c));
		System.out.println("D : " + d); 
		
		// (a+b)^2 = a^2+2ab+b^2
		
		double e = 0;
		e = Math.pow(a, 2) + (2*a*b) + Math.pow(b, 2);
		System.out.println("E : " + e);
		
		//a^5 + b^3
		
		d = Math.pow(a, 5) + Math.pow(b, 3);
		System.out.println("b : " + b);
		
//		float radius = 5.36f;
//		double areaOfCircle = Math.PI * Math.pow(radius, 2);
//		System.out.println("area of circle : " + areaOfCircle);
		
		float radius;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Radius amount : ");
		radius = scan.nextFloat();
		scan.close();
		
		double areaOfCircle = Math.PI * Math.pow(radius, 2);
		System.out.println("area of circle : " + areaOfCircle);

	}

}
