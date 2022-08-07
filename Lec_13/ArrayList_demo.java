package Lec_13;

import java.util.ArrayList;

public class ArrayList_demo {
	public static void main(String[] args) {
		ArrayList<Integer> AL = new ArrayList<Integer>();
		System.out.println(AL);

		AL.add(10);
		System.out.println(AL);
		AL.add(20);
		System.out.println(AL);
		AL.add(30);
		System.out.println(AL);
		System.out.println(AL.size());

//		arr[i], indexing!!
		System.out.println(AL.get(0));
		System.out.println(AL.get(AL.size() - 1));
// 		arr[0] =99
		AL.set(2, 99);
		System.out.println(AL);

		AL.add(1,100);
		System.out.println(AL);
		AL.add(AL.size()-1,99999);
		System.out.println(AL);
		
		for(int ali : AL) {
			System.out.println(ali);
		}
	
	}
}
