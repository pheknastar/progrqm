package ArrayPrograms;

public class ReverseAnArrayTillParticularPos1 {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 3, 2, 4 };
		int pos = 5;
		for (int i = 0; i < a.length; i++) {
			if (pos > 0) {
				System.out.print(a[--pos] + " ");
			} else {
				System.out.print(a[i] + " ");
			}
		}
	}
}