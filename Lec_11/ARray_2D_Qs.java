package Lec_11;

public class ARray_2D_Qs {
	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14 }, 
						{ 21, 22, 23, 24 }, 
						{ 31, 32, 33, 34 }, 
						{ 41, 42, 43, 44 } };
		wave(arr);
			}
	public static void wave(int[][] mat) {
		for(int c =0;c<mat[0].length;c++) {
			for(int r=0;r<mat.length;r++) {
				int rtp = r;
				if(c%2!=0) {
					rtp = mat[0].length -1 - r;
				}
				System.out.print(mat[rtp][c]+ " ");
			}
		}
	}
}
