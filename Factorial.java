package firstclass;

public class Factorial {
	
	/*
	 * I Learn Below Points in this Program 
	 * 1. I understood how to use the "For Loop" with the given Range.
	 * 2. Understood how we can multiply within the loop with the iterator variable.
	 */

	public static void main(String[] args) {

		int fact = 1;
		int input = 5;

		for (int i = 1; i <= input; i++) {

			fact = fact * i;
		}
		System.out.println("Factorial Number is : " + fact);

	}

}
