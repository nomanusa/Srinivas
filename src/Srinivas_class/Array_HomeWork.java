package Srinivas_class;

public class Array_HomeWork {

	public static void main(String[] args) {
		
		int[][] stu = new int[4][4]; //elements 4*4 =16
		
		stu[0][0] = 11;
		stu[0][1] = 12;
		stu[0][2] = 13;
		stu[0][3] = 14;
			
		stu[1][0] = 21;
		stu[1][1] = 22;
		stu[1][2] = 23;
		stu[1][3] = 24;
				
		stu[2][0] = 31;
		stu[2][1] = 32;
		stu[2][2] = 33;
		stu[2][3] = 34;
			
		stu[3][0] = 41;
		stu[3][1] = 42;
		stu[3][2] = 43;
		stu[3][3] = 44;
				
		for (int row = 0; row<stu.length; row++) {
			for(int col=0; col<stu[row].length; col++) {
				System.out.print(stu[row][col] + "\t\t");
			}
						
			System.out.println();
		}

	}

}
