package Srinivas_class;

import java.util.Scanner;

public class if_else_If {
	
	static String name = "SRMS";
	
	public static void if_operator() {
		String name = "";
		int i=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a name");
		System.out.println("Enter a number");
		name = scan.nextLine();
		i = scan.nextInt();
		scan.close();
		
		if(i>=30 && i<40) {
			System.out.println("This student is Pass and D Grade");
		}else if(i>=40 && i<50) {
			System.out.println("This student gets C Grade");
		}else if(i>50 && i<60) {
			System.out.println("This student gets B Grade");
		}else if(i>60 && i<70) {
			System.out.println("This student gets A- Grade");
		}else if(i>70 && i<80) {
			System.out.println("This student gets A Grade");
		} else if(i>80 && i<=100) {
			System.out.println("This student gets A+ Grade");
		}else {
			System.out.println("This student is Fail");
		}
	}

	public static void main(String[] args) {
		System.out.println(name);
		System.out.println("........");
		System.out.println();
		if_operator();
		
	}

}
