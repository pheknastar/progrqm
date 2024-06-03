package ArrayPrograms;

public class MergeArray2ndWay {

	public static void main(String[] args) {
		int[] a = { 7, 8, 5, 6 };
		int[] b = { 17, 18, 15, 16 };
		int[] c = new int[a.length + b.length];
		for (int i = 0; i < c.length; i++) {
			if (i < a.length) {
				c[i] = a[i];
			} else {
				c[i] = b[i - a.length];
			}
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}
}
