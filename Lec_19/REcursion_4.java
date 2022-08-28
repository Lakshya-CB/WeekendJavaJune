package Lec_19;

public class REcursion_4 {
	public static void main(String[] args) {
//		maze(0, 0, "", 2, 2);
		Partitioning("nitin", "");
	}

	public static void maze(int r, int c, String path, int destR, int destC) {
		if (r > destR || c > destC) {
			return;
		}
		if (r == destR && c == destC) {
			System.out.println(path);
			return;
		}
		maze(r + 1, c, path + 'D', destR, destC);
		maze(r, c + 1, path + 'R', destR, destC);
	}

	public static void Partitioning(String table, String bag) {
		if(table.isEmpty()) {
			System.out.println(bag);
		}
//		table = "nitin"
		for (int chakku = 1; chakku <= table.length(); chakku++) {
			String piece = table.substring(0, chakku);
			if(isPalin(piece)) {
				String remain = table.substring(chakku);
	//			System.out.println(piece + "--" + remain);
				Partitioning(remain, bag +"||"+ piece);
			}
		}

	}

	private static boolean isPalin(String str) {
		int s =0; int e = str.length()-1;
		while(s<e) {
			if(str.charAt(s)!=str.charAt(e)) {
				return false;
			}
			s++;e--;
		}
		// TODO Auto-generated method stub
		return true;
	}
}
