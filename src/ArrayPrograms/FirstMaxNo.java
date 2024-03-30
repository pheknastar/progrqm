package ArrayPrograms;

public class FirstMaxNo {

	public static void main(String[] args) {
		int[] a = {15,36,8,25};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if(a[j]<a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
			System.out.println(a[0]);//first max no
			System.out.println(a[1]);//second max no
	}
}
