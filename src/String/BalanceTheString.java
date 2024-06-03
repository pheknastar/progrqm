package String;

import java.util.ArrayList;

public class BalanceTheString {

	public static void main(String[] args) {
		String s = "({[()]})";
		ArrayList<Character> list = new ArrayList<Character>();
		for (int i = 0; i < s.length(); i++) {
			if ((list.size() != 0) && (s.charAt(i) == '}' && list.get(list.size() - 1) == '{')
					|| (s.charAt(i) == ')' && list.get(list.size() - 1) == '(')
					|| (s.charAt(i) == ']' && list.get(list.size() - 1) == '[')) {
				list.remove(list.size() - 1);
			} else {
				list.add(s.charAt(i));
			}
		}
		if (list.size() == 0) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not Balanced");
		}
	}
}
