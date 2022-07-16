package Lec_07;

public class Func_demo_4 {

	static int val = 100;

	public static void main(String[] args) {
		System.out.println(Func_demo_4.val);
		fun(20);
	}

	public static void fun(int a) {
		int val = 20;
		System.out.println(val);
		System.out.println(Func_demo_4.val);
		val = val + 60;
		Func_demo_4.val = val + 10;
		System.out.println(val);
		System.out.println(Func_demo_4.val);
	}
}
