package ArrayPrograms;

import java.util.Scanner;

public class InfiniteAndDynamicArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		System.out.println("enter the array : ");
		int a[] = new int[size];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			sum = sum + a[i];
		}
		System.out.println("the sum is : "+sum);
	}
}
