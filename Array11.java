package corejava.arrays;

public class Array11 {
	public static void main(String[] args) {
		Array11 obj = new Array11();
		obj.big_two();
	}
	void big_two() {
		int first = 0, second = 0;
		int[] arr = {12,8,36,98,370,35,456};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>first) {
				second = first;
				first = arr[i];
			}
			else if(arr[i]>second) {
				second = arr[i];
			}
		}
		System.out.println(first);
		System.out.println(second);
	}

}
