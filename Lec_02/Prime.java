package Lec_02;

public class Prime {
	public static void main(String[] args) {
		int num = 6;
		int div = 1;
		int count = 2;
		while (div <= num) {
			if (num % div == 0) {
				count++;
//				System.out.println(div);
			}
			div++;
		}
		if(count==2) {
			System.out.println("Prime");
		}else {
			System.out.println("Not prime");
		}
	}
}
