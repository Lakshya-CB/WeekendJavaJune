package Lec_11;

import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 23 };

//		int[] arr = { 10, 20, 30, 50, 2 };
//		bubble(arr);
//		Selection(arr);
		Insertions(arr);
	}

	public static void bubble(int[] arr) {
		for (int count = 1; count < arr.length; count++) {
			for (int s = 0; s <= arr.length - 1 - count; s++) {
//			s and s+1
				if (arr[s + 1] < arr[s]) {
					int temp = arr[s];
					arr[s] = arr[s + 1];
					arr[s + 1] = temp;
				}
//				System.out.println(Arrays.toString(arr));
			}
//			System.out.println("===============");
		}
	}

	public static void Selection(int[] arr) {

		for (int last = arr.length - 1; last > 0; last--) {
			int maxI = 0;
			for (int i = 0; i <= last; i++) {
				if (arr[maxI] < arr[i]) {
					maxI = i;
				}

			}
//		swap maxI with last
			int temp = arr[last];
			arr[last] = arr[maxI];
			arr[maxI] = temp;
			System.out.println(Arrays.toString(arr));
		}
	}

	public static void Insertions(int[] arr) {
//		[50,40, 30, 20, 10]
		for (int last = 1; last < arr.length; last++) {
			int idx = last - 1;
			int ali = arr[last];
//		while(arr[idx]>ali&&idx>=0) {
			while (idx >= 0 && arr[idx] > ali) {
				arr[idx + 1] = arr[idx];
				idx--;
				System.out.println(Arrays.toString(arr));

			}
			arr[idx + 1] = ali;
			System.out.println("---" + Arrays.toString(arr));
			System.out.println("============");
		}
	}
}
