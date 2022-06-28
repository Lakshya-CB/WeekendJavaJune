package Lec_03;

import java.util.Scanner;

public class Binary_to_decimal {
	public static void main(String[] args) {
		int num = 11111111;
		int mult = 1;
		int ans = 0;

		while (num > 0) {
			int digit = (int) (num % 10);
//			System.out.println(digit);
			ans = ans + digit * mult;
			num = num / 10;
			mult = mult * 2;
		}

		System.out.println(ans);
	}
}