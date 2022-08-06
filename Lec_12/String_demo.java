package Lec_12;

import java.util.Scanner;

public class String_demo {
	public static void main(String[] args) {
		String jokar = "HelLLO~";
		System.out.println(jokar.length());
		System.out.println(jokar.charAt(jokar.length()-1));
		
		System.out.println(jokar.indexOf("LL"));
		System.out.println(jokar.lastIndexOf("%"));
		
		System.out.println(jokar.startsWith("HEL"));
		System.out.println(jokar.endsWith("HEL"));
		
		String str = "abcd";
		for(int s=0;s<str.length();s++) {
			for(int e = s+1;e<=str.length();e++) {
				System.out.println(str.substring(s, e));
			}
		}
		Scanner scn = new Scanner(System.in);
		String ll = scn.next();
		System.out.println(ll);
		
	}

}
