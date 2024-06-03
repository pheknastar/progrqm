package mindtree;

public class ReverseArrayTillPos {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		int pos = 3;
		for(int i=pos-1; i>=0; i--) {
			System.out.print(a[i]+" ");
		}
		for(int i=pos; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
