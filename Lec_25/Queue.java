package Lec_25;

public class Queue {
	int[] arr;
	int s;
	int size;

	Queue(int newCap) {
		arr = new int[newCap];

	}

	Queue() {
		this(5);
	}

	public int size() {
		return size;
	}

	public boolean isFull() {
		return size() == arr.length;
	}

	public boolean isEmpty() {
		return size() == 0;
	}
	public int peek() {
		if(isEmpty()) {
			throw new RuntimeException("Bhai rehne de");
		}
		return arr[s];
	}
	public void add(int ali) {
		if(isFull()) {
			throw new RuntimeException("bhai mere FUll hein");
		}
		int idx = (s+size)%arr.length;
		arr[idx]=ali;
		size++;
	}
	public int poll() {
		if(isEmpty()) {
			throw new RuntimeException("Bhai rehne de");
		}
		int ans = arr[s];
		s=(s+1)%arr.length;
		
		size--;
		return ans;
	}
}
