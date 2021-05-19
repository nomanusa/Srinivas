package Srinivas_class.StringInBuiltMethods;


public class WrapperOrConvertDemo {


	public static void main(String[] args) {
		byte b = 9;
		int i = 4855;
		
		i = b; // it is possible. i want to convert smaller value to bigger value
		System.out.println(i);
		//		b = i; // it is not possible. i want to convert bigger value to smaller value
		b = (byte) i; // It is possible by Type Casting. But it's not give real value. {(byte) i;} This is called type casting.
		
		System.out.println(b);
		
		/* 
		* Warpper class : Integer, Byte, Double(Means first letter will be capital letter). 
		*Those are object too.
		*/
		String ival = "97899";
		int iv = Integer.valueOf(ival);  
		System.out.println("String to int : " + iv);
		
		String fval = "54485.56454f";
		Float fv = Float.valueOf(fval);
		System.out.println("String to float : " + fv);
		
		int in = 5877;
		String st = String.valueOf(in);
		System.out.println("int to String : " + st);
		
		double d = 15488.15548d;
		String stri = String.valueOf(d);
		System.out.println("double to String : " + stri);
		//or
		String stri1 = Double.toString(d);
		System.out.println("double to String : " + stri1);
		
		int x = 5;
		Integer x1 = 4;
		
		x1 = x; // Auto boxing (int -> Integer)
		x = x1; // Unboxing (Integer -> int)
		
					
//		String j = "a";
//		char c = Character.valueOf(j);
//		System.out.println(c);
		
		char k = 'n';
		String s = String.valueOf(k);
		System.out.println(s);
		
	}

}
