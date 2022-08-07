package Lec_13;

public class String_Qs {
	public static void main(String[] args) {
		ReverseSen("the sky is blue");
	}

	public static void ReverseSen(String str) {
		while (true) {
			int idx = str.lastIndexOf(" ");
			String word = str.substring(idx + 1);
			System.out.println(word);
			if(idx==-1) {
				return;
			}
			str = str.substring(0, idx);
		}
	}
}
