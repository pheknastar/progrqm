package practice;

public class A {

	public static void main(String[] args) {
		int[] a = { 0, 1, 2, 3, 1 };
		boolean b = false;
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					if (i > j) {
						break;
					} else {
						count++;
					}
				}
			}
			if (count > 1) {
				b = true;
				System.out.print(a[i] + " ");
			}
		}
		if (b == false) {
			System.out.print("-1");
		}
	}
}
