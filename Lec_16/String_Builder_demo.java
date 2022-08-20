package Lec_16;

public class String_Builder_demo {
	public static void main(String[] args) {
		String str = "abcd";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.charAt(0));
		
		sb.setCharAt(0, 'p');
		System.out.println(sb);
		sb.append("nahi pata bhaiya");
		System.out.println(sb);
		sb.insert(1, "oly ");
		System.out.println(sb);
		
		String ans = sb.toString();
		System.out.println(ans);
	}
}
