package String;

public class CountDigitInAlpNumeric {

	public static void main(String[] args) {
		String s = "a1b2c3d4";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if (c >= '0' && c <= '9') {
				int n = c-48;
				sum = sum+n;
			}
		}
		System.out.println(sum);
	}
}
