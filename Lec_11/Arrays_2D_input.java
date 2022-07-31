package Lec_11;

import java.util.Scanner;

public class Arrays_2D_input {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int row = sn.nextInt();
		int col = sn.nextInt();
		int[][] mat = new int[row][col];
		for(int r=0;r<mat.length;r++) {
			for(int c=0;c<mat[0].length;c++) {
				mat[r][c] = sn.nextInt();
			}
		}
		for(int[]row1 :mat) {
//			System.out.println(row);
			for(int ali: row1) {
				System.out.print(ali+ " ");
			}
			System.out.println();
		}
	}
}
