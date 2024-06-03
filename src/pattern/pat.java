package pattern;

public class pat {

	public static void main(String[] args) {
		int size = 4;
		char k = 'A';
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				if (i >= j) {
					System.out.print(k-- + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
			k = (char) ('A' + i);
		}
	}
}
