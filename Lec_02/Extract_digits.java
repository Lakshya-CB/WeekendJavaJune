package Lec_02;

public class Extract_digits {
	public static void main(String[] args) {
		int num = 54321;
		while (num > 0) {

			num = num / 10;
			int digit = num % 10;
			System.out.println(digit);

		}
	}
}
