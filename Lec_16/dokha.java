package Lec_16;

public class dokha {
	public static void main(String[] args) {
		String str = "";
		int n = 100000;
		StringBuilder sb = new StringBuilder(str); 
		long start = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
//			str = str + i;
			sb.append(i);
		}
		str= sb.toString();
		long end = System.currentTimeMillis();
		System.out.println((end - start) / 1000.0);
	}
}
