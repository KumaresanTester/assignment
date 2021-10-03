package firstclass;

public class ConvertNegativeToPostiveNumber {
	/*
	 * I Learn Below Points in this Program 
	 * 1. Understood how to convert the Negative word into Positive word.
	 */

	public static void main(String[] args) {
		int number = -40;

		if (number < 0) {

			int converted = number * (-1);

			System.out.println("The " + number + " Converted to Positive Number " + converted);
		}
	}

}
