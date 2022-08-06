package Lec_12;

import java.util.Scanner;

public class Pair_of_Roses {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int numOfTimes = sc.nextInt();
//		int[] numOfRoses = new int[numOfTimes];
//		int[][] priceOfRoses = new int[numOfTimes][];
//		int[] totalMoneyWithDeepak = new int[numOfTimes];
//		for (int i = 0; i < numOfTimes; i++) {
//			numOfRoses[i] = sc.nextInt();
//			priceOfRoses[i] = new int[numOfRoses[i]];
//			for (int j = 0; j < numOfRoses[i]; j++) {
//				priceOfRoses[i][j] = sc.nextInt();
//			}
//			totalMoneyWithDeepak[i] = sc.nextInt();
//			if (i != numOfTimes - 1) {
//				System.out.println();
//			}
//		}
//		for (int times = 0; times < numOfTimes; times++) {
//			findValues(priceOfRoses[times], totalMoneyWithDeepak[times]);
//		}
		int[] prices = {1,2,3,4,5,6};
//		SYso
		findValues(prices, 7);
	}

	static void findValues(int[] array, int amount) {
		int i = 0;
		int j = 0;
		int difference = Integer.MAX_VALUE;
		for (int a = 0; a < array.length; a++) {
			for (int b = 0; b < array.length; b++) {
				if (a == b) {
				} else {
					if (array[a] + array[b] == amount) {
						if (((array[b] >= array[a])) && ((array[b] - array[a]) < difference)) {
							i = array[a];
							j = array[b];
						} else if (((array[a] > array[b])) && (array[a] - array[b]) < difference) {
							i = array[b];
							j = array[a];
						}
					}
				}
			}
		}
		if (i != 0 || j != 0) {
			System.out.println("Deepak should buy roses whose prices are " + i + " and " + j + ".");
		}
	}
}