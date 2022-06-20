package Lec_01;

public class Report_card {
	public static void main(String[] args) {
		int marks = 92;

		if (60 <= marks && marks < 70) {
			System.out.println("D");
		} else if (marks >= 90 && marks < 100) {
			System.out.println("A");
		} else if (marks >= 80 && marks < 90) {
			System.out.println("B");
		} else if (marks >= 70 && marks < 80) {
			System.out.println("C");
		} else if (marks >= 50 && marks < 60) {
			System.out.println("E");
		} else {
			System.out.println("F");
		}
	}
}
