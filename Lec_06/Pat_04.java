package Lec_06;

public class Pat_04 {
public static void main(String[] args) {
	int n = 5;
	int row = 1;
	int cnt_sp = n-1;
	int cnt_st = 1;
	while(row<=n) {
//		step2 , _ *
		int space = 0;
		while(space<cnt_sp) {
			System.out.print("  ");
			space++;
		}
		
		int star = 0;
		while(star<cnt_st) {
			System.out.print("* ");
			star++;
		}
		row++;
		System.out.println();
		cnt_st++;
		cnt_sp--;
	}
			
}
}
