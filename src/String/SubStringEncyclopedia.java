package String;

public class SubStringEncyclopedia {

	public static void main(String[] args) {
		String s = "encyclopedia";
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String s2 = s.substring(i, j);

				boolean flag = false;
				if (s2.contains('a' + "") || s2.contains('e' + "") || s2.contains('i' + "") || s2.contains('o' + "")
						|| s2.contains('u' + "")) {
					flag = true;
				}
				if (flag == false) {
					if (s1.length() < s2.length()) {
						s1 = s2;
					}
				}
			}
		}
		System.out.println(s1);
	}
}
