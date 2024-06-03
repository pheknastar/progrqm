package pattern;

public class ABCpyramid {

	public static void main(String[] args) {
		int size = 4;
		for (int i = 1; i <= 2 * size - 1; i++) {
			char k = 'A';
			for (int j = 1; j <= 2 * size - 1; j++) {
				if (i + j >= size + 1 && j - i <= size - 1 && i - j <= size - 1 && i + j <= 3 * size - 1) {
					System.out.print(k + " ");
					if (j < size) {
						k++;
					} else {
						k--;
					}
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
