package corejava.arrays;

public class Array4 {

	public static void main(String[] args) {
		Array4 obj = new Array4();
		obj.leanear_search();
	}
	private void leanear_search() {
		// TODO Auto-generated method stub
		int[] marks = {56,75,74,86,100};
		int mark = 100;
		boolean found = false;
		for(int i=0;i<marks.length;i++) {
			if(marks[i]==mark) {
				System.out.println("the number is found");
				found = true;
				break;
			}
		}
		if(found == false) {
			System.out.println("the number is not found");
		}

	}

}
