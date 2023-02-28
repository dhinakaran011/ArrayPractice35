package corejava.arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array1 obj = new Array1();
		int[] marks = {78,87,58,94,65};
		obj.declare_array();
		System.out.println("before");
		obj.print_array(marks);
		System.out.println("after");
		int[] mark = obj.print_array2(marks);
		for(int i=0;i<mark.length;i++) {
			System.out.println(mark[i]);
		}
	}
	private void print_array(int[] marks) {
		// TODO Auto-generated method stub
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		
	}
	private int[] print_array2(int[] marks) {
		// TODO Auto-generated method stub
		for(int i=0;i<marks.length;i++) {
			marks[i] += 2;
		}
		return marks;
	}
	private void declare_array() {
		// TODO Auto-generated method stub
		int[] marks = {78,87,58,94,65};
		String[] names = new String[3];
		names[0] = "dhina";
		names[1] = "ashwin";
		names[2] = "shakthi";
		
		int[] values = new int[0];
		System.out.println(marks.length);
		System.out.println(names.length);
		System.out.println(values.length);



	}

}
