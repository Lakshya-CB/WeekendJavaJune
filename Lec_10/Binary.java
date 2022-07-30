package Lec_10;

import java.util.Scanner;

public class Binary {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int c = scn.nextInt();
		while (c > 0) {
			c--;
			long bin = scn.nextLong();
//			System.out.println(bin + "=-=-=-");
			System.out.println(Con);
		}
	}

	public static int conbert(long bin) {
		int mult = 1;
		int ans =0;
		while (bin>0) {
			int digit = (int)bin % 10;
			bin = bin / 10;
			ans = ans +mult*digit;
			mult = mult*2;
		}
		return ans;
	}
}
