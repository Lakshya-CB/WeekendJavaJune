package Lec_06;

public class Pat_02 {
	public static void main(String[] args) {
		int n = 11;
		int row = 1;
		int cnt_st = n;
		while (row <= n) {
			int star = 0;
			while (star < cnt_st) {
//			if(row==1||row==n||star==0||star==n-1) {
				if (row == star + 1||row+star==n) {

					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				star++;
			}

			row++;
			System.out.println();
		}
	}
}
