package Srinivas_class.loop;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int i;
		System.out.println("Enter 0 to Exit");
		
		while(true) {
			System.out.println("Enter any integer value :  ");
			i = obj.nextInt();
			if (i==0) {
				System.out.println("Program Exit");
				break;
			}
			
			System.out.println("You Entered : "+i);
		}
		
	}

}
