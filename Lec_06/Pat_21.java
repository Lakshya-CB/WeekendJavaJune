package Lec_06;

public class Pat_21 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int cnt_st = 1;
		int cnt_sp = 2 * n - 3;
		while (row <= n) {
			int star1 = 0;
			while (star1 < cnt_st) {
				System.out.print("* ");
				star1++;
			}

			int space = 0;
			while (space < cnt_sp) {
				System.out.print("  ");
				space++;
			}

			int star2 = 0;
			if(row==n) {
				star2=1;
			}
			while (star2 < cnt_st) {
				System.out.print("* ");
				star2++;
			}
			cnt_st++;
			cnt_sp = cnt_sp - 2;
			row++;
			System.out.println();
		}
	}
}
