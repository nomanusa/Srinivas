package Srinivas_class;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		
		int[][] stu = new int[5][5]; //elements 4*5 =20
		
		stu[0][0] = 85;
		stu[0][1] = 65;
		stu[0][2] = 88;
		stu[0][3] = 74;
		stu[0][4] = 91;
		
		stu[1][0] = 62;
		stu[1][1] = 79;
		stu[1][2] = 82;
		stu[1][3] = 48;
		stu[1][4] = 72;
		
		stu[2][0] = 64;
		stu[2][1] = 65;
		stu[2][2] = 84;
		stu[2][3] = 64;
		stu[2][4] = 97;
		
		stu[3][0] = 86;
		stu[3][1] = 72;
		stu[3][2] = 81;
		stu[3][3] = 87;
		stu[3][4] = 52;
		
		stu[4][0] = 85;
		stu[4][1] = 71;
		stu[4][2] = 85;
		stu[4][3] = 85;
		stu[4][4] = 59;
		
		
		
				
		for (int row = 0; row<stu.length; row++) {
			for(int col=0; col<stu[row].length; col++) {
				System.out.print(stu[row][col] + "\t\t");
			}
			System.out.println();
		}
		
		System.out.println("..........................For each loop.............................");
		
		for(int[] tempArray : stu ) {
			for(int element : tempArray) {
				System.out.print(element + "\t\t");
			}
			System.out.println();
		}
		
		
		System.out.println("................. For each Loop ...............");
		String[][] emp = { 	{ "A01", "Noman",  "PA"},
				
						 	{ "A02", "Hasan",  "BA"},
						 	{ "A03", "Shamim", "NY"},
						 	{ "A04", "kamal",  "CA"},
						 	{ "A05", "Jamal",  "NY"}
						 };
				for(String[] tempArray : emp ) {
					for(String element : tempArray) {
						System.out.print(element + "\t\t");
					}
					System.out.println();
				}

		}

}
