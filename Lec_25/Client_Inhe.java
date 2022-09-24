package Lec_25;

public class Client_Inhe {
	public static void main(String[] args) {
//		case : 1
		Parent P1 = new Parent();
//		case : 2
		Parent P2 = new Child();
		System.out.println(P2.dataP);
		System.out.println(P2.data);
		System.out.println(((Child)P2).data);
		System.out.println("============");
//		P2.
		P2.funP();
		((Child)P2).funC();
		System.out.println("============");
		P2.fun();
		((Child)P2).fun();
//		Case 3 :
//		Child C3 = new Parent();
//		Case 4 :
		Child C4 = new Child();
		System.out.println(C4.data);
		C4.fun();
		C4.funP();
	}
}
