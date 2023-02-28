package corejava.arrays;

public class Array14 {
	public static void main(String[] args) {
		Array14 obj = new Array14();
		obj.odd_count();
	}
	void odd_count() {
		int[] arr = {12,8,36,98,370,35,456};
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			if(i%2!=0) {
				sum += arr[i];
			}
		}
		System.out.println(sum);
	}
}
