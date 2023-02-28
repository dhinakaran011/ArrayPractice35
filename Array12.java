package corejava.arrays;

public class Array12 {
	public static void main(String[] args) {
		Array12 obj = new Array12();
		obj.small_two();
	}
	void small_two() {
		int[] arr = {12,8,36,98,370,35,456};
		int first = arr[0],second = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<first) {
				second = first;
				first = arr[i];
			}
			else if(arr[i]<second) {
				second = arr[i];
			}
		}
		System.out.println(first);
		System.out.println(second);
	}

}
