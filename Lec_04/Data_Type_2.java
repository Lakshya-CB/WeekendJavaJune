package Lec_04;

public class Data_Type_2 {
	public static void main(String[] args) {
		float f = 21.2f; // 4 byte
		double d = 21.2; // 8 byte
		boolean b = 3 > 4;
		System.out.println(b);

		char ch = 'a';
		int i = (int) ch;
		System.out.println(i);
		System.out.println((char) 62);
		System.out.println(ch + 1);

		ch = (char)(ch + 1);
		
		System.out.println(ch);

		System.out.println((int)'A');
	}
}
