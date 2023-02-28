package corejava.arrays;

public class Array10 {
	public static void main(String[] args) {
		Array10 obj = new Array10();
		int small = obj.array_small();
		System.out.println(small);
	}
	int array_small() {
		int[] arr = {12,53,76,22,97,3,84,90};
		int small = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<small) {
				small = arr[i];
			}
		}
		return small;
	}
	
}

