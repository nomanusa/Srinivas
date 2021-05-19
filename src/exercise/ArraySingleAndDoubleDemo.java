package exercise;

public class ArraySingleAndDoubleDemo {

	public static void main(String[] args) {
		
		char [] stu = new char[10];
		stu [0] = 'a';
		stu [1] = 'b';
		stu [2] = 'c';
		stu [4] = '1'; 
		stu [9] = 'z';
		//System.out.println(stu);
		
		for(char nstu : stu) {
			System.out.println(nstu);
		}
		
		
		char [] stu1 = {'a','b','c','1','z'};
		System.out.println(stu1);
		
		int [][] emp = new int [4][5];
		
		emp [0][0] = 49;
		emp [0][1] = 58;
		emp [0][2] = 68;
		emp [0][3] = 59;
		emp [0][4] = 68;
		
		emp [1][0] = 49;
		emp [1][1] = 58;
		emp [1][2] = 68;
		emp [1][3] = 42;
		emp [1][4] = 58;
		
		emp [2][0] = 42;
		emp [2][1] = 58;
		emp [2][2] = 88;
		emp [2][3] = 49;
		emp [2][4] = 98;
		
		emp [3][0] = 49;
		emp [3][1] = 54;
		emp [3][2] = 68;
		emp [3][3] = 43;
		emp [3][4] = 58;
		
		for(int row = 0; row<emp.length; row++) {
			for(int col = 0; col<emp[row].length; col++) {
				System.out.print(emp[row][col]+"\t");
			}
			System.out.println();
		}
		
		String[] stu2 = {"Noman", "Hasan", "Ali","Mosarrof", "Robi"};
		for(int i=0; i<=stu2.length; i++) {
			System.out.println(stu2[i]);
		}
		
		

	}
	
}
