package Srinivas_class;

import java.util.Scanner;

public class If_nested {

	public static void main(String[] args) {
//		String name = "Noamn Siddiki";
//		int age =28;

//		String country = "US";
//		System.out.println(name);
////		System.out.println("...............");
		
		
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Please Enter Your Age");
		int age = obj1.nextInt();
				
		Scanner obj2 = new Scanner(System.in);
		System.out.println("Please Enter Your Country");
		String country = obj2.nextLine();
		
		
		if(age >= 18) {
			System.out.println("The person can pertially can Vote");
			if(country.equals("US")) {
				System.out.println("The person can fully vote");
			}else {
				System.out.println("The person is not citizen of US");
			}
		}else {
			System.out.println("The person can't vote");
		}
		

	}

}
