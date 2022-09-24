package Lec_25;

public class Stack {
	private int[] arr;
	private int tos;

	Stack() {
		this(5);
	}
	Stack(int newCap){
		arr = new int[newCap];
		tos = -1;
	}
	public int size() {
		return tos+1;
	}
	public void add(int ali) {
		if(isFull()) {
			throw new RuntimeException("bhai mere FUll hein");
		}
		tos++;
		arr[tos] = ali;
	}
	public void push(int ali) {
		if(isFull()) {
			throw new RuntimeException("bhai mere FUll hein");
		}
		add(ali);
	}
	public int peek() {
		if(isEmpty()) {
			throw new RuntimeException("Kya deekh rha hein?");
		}
		return arr[tos];
	}
	public int pop() {
//		tos--;
		if(isEmpty()) {
			throw new RuntimeException("Bhai rehne de");
		}
		int ans = arr[tos];
		tos--;
		return ans;
	}
	public boolean isFull() {
		return arr.length==size();
	}
	public boolean isEmpty() {
		return size()==0;
	}
	public void disp() {
		int i = tos;
		while(i>=0) {
			System.out.println(arr[i]);
			i--;
		}
	}
}
