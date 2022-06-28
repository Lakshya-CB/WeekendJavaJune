package Lec_04;

import java.util.Scanner;

public class char_input {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char ch = scn.next().charAt(0);
//		System.out.println(ch);
		if(ch>='a' && ch<='z') {
			System.out.println("lower");
		}else if(ch>='A'&& ch<='Z') {
			System.out.println("Upper");
		}
	}
}
