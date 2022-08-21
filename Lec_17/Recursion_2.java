package Lec_17;

public class Recursion_2 {
	public static void main(String[] args) {
//		System.out.println(pow(2, 3));
		int[] arr = { 100, 250, 20,10, 10 };
//		Rev(arr, 0);
//		System.out.println(Max(arr, 0));
		System.out.println(FO(arr, 0, 10000));
	}

	public static int pow(int a, int b) {
		if (b == 0) {
			return 1;
		}
		int sp = pow(a, b - 1);
		return sp * a;
	}

	public static void Print(int[] arr, int s) {
		if (s == arr.length) {
			return;
		}
//		BP : Print(arr,s)
//		SP : Print(arr,s+1)
		System.out.println(arr[s]);
		Print(arr, s + 1);

	}

	public static void Rev(int[] arr, int s) {
		if (s == arr.length) {
			return;
		}
//		BP : Rev(arr,s)
//		SP : Rev(arr,s+1)
		Rev(arr, s + 1);
		System.out.println(arr[s]);
	}

	public static int Max(int[] arr, int s) {
		if (s == arr.length) {
			return Integer.MIN_VALUE;
		}
//		if (s == arr.length-1) {
//			return arr[s];
//		}
//		Bp: Max(arr,s)
//		SP : Max(arr,s+1)
		int sp = Max(arr, s + 1);
		return Math.max(arr[s], sp);
	}
	public static int FO(int[] arr, int s, int ali) {
		if(s==arr.length) {
			return -1;
		}
//		BP : FO(arr, s, ali)
//		SP : FO(arr,s+1,ali)
		int sp = FO(arr, s+1, ali);
		if(arr[s]==ali) {
			return s;
		}else {
			return sp;
		}
	}
	public static int LO(int[] arr, int s, int ali) {
		if(s==arr.length) {
			return -1;
		}
//		BP : FO(arr, s, ali)
//		SP : FO(arr,s+1,ali)
		int sp = LO(arr, s+1, ali);
		if(arr[s]==ali) {
			return s;
		}else {
			return sp;
		}
	}
}
