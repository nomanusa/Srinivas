package Srinivas_class.loop;

public class WhileLoopSum {

	public static void main(String[] args) {
		int count = 5;
		int sum = 1;
		while(count < 101) {
			System.out.println(count);
			//sum = sum + count;
			sum+=count;
			count++;
		}
		System.out.println("Sum : " + sum);
	}

}
