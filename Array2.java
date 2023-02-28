package corejava.arrays;

public class Array2 {

	public static void main(String[] args) {
		Array2 obj = new Array2();
		obj.print_array();
	}
	void print_array() {
		int arr[] = {12,43,65,14,98};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
