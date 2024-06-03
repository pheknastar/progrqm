package String;

public class RemoveSubString {

	public static void main(String[] args) {
		String s = "i love rakuten india";
		String[] s1 = s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			String s2 = s1[i];
			if (i == s1.length - 2)
				System.out.println(s2);
		}
	}
}
