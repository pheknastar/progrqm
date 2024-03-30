package String;

public class CountNoOfCharacters {

	public static void main(String[] args) {
		String s = "Bang a lore";
		int c = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)!=' ') {
				c++;
			}
		}
		System.out.println(c);
	}
}
