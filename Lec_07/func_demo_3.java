package Lec_07;

public class func_demo_3 {
	static int var = 100;
	public static void main(String[] args) {
		int var = 99;
		System.out.println(var);
		System.out.println(func_demo_3.var);
		int a = 1;
		int b = 20;
		System.out.println(a + " : " + b);
		swap(a, b);
		System.out.println(a + " : " + b);
	}

	public static void swap(int a, int b) {
		System.out.println(var);
		
		System.out.println(a + " : " + b);
		int c = a;
		a = b;
		b = c;
		System.out.println(a + " : " + b);
	}

}
