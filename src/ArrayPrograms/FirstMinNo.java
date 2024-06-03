package ArrayPrograms;

public class FirstMinNo {

	public static void main(String[] args) {
		int[] a = { 15, 36, 8, 25 };
		int min = a[0];
		int min2 = 0;
		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a.length-1; j++) {
//				if(a[j]>a[j+1]) {
//					int temp = a[j];
//					a[j] = a[j+1];
//					a[j+1] = temp;
//				}
//			}
//		}
//			System.out.println(a[0]);//first min no
//			System.out.println(a[1]);//second min no
			if (min > a[i]) {
				min2 = min;
				min = a[i];
			}
		}
		System.out.println(min2);
		System.out.println(min);
	}
}
