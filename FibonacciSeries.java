package firstclass;

public class FibonacciSeries {
	
	/*
	 * I Learn Below Points in this Program 
	 * 1. I understood how to use the "For Loop" with the given Range.
	 * 2. Understood how we can initialize the value to already assigned variables.
	 */

	public static void main(String[] args) {

		int firstNum = 0;
		int range = 8;
		int secNum = 1;

		System.out.println(firstNum);

		for (int i = 1; i <= range; i++) {
			int sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
			System.out.println(sum);

		}

	}

}
