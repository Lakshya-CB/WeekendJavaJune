package LecM22;

import java.util.Arrays;

public class Sooootring {
	public static void main(String[] args) {
//		int[] arr1 = {5,15,25,35,45};
//		int[] arr2 = {0,10,20,30,40,50,60,70};
//		System.out.println(Arrays.toString(merge(arr1, arr2)));
//		int[] arr = { 55, 40, 35, 2, 10 };
//		[50,40,80,90,70, 10,30,60,120]
		int[] arr = { 50, 40, 80, 90, 70, 10, 30, 60, 120 };
//		System.out.println(Arrays.toString(mergeSort(arr, 0, arr.length - 1)));
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static int[] merge(int[] arr1, int[] arr2) {
		int[] ans = new int[arr1.length + arr2.length];
		int idx1 = 0;
		int idx2 = 0;
		int i = 0;
		while (idx1 < arr1.length && idx2 < arr2.length) {
			if (arr1[idx1] <= arr2[idx2]) {
				ans[i] = arr1[idx1];
				i++;
				idx1++;
			} else {
				ans[i] = arr2[idx2];
				i++;
				idx2++;
			}
		}
		while (idx1 < arr1.length) {
			ans[i] = arr1[idx1];
			i++;
			idx1++;
		}
		while (idx2 < arr2.length) {
			ans[i] = arr2[idx2];
			i++;
			idx2++;
		}
		return ans;
	}

	public static int[] mergeSort(int[] arr, int s, int e) {
		if (s == e) {
			int[] ans = new int[1];
			ans[0] = arr[s];
			return ans;
		}
		int mid = (s + e) / 2;
		int[] sp1 = mergeSort(arr, s, mid);
		int[] sp2 = mergeSort(arr, mid + 1, e);
		return merge(sp1, sp2);
	}

	public static void quickSort(int[] arr, int s, int e) {
		if (s > e) {
			return;
		}
		int pivot = arr[(s + e) / 2];
		int L = s;
		int R = e;
		while (L <= R) {
			while (arr[L] < pivot) {
				L++;
			}
			while (arr[R] > pivot) {
				R--;
			}
			if (L <= R) {
				int temp = arr[L];
				arr[L] = arr[R];
				arr[R] = temp;
				R--;
				L++;
			}
		}
		quickSort(arr, s, R);
		quickSort(arr, L, e);

	}
}
