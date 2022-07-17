package Lec_08;

import java.util.Scanner;

public class array_input {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]= scn.nextInt();
		}
		
		for(int ali: arr) {
			System.out.print(ali+" ");
		}
		System.out.println();

	}
}
