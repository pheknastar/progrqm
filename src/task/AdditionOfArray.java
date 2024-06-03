package task;

import java.util.Arrays;

public class AdditionOfArray {

//	public static void main(String[] args) {
//		int[] a = { 1, 2, 3, 4 };
//		int[] b = { 5, 6, 7, 8 };
//		int[] sum = new int[a.length];
//		for (int i = 0; i < a.length; i++) {
//			sum[i] = a[i] + b[i];
//		}
//		for (int i : sum) {
//			System.out.println(i);
//		}
//	}
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int c[] = new int[0];
		int in = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				c = Arrays.copyOf(c, c.length + 1);
				c[in++] = a[i];
			}
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}
}
