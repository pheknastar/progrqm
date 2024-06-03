package ArrayPrograms;

public class ArrayMultiplication {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
//		int mul = 0;
//		int[] b = {2,12,30,42};
		for (int i = 0; i < a.length - 1; i++) {
			int mul = a[i] * a[i + 1];
			i++;
			System.out.print(mul + " ");
		}
	}
}
