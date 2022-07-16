package Lec_07;

public class pat_31 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		while (row <= n) {

			int num = n;
			int star = 0;
			while (star < n) {
				if (star + row == n) {
					System.out.print("* ");
				} else {
					System.out.print(num + " ");
				}
				num--;
				star++;
			}

			row++;
			System.out.println();

		}
	}
}
