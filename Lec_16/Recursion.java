package Lec_16;

public class Recursion {
	public static void main(String[] args) {
//		PD(4);
//		PDI(4);
//		PID(1,4);
//		System.out.println(Fact(4));
		System.out.println(Fibo(7));
	}

	public static void PD(int n) {
		if (n == 0) {// base case smallest problem
			return;
		}
//		BP : PD(n)
//		SP : PD(n-1)
		System.out.println(n);
		PD(n - 1);
	}

	public static void PDI(int n) {
//		BP : PDI(n)
//		SP : PDI(n-1)
		if (n == 0) {
			return;
		}
		System.out.println(n);
		PDI(n - 1);
		System.out.println(n);
	}

	public static void PID(int s, int e) {
//		BP : PID(s,e)
//		SP : PID(s+1,e)
		if(s>e) {
			return;
		}
		System.out.println(s);
		PID(s+1,e);
		System.out.println(s);
	}
	
	public static int Fact(int n) {
		if(n==0) {
			return 1;
		}
//		BP : Fact(n)
//		SP : Fact(n-1);
		int sp = Fact(n-1);
		return sp*n;
	}
	public static int Fibo(int n) {
		if(n<=1) {
			return n;
		}
//		BP : Fibo(n)
//		SP : Fibo(n-1), Fibo(n-2)
		int sp1 = Fibo(n-1);
		int sp2 = Fibo(n-2);
		return sp1+sp2;
	}
}
