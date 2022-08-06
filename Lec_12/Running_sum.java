package Lec_12;

import java.util.Scanner;

public class Running_sum {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scn.nextInt();
		}
		int[] sum = new int[nums.length];
		sum[0] = nums[0];
		System.out.print(sum[0]+" ");
		for (int i = 1; i < nums.length; i++) {
			sum[i] = sum[i - 1] + nums[i];
			System.out.print(sum[i]+" ");
		}

	}
}
