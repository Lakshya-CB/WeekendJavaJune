package Lec_05;

public class Rotation_2 {
	public static void main(String[] args) {
		int num = 12345;
		int rot = 3;

		int copy = num;
		int nod = 0;
		while (num > 0) {
			num = num / 10;
			nod++;
		}
		rot = rot % nod;
//	System.out.println(nod);
		num = copy;
		int den = (int)Math.pow(10, rot);
		int P1 = num/den;//12
		int P2 = num%den;//345
		int mult = (int)Math.pow(10, nod-rot);//100
		System.out.println(P2*mult+P1);

	}
}
