package String;

public class OccurenceOfChar {

	public static void main(String[] args) {
		String s = "lollipop";
		String s1 = s.toLowerCase();
		for (int i = 0; i < s1.length(); i++) {
			int c = 0;
			for (int j = 0; j < s1.length(); j++) {
				if (s1.charAt(i) == s1.charAt(j)) {
					if (i > j) {
						break;
					} else {
						c++;
					}
				}
			}
			if (c >= 1) {
				System.out.println(s1.charAt(i) + "---" + c);
			}
		}
	}
}
