package Srinivas_class;

public class ArraySingle_ForEachLoop {

	public static void main(String[] args) {

		String[] empname = new String[10];
		
		empname[0] = "Noman";
		empname[1] = "Riyadh";
		empname[2] = "Fatema";
		empname[3] = "Akther";
		empname[4] = "Rumi";
		empname[5] = "Shamim";
		empname[6] = "Hossain";
		empname[7] = "Imam";
		empname[8] = "Masud";
		empname[9] = "Rana";
		try {
		empname[10] = "Sumi"; //? why is tell me wrong
		}catch(Exception e) {
			System.out.println("Hey you are doing wrong iteration");
		}
		
		for(int i=0; i<empname.length; i++) {
			System.out.println(empname[i] + ", ");
			
		}
		
		System.out.println("------------ Print using for each loop ............");
		for(String name : empname) {
			System.out.println(name + ", ");
		}
		
		System.out.println("------------ Print using for each loop ............");
		String[] studentname = {"Noman", "Hasan", "Zaman", "Monir"};
		for(String name1 : studentname) {
			System.out.println(name1);
		}
		
		System.out.println("------------ Print using for each loop ............");
		int[] number = {4, 5, 2, 6, 8, 21, 45, 52};
		for(int rollnumber : number) {
			System.out.print(rollnumber + ", ");
		}
		

	}

}
