package String;

public class ReverseTheLastStringInGivenString {

	public static void main(String[] args) {
		String s = "My Name is Pushkar";
		String[] str = s.split(" ");
		String rev = "";
		for (int i = 0; i < str.length; i++) {
			String s1 = str[i];
			if (i == str.length - 1) {
				for (int j = s1.length() - 1; j >= 0; j--) {
					rev = rev + s1.charAt(j);
				}
			} else {
				rev = rev + str[i] + " ";
			}
		}
		System.out.println(rev);
	}
}
