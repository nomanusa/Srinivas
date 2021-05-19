package Srinivas_class;

import java.util.Scanner;

public class Switch2_Demo {

	public static void main(String[] args) {
		char alphabet = '0'; //in this case shoutd i put 0?
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Please enter an Alphabet");
		alphabet = obj1.next().charAt(0); //Char is different
		obj1.close();
		
		switch (alphabet) {
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
			System.out.println("This is a vowel");
			break;
			default:
				System.out.println("This is a consonant");
		}

	}

}
