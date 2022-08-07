package Lec_13;

import java.util.ArrayList;

public class ArrayList_Qs {
	public static void main(String[] args) {
//		int[] arr1 = { 10, 10, 20, 30, 35, 35, 40, 50, 60, 120, 130 };
//		int[] arr2 = { 20, 32, 35, 35, 35, 50, 55, 64, 70 };
//		System.out.println(Intersection(arr1, arr2));
		int[] arr1 = { 9, 9, 8, 7 };
		int[] arr2 = { 6, 5 };
		System.out.println(Sum2Arrays(arr1, arr2));

	}

	public static ArrayList<Integer> Intersection(int[] arr1, int[] arr2) {
		ArrayList<Integer> AL = new ArrayList<>();
		int idx1 = 0;
		int idx2 = 0;
		while (idx1 < arr1.length && idx2 < arr2.length) {
			if (arr1[idx1] == arr2[idx2]) {
				AL.add(arr1[idx1]);
				idx1++;
				idx2++;
			} else if (arr1[idx1] < arr2[idx2]) {
				idx1++;
			} else {
				idx2++;
			}
		}
		return AL;
	}

	public static ArrayList<Integer> Sum2Arrays(int[] arr1, int[] arr2) {
		int idx1 = arr1.length - 1;
		int idx2 = arr2.length - 1;
		int carry = 0;
		ArrayList<Integer> AL = new ArrayList<>(99);
		while (idx1 >= 0 || idx2 >= 0) {
//			int sum = carry + arr1[idx1] + arr2[idx2];
			int sum = carry;
			if (idx1 >= 0) {
				sum = sum + arr1[idx1];
			}
			if (idx2 >= 0) {
				sum = sum + arr2[idx2];
			}
			int digit = sum % 10;
			carry = sum / 10;
			idx1--;
			idx2--;
			AL.add(0, digit);
		}
		if(carry>0) {
			AL.add(0,carry);
		}
		return AL;
	}
	public void Swap(int[] arr, int a, int b) {
		int temo = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
