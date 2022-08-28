package Lec_17_18;

import java.util.ArrayList;
import java.util.List;

public class Recursion_3 {

	public static void main(String[] args) {
//		Subseq("ABC", "");
//		CoinToss(3, "");
//		LKC("234", "");
		Climb(0, "", 3);
	}
	public static void Subseq(String players, String team) {
		if (players.isEmpty()) {
			System.out.println(team+"-");
			return;
		}
		char ch = players.charAt(0);
		Subseq(players.substring(1), team + ch);
		Subseq(players.substring(1), team);
	}
	public static void CoinToss(int n, String path) {
		if(n==0) {
			System.out.println(path);
			return;
		}
		CoinToss(n-1, path+'H');
		CoinToss(n-1, path+'T');
	}
	public static String options(char ch) {
		if(ch=='2') {
			return "abc";
		}else if(ch=='3') {
			return "def";
		}else if(ch=='4') {
			return "ghi";
		}else if(ch=='5') {
			return "jkl";
		}else if(ch=='6') {
			return "mno";
		}else if(ch=='7') {
			return "pqrs";
		}else if(ch=='8') {
			return "tuv";
		}else if(ch=='9') {
			return "wxyz";
		}else {
			return "";
		}
	}
	public static void LKC(String digits, String path) {
		if(digits.isEmpty()) {
			System.out.println(path);
			return;
		}
		String ops = options(digits.charAt(0));
//		ops = "abc" , digits = 234
		for(int i=0;i<ops.length();i++) {
			LKC(digits.substring(1), path+ops.charAt(i));
		}
	}
	public List<String> letterCombinations(String digits) {
        List<String> AL = new ArrayList<String>();
        LKC(digits, "",AL);
        return AL;
        
    }
    
	//https://leetcode.com/problems/letter-combinations-of-a-phone-number/submissions/
	public static void LKC(String digits, String path, List<String> AL) {
		if(digits.isEmpty()) {
            if(!path.isEmpty()){
                AL.add(path);
            }
			// System.out.println(path);
			return;
		}
		String ops = options(digits.charAt(0));
//		ops = "abcd"
		for(int i=0;i<ops.length();i++) {
			LKC(digits.substring(1), path+ops.charAt(i),AL);
		}
	}
//	
	public static void Climb(int curr, String path, int dest) {
		if(curr==dest) {
			System.out.println(path);
			return;
		}
		if(curr>dest) {
			return;
		}
		Climb(curr+1, path+1,dest);
		Climb(curr+2, path+2,dest);
		
	}
}
