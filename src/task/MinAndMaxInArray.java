package task;

public class MinAndMaxInArray {

	public static void main(String[] args) {
		int a[] = { 4, 0, 5, 1, 0, 3, 5 };
		int min = a[0];
		int min2 = a[0];
		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min2 && a[i] > min) {
				min2 = a[i];
			}
		}
		System.out.println(min);
		System.out.println(min2);
	}
}
