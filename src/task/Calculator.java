package task;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st no : ");
		int a1 = sc.nextInt();
		System.out.print("Enter the 2st no : ");
		int a2 = sc.nextInt();
		System.out.println("Select Operator : ");
		System.out.println("Add\nSUB\nDIV\nMUL\nMOD");
		int opt = sc.nextInt();
		switch (opt) {
		case 1: System.out.print(a1+a2);
		break;
		case 2: System.out.print(a1-a2);
		break;
		case 3: System.out.print(a1/a2);
		break;
		case 4: System.out.print(a1*a2);
		break;
		case 5: System.out.print(a1%a2);
		break;
		default: System.out.print("invalid operator");
		}
	}
}
