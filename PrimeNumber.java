package firstclass;

public class PrimeNumber {

	/*
	 * I Learn Below Points in this Program 
	 * 1. Little bit confused in this program then understood how to use the "For Loop".
	 * 2. Understood we can iterate till half the input or we can use the full input to iterate.
	 * 3. Got some idea about why we are using boolean data type and used that into if Condition.
	 * 4. Learn about break keyword how it used.
	 */
	
	public static void main(String[] args) {
		int input = 13;
		boolean flag = false;
		int halfInput = input / 2;

		for (int i = 2; i <= halfInput; i++) {

			if (input % i == 0) {

				flag = true;
				break;

			}

		}

		if (flag == false) {
			System.out.println(input + " is a Prime Number");
		} else
			System.out.println(input + " is Not a Prime Number");
	}

}
