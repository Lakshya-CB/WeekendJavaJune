package Lec_04;

import java.util.Scanner;

public class Replace_em {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long num = scn.nextLong();
		long mult = 1;
		long ans = 0;
		if (num == 0) {
			ans = 5;
		}
		while (num > 0) {
			int digit = (int) (num % 10);
			if (digit == 0)
				digit = 5;
			System.out.println(digit);
			ans = ans + digit * mult;
			mult = mult * 10;
			num = num / 10;
		}
		System.out.println(ans);
	}
}