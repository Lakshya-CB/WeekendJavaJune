package Lec_24;

public class Client_1 {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.getAge());
//		s1.setAge(10);
		try {
			System.out.println("try start");
			s1.setAge(10);
			System.out.println("try end");
		} catch (Exception e) {
			System.out.println("catch start");
			System.out.println(e.getMessage());
//			e.printStackTrace();

			System.out.println("catch end");
		}finally {
			System.out.println("AZAADI!");
		}
		System.out.println(s1.getAge());
	}
}
