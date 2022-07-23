package Lec_09;

public class Array_basics_2 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
//		RevPrint(arr);
//		Rev(arr);
//		disp(arr);
		Rotation(arr, 3);
		disp(arr);
	}

	public static void disp(int[] arr) {
		for (int ali : arr) {
			System.out.print(ali + " ");
		}
		System.out.println();
	}

	public static void Rev(int[] arr) {
		int s = 0;
		int e = arr.length - 1;
		while (s < e) {
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;
			e--;
		}
	}

	public static void Rev(int[] arr, int s, int e) {

		while (s < e) {
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;
			e--;
		}
	}

	public static void RevPrint(int[] arr) {
		for (int idx = arr.length - 1; idx >= 0; idx--) {
			System.out.print(arr[idx] + " ");
		}
		System.out.println();
	}

	public static void Rotation(int[] arr, int rot) {
		rot = rot % arr.length;
		for (int r = 0; r < rot; r++) {
			int jeb = arr[arr.length - 1];
//		for(int idx=0;idx<=arr.length-2;idx++) {
			for (int idx = arr.length - 2; idx >= 0; idx--) {

				arr[idx + 1] = arr[idx];
			}
			arr[0] = jeb;
		}
		disp(arr);
	}

	public static void Rotation2(int[] arr, int rot) {
		rot = rot % arr.length;
		if(rot<0) {
			rot = rot + arr.length;
		}
//		Step 1:
		Rev(arr, 0, arr.length - 1);
//		Step 2: 
		Rev(arr, 0, rot - 1);
//		Step 3:
		Rev(arr, rot, arr.length - 1);

	}

}
