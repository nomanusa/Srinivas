package Srinivas_class;

import OPPs_Class.AccessModifiersDemo;

public class AM3 {

	public static void main(String[] args) {
		AccessModifiersDemo obj = new AccessModifiersDemo();
		
		obj.printP();     // public method
//		obj.printPr();    // can't access bcz private method
//		obj.printname();  // can't access bcz package private/ non access modifier
		
		System.out.println(obj.p); 		// public method
//		System.out.println(obj.pr); 	// can't access bcz private method
//		System.out.println(obj.name); 	// can't access bcz package private/ non access modifier


	}

}
