package String;

import java.util.Scanner;

public class CountNoOfCharacters {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
		//String s = "Bang a lore";
		int c = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)!=' ') {
				c++;
			}
		}
		System.out.println(c);
	}
}
