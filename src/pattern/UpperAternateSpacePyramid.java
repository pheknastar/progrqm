package pattern;

public class UpperAternateSpacePyramid {

	public static void main(String[] args) {
		int n = 5;
		int c = 1;
		char ch = 'A';
		for (int i = 1; i <= n; i++) {
			int n2 = n + 1;
			for (int j = 1; j <= n * 2 - 1; j++) {
				if (i + j >= n + 1 && j - i <= n - 1 && i + j == n2) {
					if (i % 2 == 1) {
						System.out.print(ch++ + " ");
						n2 = n2 + 2;
					} else {
						System.out.print(c++ + " ");
						n2 = n2 + 2;
					}
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
