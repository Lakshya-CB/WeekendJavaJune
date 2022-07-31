package Lec_11;

public class Array_2D {
	public static void main(String[] args) {
		int[][] mat = new int[3][4];// RxC
		System.out.println(mat);
		
		System.out.println(mat.length); // number of rows
		System.out.println(mat[0].length); // number of cols
//		System.out.println(mat[10000].length);
		int ct =0;
		for(int r =0;r<mat.length;r++) {
			int[] row = mat[r];
//			System.out.println(row);
			for(int c =0;c<row.length;c++) {
//				System.out.print(row[c]+" ");
//				System.out.print(mat[r][c]+" ");
				mat[r][c]=ct;
				ct++;
			}
//			System.out.println();
		}
		System.out.println("==========");
		for(int[]row :mat) {
//			System.out.println(row);
			for(int ali: row) {
				System.out.print(ali+ " ");
			}
			System.out.println();
		}
	}
}
