package task;

public class FindPeek {

	public static void main(String[] args) {
		int[] a = { 7, 6, 3, 5, 4, 5 }; // 3
		for (int i = 0; i < a.length; i++) {
			if ((i != 0 && i != a.length - 1)) {
				if (a[i] >= a[i + 1] && a[i] >= a[i - 1]) {

					System.out.println(a[i]);
				}
			} else if ((i == 0) && a[i] >= a[i + 1]) {
				System.out.println(a[i]);
			} else if ((i == a.length - 1) && a[i] >= a[i - 1]) {
				System.out.println(a[i]);
			}

		}
	}
}
