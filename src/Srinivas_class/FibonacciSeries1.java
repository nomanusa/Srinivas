package Srinivas_class;

public class FibonacciSeries1 {

	public static void main(String[] args) {
		// 1, 1, 2, 3, 5, 8(), 13()
		// cur=p1+p2
		// p2=p1
		// cur=p1
		
		int p2=0;
		int p1=1;
		
		int cur = 0;
		
		System.out.print(p2 + "," + p1 + ",");
		
		for(int i=1; i<20; i++) {
			cur = p1+p2;
			p2=p1;
			p1=cur;
			
			System.out.print(cur + ",");
		}
		
	}

}
