package String;

public class CountVowels {

	public static void main(String[] args) {
		String s = "India";
		String s1 = s.toLowerCase();
		int cVowel = 0;
		String res = "";
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//				if (res.indexOf(ch) == -1) {
					cVowel++;
//					res += ch;
//				}
			}
		}
		System.out.println(cVowel);
	}
}
