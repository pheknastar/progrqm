package pattern;

public class PatternWithSingleLoop {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1, j = 1; i <= n;) {
			if (i>=j) {
				System.out.print("* ");
				j++;
			} else {
				i++;
				System.out.println();
				j = 1;
			}
		}
	}
}
