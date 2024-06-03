package NumberProg;

public class PrimeNoforRange {

	public static void main(String[] args) {
		int s = 1;
		int l = 30;
		for (int i = s; i <= l; i++) {
			int c = 0;
			for (int j = s; j <= i; j++) {
				if (i % j == 0) {
					c++;
				}
			}
			if (c == 2) {
				System.out.print(i + " ");
			}
		}
	}
}
