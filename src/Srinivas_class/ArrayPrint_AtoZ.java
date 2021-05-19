package Srinivas_class;

public class ArrayPrint_AtoZ {

	public static void main(String[] args) {
		
//		char[] alphabets;
//		alphabets = new char[26];
//		
//		alphabets[0] ='A';
//		alphabets[1] ='B';
//		alphabets[2] ='C';
//		alphabets[3] ='D';
//		
//		char alphabets[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L'};
//		System.out.println("Alphabets :"+ alphabets); //? why not it's working?
//		System.out.println(alphabet);
		
		
		String Chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] alphabets = Chars.toCharArray(); //this is convert to String
		System.out.println(alphabets.length);
		
		for(int i = 0; i<alphabets.length; i++) {
			System.out.print(alphabets[i]+" ");
		}
		System.out.println();
		//or For each loop
		for(char myChar : alphabets) {
			System.out.print(myChar + " ");
		}
		System.out.println();
		//Update any character
		alphabets[3] ='!';
		for(char myChar : alphabets) {
			System.out.print(myChar + " ");
		}
		
	}

}
