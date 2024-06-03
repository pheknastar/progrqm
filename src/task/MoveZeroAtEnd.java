package task;

public class MoveZeroAtEnd {

	public static void main(String[] args) {
		int a[] = { 7, 0, 2, 6, 0 };
		int b[] = new int[a.length];
		int m = 0;
		int n = a.length - 1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				b[m] = a[i];
				m++;
			} else {
				b[n] = a[i];
				n--;
			}
		}
		for (int i = b.length - 1; i >= 0; i--) {
			System.out.print(b[i] + " ");
		}
	}
}
