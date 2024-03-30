package String;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharInStringUsingCollection {

	public static void main(String[] args) {
		String s1 = "Hi Hello Welcome To";
		String s = s1.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character ch : set) {
			System.out.print(ch);
		}
	}
}
