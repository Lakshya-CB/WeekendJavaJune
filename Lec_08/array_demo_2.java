package Lec_08;

public class array_demo_2 {
	public static void main(String[] args) {
		int[] arr = new int[5];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = 2 * (i + 1);
//		}
		for (int ali : arr) {
			ali = 10;
		}
		System.out.println("=======+++");
		for (int ali : arr) {
			System.out.println(ali);
		}
	}
}
