package Lec_06;

public class pat_1 {
	public static void main(String[] args) {
		int n = 5;
		int cnt_st = n;
		int row = 1;
		while (row <= n) {
// Step 2!! print *
			int star = 0;
			while (star < cnt_st) {
				System.out.print("* ");
				star++;
			}
			System.out.println();
			row++;
		}
	}
}
