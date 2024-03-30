package String;

public class PrintMinLengthFromArrayInt {

	public static void main(String[] args) {
		String[] s = { "12", "123", "1234", "45", "6789" };
		String minLength = s[0];
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() < minLength.length()) {
				minLength = s[i];
			}
		}
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() == minLength.length()) {
				System.out.print(s[i]+" ");
			}
		}
	}
}
