package Lec_19;

public class PermComb {
	public static void main(String[] args) {
//		Perm(4, 2, "", new boolean[4]);
		Comb(4, 2, -1, "");
	}

	public static void Perm(int total, int Qtp, String path, boolean[] seats) {

		if (Qtp == 0) {
			System.out.println(path);
			return;
		}

		for (int box = 0; box < total; box++) {
			if (seats[box] == false) { // seat is empty!!
				seats[box] = true;// prep!!
				Perm(total, Qtp - 1, path + "Q" + box, seats);
				seats[box] = false;// explicit back tracking!!
				// undo karo prep ko!!
			}
		}
	}

	public static void Comb(int total, int Qtp, int last, String path) {
		if(Qtp==0) {
			System.out.println(path);
			return;
		}
		for(int box = last+1;box<total;box++) {
			Comb(total, Qtp-1, box, path+"Q"+box);
		}
	}
}
