package pattern;

public class PatternUsingSingleLoopForAll {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1, j = 1; i <= n;) {
			if (i + j >= n + 1) {
				System.out.print("* ");
			} else {
				System.out.print("  ");
			}
			if (j == n) {
				System.out.println();
				i++;
				j = 1;
			} else {
				j++;
			}
		}
	}
}
