package task;

import java.util.ArrayList;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {
		int[] a = { 5, 4, 6, 6, 8, 2, 2 };
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
			for (int j = 0; j < list.size() - 1; j++) {
				if (a[i] == list.get(j)) {
					list.remove(j);
				}
			}
		}
		System.out.println(list);
	}
}
