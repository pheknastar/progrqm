package ArrayPrograms;

public class SumOf1stThreeMin {

	public static void main(String[] args) {
		int[] a = {15,35,8,25};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum = sum+a[i];
		}
		System.out.println(sum);
	}
}
