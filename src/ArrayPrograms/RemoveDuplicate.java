package ArrayPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 10, 40, 20 };
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
//			int c = 0;
//			for (int j = i; j < a.length; j++) {
//				if (a[i] == a[j]) {
//					c++;
//				}
//			}
//			if (c == 1) {
//				System.out.println(a[i]);
//			}
			set.add(a[i]);
		}
		System.out.println(set);
//		for (Integer in : set) {
//			System.out.println(in);
//		}
	}
}
