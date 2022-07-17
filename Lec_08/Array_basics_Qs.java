package Lec_08;

public class Array_basics_Qs {
	public static void main(String[] args) {
		int[] arr = { 11, 12, 13, 0, 90, 8, 100 };
		System.out.println(max(arr));
	}

	public static int max(int[] arr) {
//		int jeb =0;// jeb = Integer.min_val
		int jeb = arr[0];
		for (int aam : arr) {
			if (aam > jeb) {
				jeb = aam;
			}
		}
		return jeb;
	}

	public static int find(int[] arr, int ali) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ali) {
				return i;
			}
		}
		return -1;
	}
}
