package ArrayPrograms;

import java.util.Arrays;

public class ReverseAnArrayTillParticularPos {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int s = 0;
		int e = 2;
		if (e <= a.length && s >= 0) {
			while (s < e) {
				int temp = a[s];
				a[s] = a[e];
				a[e] = temp;
				s++;
				e--;
			}
		}
		System.out.print(Arrays.toString(a));
	}
}
