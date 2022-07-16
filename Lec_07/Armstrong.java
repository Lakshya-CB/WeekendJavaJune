package Lec_07;

public class Armstrong {
	public static void main(String[] args) {
		PrintArmTill(1000);
	}

	public static void PrintArmTill(int n) {
		for (int i = 1; i <= n; i++) {
			if (isArm(i) == true) {
				System.out.println(i);
			}
		}
	}

	public static boolean isArm(int num) {
		int nod = num_of_digit(num);
		int ans = 0;
		int copy = num;
		while (num > 0) {
			int digit = num % 10;
			num = num / 10;
			ans = ans + (int) Math.pow(digit, nod);

		}
		if (ans == copy) {
			return true;
		} else {
			return false;
		}
	}

	public static int num_of_digit(int num) {
		int ans = 0;
		while (num > 0) {
			num = num / 10;
			ans++;
		}
		return ans;
	}
}
