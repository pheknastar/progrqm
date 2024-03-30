package String;

public class AlphaNumeric {

	public static void main(String[] args) {
		String s = "a1b&3$c";
		String alp = "";
		String d = " ";
		String spe = " ";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
				alp = alp + c;
			} else if (c >= '0' && c <= '9') {
				d = d + c;
			} else {
				spe = spe + c;
			}
		}
		System.out.println(alp + d + spe);
	}
}
