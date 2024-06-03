package ArrayPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseAnArray {

	public static void main(String[] args) {
		int[] a = {2,5,6,10,3,7};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}
}
