package Lec_12;

import java.util.Scanner;

public class String_Qs {
	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
//		String str = scn.next();
//		System.out.println(isPlain(str));
//		PalinSubString("nitin");
		PalinSubString2("nittin");
	}

	public static boolean isPlain(String str) {
		int s = 0;
		int e = str.length() - 1;
		while (s < e) {
			if (str.charAt(s) != str.charAt(e)) {
				return false;
			}
			s++;
			e--;
		}
		return true;

	}

	public static void PalinSubString(String str) {
		for (int s = 0; s < str.length(); s++) {
			for (int e = s + 1; e <= str.length(); e++) {
				String part = str.substring(s, e);
				if (isPlain(part)) {
					System.out.println(str.substring(s, e));
				}
			}
		}
	}

	public static void PalinSubString2(String str) {
		for (int c = 0; c < str.length(); c++) {
			for (int r = 0; c - r >= 0 && c + r < str.length(); r++) {
				int L_idx = c - r;
				int R_idx = c + r;
				if (str.charAt(R_idx) == str.charAt(L_idx)) {
					System.out.println(str.substring(L_idx, R_idx + 1));
				} else {
					break;
				}
			}
		}
		for (double c = 0.5; c < str.length(); c++) {
			for (double r = 0.5; c - r >= 0 && c + r < str.length(); r++) {
				int L_idx = (int)(c - r);
				int R_idx = (int)(c + r);
				if (str.charAt(R_idx) == str.charAt(L_idx)) {
					System.out.println(str.substring(L_idx, R_idx + 1));
				} else {
					break;
				}
			}
		}
	}
}
