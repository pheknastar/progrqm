package mindtree;

public class FindNonRepeatingEleInArray {

	public static void main(String[] args) {
		int[] a = {5,3,1,2,1,6,4,3};
		for (int i = 0; i < a.length; i++) {
			int c = 0;
			for (int j = 0; j < a.length; j++) {
				if(a[i] == a[j]) {
					c++;
				}
			}if(c == 1) {
				System.out.print(a[i]+ " ");
			}
		}
	}
}
