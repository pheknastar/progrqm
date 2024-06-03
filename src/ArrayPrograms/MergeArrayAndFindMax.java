package ArrayPrograms;

import java.util.Arrays;

public class MergeArrayAndFindMax {

	public static void main(String[] args) {
		int[] a = { 7, 8, 5, 6 };
		int[] b = { 17, 18, 15, 16 };
		int[] c = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int j = 0; j < b.length; j++) {
			c[a.length + j] = b[j];
		}
		for (int i = 0; i < c.length; i++) {
			Arrays.sort(c);
			System.out.print(c[i] + " ");
		}
		System.out.println();
		System.out.println("maximum is : " + c[c.length - 1]);
	}
}
