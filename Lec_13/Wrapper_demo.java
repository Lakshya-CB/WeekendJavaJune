package Lec_13;

public class Wrapper_demo {
	public static void main(String[] args) {
		Integer I = 10;
		System.out.println(I + 100);
		int i = 100;

//		I = i;// Auto-boxing 
		System.out.println(I);
		i = I; // Unboxing!!
		System.out.println(i);
	}
}
