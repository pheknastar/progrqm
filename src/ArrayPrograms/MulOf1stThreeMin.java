package ArrayPrograms;

public class MulOf1stThreeMin {

	public static void main(String[] args) {
		int[] a = {5,3,2,7};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		int mul = 1;
		for (int i = 0; i < 3; i++) {
			mul = mul*a[i];
		}
		System.out.println(mul);
	}
}
