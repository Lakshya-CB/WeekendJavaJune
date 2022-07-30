package Lec_10;

public class Subarray {
	public static void main(String[] args) {
		int[] arr = { 10, 20, -30, 60 };
		logic1(arr);

	}

	public static void logic1(int[] arr) {
		int ans = Integer.MIN_VALUE;
		for (int s = 0; s < arr.length; s++) {
			for (int e = s; e < arr.length; e++) {
//				System.out.println(s + " " + e);
				int sum = 0;
				for (int idx = s; idx <= e; idx++) {
					System.out.print(arr[idx] + " ");
					sum = sum + arr[idx];
				}
				System.out.println(" => " + sum);
				if (sum > ans) {
					ans = sum;
				}
			}
		}
		System.out.println(ans);
	}

	public static void logic2(int[] arr) {
		int ans = Integer.MIN_VALUE;
		for (int s = 0; s < arr.length; s++) {
			int sum = 0;
			for (int e = s; e < arr.length; e++) {
//				System.out.println(s + " " + e);
				sum = sum + arr[e];
				System.out.println(sum);
				if (sum > ans) {
					ans = sum;
				}
			}
		}
		System.out.println("==" + ans);
		System.out.println(ans);
	}

	public static void logic3(int[] arr) {
//		kadance
		int sum = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			if (sum < 0) {
				sum = 0;
			}
			if (max < sum) {
				max = sum;
			}
		}
	}

	public static boolean find(int[] arr, int ali) {
		int s = 0;
		int e = arr.length - 1;
		while (s <= e) {
			int mid = (s + e) / 2;
			if (arr[mid] == ali) {
				return true;
			} else if (arr[mid] > ali) {
				e = mid - 1;
			} else {
				s = mid + 1;
			}
		}
		return false;
	}
	public int firstBadVersion(int n) {
        int s =1;
        int e =n;
        int ans =n;
        while(s<=e){
            int mid = (s-e)/2+e;
            if(isBadVersion(mid)){
                ans = mid;
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return ans;
    }
}

}
