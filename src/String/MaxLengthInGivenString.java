package String;

public class MaxLengthInGivenString {

	public static void main(String[] args) {
		String s = "i am from ranchi city";
		String[] s2 = s.split(" ");
		int max = s2[0].length();
		for (int i = 0; i < s2.length; i++) {
			if (max < s2[i].length()) {
				max = s2[i].length();
			}
		}
		for (int i = 0; i < s2.length; i++) {
			if (s2[i].length() == max) {
				System.out.println(s2[i]);
			}
		}
	}
}
