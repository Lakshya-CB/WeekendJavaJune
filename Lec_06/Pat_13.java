package Lec_06;

public class Pat_13 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;

		int cnt_st = 1;
		while (row <= 2 * n - 1) {
			int star = 0;
			while (star < cnt_st) {
				System.out.print("* ");
				star++;
			}
			if (row < n) {
				cnt_st++;
			} else {
				cnt_st--;
			}
			row++;
			System.out.println();
		}
	}
}
