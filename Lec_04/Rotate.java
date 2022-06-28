package Lec_04;

public class Rotate {
	public static void main(String[] args) {
		int num = 12345;
		int rot = 4;

		int copy = num;
		int nod = 0;
		while (num > 0) {
			num = num / 10;
			nod++;
		}
		rot = rot % nod;
//		System.out.println(nod);
		num = copy;

		int r = 0;
		while (r < rot) {

			int digit = num % 10;
			int remain = num / 10;

//			System.out.println(digit + " - " + remain);

			int mult = (int) Math.pow(10, nod - 1);
//			System.out.println(remain + digit * mult);
			num = remain + digit * mult;
			System.out.println(num);
			r++;
		}
	}
}
