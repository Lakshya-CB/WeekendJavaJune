package Lec_06;

import java.util.Scanner;

public class Inc_DEc {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		boolean dec = true;
		boolean ans = true;
		int prev = Integer.MAX_VALUE;
		while(N>0) {
			int curr = scn.nextInt();
			if(dec==true && prev< curr ) {
				dec = false;
			}
			if(dec==false && curr<prev) {
//				increasing!! curr< prev!!
//				System.out.println("false");
				ans = false;
				break;
			}
			prev= curr;
			N--;
		}
		System.out.println(ans);
	}
}
