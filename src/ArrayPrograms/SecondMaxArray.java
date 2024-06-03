package ArrayPrograms;

public class SecondMaxArray {

	public static void main(String[] args) {
		int[] a = {2,5,6,10,3,7,7};
		int max = a[0];
		int max2 = 0;
		int max3 = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] > max) {
				max2 = max;
				max = a[i];
			}else if(a[i] > max2) {
				max3 = max2;
				max2 = a[i];
			}
		}
		System.out.println(max3);
		System.out.println(max2);
		System.out.println(max);
	}
}
