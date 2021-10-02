package firstclass;

public class PrimeNumber {

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
