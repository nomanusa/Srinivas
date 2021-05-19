package Srinivas_class.StringInBuiltMethods;

public class StringsDamo {

	public static void main(String[] args) {
		String name = "  Salah Uddin Ayubi  ";
		String name1 = new String(" salah uddin ayubi "); // bcz String is a class
		System.out.println(name);
		System.out.println(name1);
		
		char [] myson = { 'A', 'Y', 'U', 'B', 'I'};
		System.out.println(myson);
		String convert = new String(myson); // convert char to String
		System.out.println(convert);
		
		System.out.println(name.length()); // length of String
		
		System.out.println("Char at index 12 : " + name.charAt(12));  // find char based on index
		
		System.out.println(name.compareTo(name1));
		
		System.out.println(name + name1);
		
		System.out.println(name.contains("Ayubi"));
		
		System.out.println(name.endsWith(" "));
		
		System.out.println(name.equalsIgnoreCase(name1));
		
		//System.out.println(name.split(" "));
		
		System.out.println(name.isEmpty());
		
		System.out.println(name.toUpperCase());
		
		System.out.println(name.toLowerCase());
		
		String a = "java";
		String b = "Java";
		System.out.println("Equals : " + a.equals(b));
		
		System.out.println("Equals Ignore Case : " + a.equalsIgnoreCase(b));
		
		//System.out.println("Join : " + (String)a.join(b));
		
		System.out.println("Sub String : " + name.substring(7));
		
		System.out.println(name.substring(7, 13));
		
		System.out.println(name.trim()); // Beginning and ending Space remove
		
		String[] nameArray = name.split(" ");
		System.out.println("Split by space : ");
		System.out.println("Size : " + nameArray.length);
		for(String spl : nameArray) {
			System.out.println(spl);
		}
		

		String[] nameArray1 = name.split("Uddin");
		System.out.println("Split by uddin : ");
		System.out.println("Size : " + nameArray1.length);
		for(String spl : nameArray1) {
			System.out.println(spl);
		}
		
		String rep = " Java is a object orrianted program! Java";
		System.out.println("Replace First : " + rep.replaceFirst("Java", "C++"));
		System.out.println("Replace All : " + rep.replace("Java", "Pyton"));
		System.out.println("Replace All : " + rep.replaceAll("J..a", "Pyton"));
		System.out.println("Replace All : " + rep.replaceAll(".s", "are"));

		
		

	}

}
