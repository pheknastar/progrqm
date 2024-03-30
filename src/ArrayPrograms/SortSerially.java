package ArrayPrograms;

public class SortSerially {

	public static void main(String[] args) {
		int a[] = { 0, 4, 0, 2, 0, 6 };// 0 0 0 6 2 4
		int b[] = new int[a.length];
		int m = 0;
		int n = a.length - 1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				b[m] = a[i];
				m++;
			}else {
				b[n] = a[i];
				n--;
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
