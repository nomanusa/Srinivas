package Srinivas_class;

import java.util.Scanner;

public class Switch1_Demo {

	public static void main(String[] args) {
		
		String fruit = "mango";  // switch is faster than else if
//		Scanner obj1 = new Scanner(System.in);
//		System.out.println("Please Enter the Fruit Name");
//		fruit = obj1.nextLine();
//		obj1.close();
		
		switch (fruit){
		
		case "apple" :
			System.out.println("yellow/green");
			break;
		case "mango" : 
			System.out.println("Green");
			break;
		case "orange" :
			System.out.println("Orange"); 
			break;
		case "banana" :
			System.out.println("Yellow");
			break;
		case "pineapple" : 
			System.out.println("green-gray");
			break;
		case "lychee" :
			System.out.println("pink-red");
			break;
		case "peach" :
			System.out.println("creamy white-dark red");
			break;
			default :
				System.out.println("Invalid value");
			
		}
		
	}

}
