package NumberProg;

public class PrimeNoInArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9};
		for (int i = 0; i < a.length-1; i++) {
			int c = 0;
			for (int j = 0; j < a.length-1; j++) {
				if (a[i] % a[j] == 0) {
					c++;
				}
			}
			if (c == 2) {
				System.out.println(a[i]);
			}
		}
	}
}
