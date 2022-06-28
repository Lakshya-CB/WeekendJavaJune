package Lec_03;

public class GCD {
	public static void main(String[] args) {
		int a = 265332;
		int b = 99968;

		int devisor = a;
		int dividend = b;
		while (devisor > 0) {
			int remainder = dividend % devisor;
			dividend = devisor;
			devisor = remainder;
		}
		System.out.println(dividend);

	}
}
