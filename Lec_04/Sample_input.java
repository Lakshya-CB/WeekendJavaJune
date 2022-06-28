package Lec_04;

import java.util.Scanner;

public class Sample_input {
	public static void main(String[] args) {

		boolean isPositive = true;
		int sum = 0;
		int n;
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			sum = sum + sc.nextInt();
			if (sum < 0) {
				isPositive = false;
				break;
			}
			if (isPositive == true) {
				System.out.println(sum);
			}
		}
	}
}