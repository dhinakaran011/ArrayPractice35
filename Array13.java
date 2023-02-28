package corejava.arrays;

public class Array13 {
	public static void main(String[] args) {
		Array13 obj = new Array13();
		obj.dup_elements();
		
	}
	void dup_elements() {
		int[] arr = {12,8,36,8,8,98,370,35,456};
		int num = 8;
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == num) {
				count++;
			}
		}
		System.out.println(count);
	}

}
