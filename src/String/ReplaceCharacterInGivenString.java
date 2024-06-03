package String;

public class ReplaceCharacterInGivenString {

	public static void main(String[] args) {
		String s = "Jhony Jhony Yes papa";
		char ch = 't', ch1 = 'n';
		s = s.replace('J', ch);
		s = s.replace('p', ch1);
		System.out.println(s);
	}
}
