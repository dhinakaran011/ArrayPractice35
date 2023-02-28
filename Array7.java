package corejava.arrays;

public class Array7 {
	public static void main(String[] args) {
		Array7 obj = new Array7();
		int[] arr = {1,4,3,6,8,2};
		int num = 4;
		arr = obj.value_fixing(arr,num);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	int[] value_fixing(int[] arr,int num) {
		arr[arr.length-1] = num;
		return arr;
	}

}
