package Lec_02;

public class Sum_counting {
	public static void main(String[] args) {
		int n = 5;
		int count = 1;
		int sum = 0;
		while (count <= n) {
			sum = sum + count;
			count = count + 1;
		}
		System.out.println(sum);

	}
}
