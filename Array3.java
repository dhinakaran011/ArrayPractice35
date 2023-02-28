package corejava.arrays;

public class Array3 {
public static void main(String[] args) {
	Array3 obj = new Array3();
	obj.reverse_array();
}
void reverse_array() {
	int[] arr = {12,53,64,13,86,30};
	for(int i=arr.length-1;i>=0;i--) {
		System.out.println(arr[i]);
	}
}
}
