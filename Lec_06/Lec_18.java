package Lec_06;

public class Lec_18 {
	public static void main(String[] args) {
		int n = 7;
		int row = 1;
		int cnt_sp = n / 2;
		int cnt_st = 1;
		while (row <= n) {
			int space = 0;
			while (space < cnt_sp) {
				System.out.print("  ");
				space++;
			}

			int star = 0;
			while (star < cnt_st) {
				if (star == 0 || cnt_st - 1 == star) {
					System.out.print("* ");
				} else {
					System.out.print("  ");

				}
				star++;
			}
			if (row < 4) {
				cnt_st = cnt_st + 2;
				cnt_sp = cnt_sp - 1;
			} else {
				cnt_st = cnt_st - 2;
				cnt_sp = cnt_sp + 1;
			}
			row++;
			System.out.println();
		}
	}
}
