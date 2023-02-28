package corejava.arrays;

public class Array8 {

	public static void main(String[] args) {
		Array8 obj = new Array8();
		obj.perform();
	}
	 void perform() {
		 int[] arr = {1,2,3,4,5,3,3,4,3,3};
		 int count = 0,num = 3;
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]==num) {
				 count++;
			 }
		 }
		 System.out.println(count);
	}

}
