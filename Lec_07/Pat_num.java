package Lec_07;

public class Pat_num {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int cnt_sp = n-1;
		int cnt_st = 1;
		int num =1;
		while (row <= n) {
			
			int space = 0;
			while (space < cnt_sp) {
				System.out.print("\t");
				space++;
			}
			int star = 0;
			while (star < cnt_st) {
				System.out.print(num+"\t");
				star++;
				num++;
			}
			cnt_sp--;
			cnt_st = cnt_st+2;
			row++;
//			num++;
			System.out.println();
		}
	}
}
