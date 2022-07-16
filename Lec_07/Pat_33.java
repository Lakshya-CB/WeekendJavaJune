package Lec_07;

public class Pat_33 {

	public static void main(String[] args) {
		int n = 7;
		int row = 1;
		int cnt_sp = n - 1;
		int cnt_st = 1;
		int num = 1;
		int row_num = n;
		while (row <= n) {
			num = row_num;
			int space = 0;
			while (space < cnt_sp) {
				System.out.print("  ");
				space++;
			}
			int star = 0;
			while (star < cnt_st) {
				if (num == n) {
					System.out.print("0 ");
				} else {
					System.out.print(num + " ");
				}
				if (star < cnt_st / 2) {
					num++;
				} else {
					num--;
				}
				star++;

			}
			row_num--;
			cnt_sp--;
			cnt_st = cnt_st + 2;
			row++;
			System.out.println();
		}
	}
}
