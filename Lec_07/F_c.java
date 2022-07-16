package Lec_07;

public class F_c {
	public static void main(String[] args) {
		int min_f = 0;
		int max_f = 100;
		int step = 20;
		for (int F = min_f; F <= max_f; F = F + step) {
			int C = 5 * (F - 32)/9;
			System.out.println(F + "  " + C);
		}
	}
}
