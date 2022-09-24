package Lec_25;

public class Finallly_demo {
	public static void main(String[] args) {
		fn();
	}

	public static void fn() {
		try {
			System.out.println("AZAAD");
			return;
		} catch (Exception E) {

		} finally {
			System.out.println("askjasdla");
		}
	}
}
