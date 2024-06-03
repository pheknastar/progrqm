package mindtree;

import java.util.Scanner;

public class InfiniteArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("give size");
		int size = sc.nextInt();
		System.out.println("enter array");
		int[] a = new int[size];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			sum = sum + a[i];
		}
		System.out.println(sum);
	}
}
