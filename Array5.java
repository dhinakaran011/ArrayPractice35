package corejava.arrays;

public class Array5 {
	public static void main(String[] args) {
		Array5 obj = new Array5();
		obj.find_index();
	}
	void find_index() {
		int[] arr = {18,21,40,52,68,72,85};
		int item = 72;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == item) {
				System.out.println("the index value of the given number "+i);
				break;
			}
		}
	}

}
