package Srinivas_class;

import java.util.Scanner;

public class Switch_Demo {

	public static void main(String[] args) {
		
		int i = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		i = scan.nextInt();
		scan.close();
		
		switch(i) {
		case 1 : 
			System.out.println("One");
			break;
		case 2: 
			System.out.println("Two");
			break;
		case 3: 
			System.out.println("Three");
			break;
		case 4: 
			System.out.println("Four");
			break;
		case 5: 
			System.out.println("Five");
			break;
		default:
			System.out.println("Invalid value");
		}

	}

}
