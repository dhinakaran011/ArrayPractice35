package corejava.arrays;

public class Array9 {
	public static void main(String args[]) {
		Array9 obj = new Array9();
		int big= obj.array_big();
		System.out.println(big);
	}
	int array_big() {
		int big = 0;
		int[] arr = {53,7,34,83,16,59};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>big) {
				big = arr[i];
			}
		}
		return big;
	}

}
