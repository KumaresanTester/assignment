package firstclass;

public class PositiveOrNegativeNumberCheck {
	
	/*
	 * I Learn Below Points in this Program 
	 * 1. Understood the concept of If condition. By using if condition how 
	 * we can check the Positive nor Negative number.
	 */

	public static void main(String[] args) {
		int num = 0;

		if (num < 0) {
			System.out.println(num + " is a Negative Number");

		} else if (num > 0) {
			System.out.println(num + " is a Positive Number");

		} else {
			System.out.println(num + " is neither Positive nor Negative");
		}
	}

}
