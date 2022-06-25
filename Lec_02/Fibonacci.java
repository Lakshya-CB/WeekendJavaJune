package Lec_02;

public class Fibonacci {
	public static void main(String[] args) {
		int n = 4;
		int a = 0;
		int b = 1;

		int i = 0;
//		int c = 0;
		while (i < n) {
			int c = a + b;
//			System.out.println(a);
			a = b;
			b = c;
			i++;
		}
		System.out.println(a);
	}
}
