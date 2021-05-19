package Srinivas_class.loop;

public class DoWhileAverage {

	public static void main(String[] args) {
		float res=0.0f;
		int i = 1;
		int sum = 0;
		do {
			sum = sum + i;
			i++;
		}while (i<=50);
		System.out.println(i);
		
		res = (float)sum/(i-1);
		// res = (float)sum/50(number)
		System.out.println("Sum : " + sum);
		System.out.println("Average : " + res);
	}

}
