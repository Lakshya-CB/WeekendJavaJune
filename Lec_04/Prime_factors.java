package Lec_04;

public class Prime_factors {
	public static void main(String[] args) {
		int num = 378;
		int div = 2;
		while (num > 1) {
			if (num % div == 0) {
				System.out.println(div);
				num = num / div;
			} else {
				div++;
			}
		}
	}
}
