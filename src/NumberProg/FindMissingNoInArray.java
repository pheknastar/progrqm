package NumberProg;

import java.util.ArrayList;

public class FindMissingNoInArray {

	public static void main(String[] args) {
		int[] a = {1,3,4,6,8,9};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}
		for (int i = 1; i < 10; i++) {
			if(!(list.contains(i))) {
				System.out.println(i);
			}
		}
	}
}
