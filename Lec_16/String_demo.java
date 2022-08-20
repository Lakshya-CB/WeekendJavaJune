package Lec_16;

public class String_demo {
	public static void main(String[] args) {
		String str = "lol";
		String str1 = "lol";
		String str2 = "lol";
		
		System.out.println(str==str2);
		
		String str00 = new String("lol");
		System.out.println(str00);
		System.out.println(str==str00);
		
		System.out.println(str.equals(str00));
		
		str1 = "LLLLL";
		System.out.println(str); 
		System.out.println(str1);
//		
		String s1 = "abcd";
		String s2 = s1.substring(0,3);
		System.out.println(s1==s2);
		
	}
}
