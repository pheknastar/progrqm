package task;

public class EvenPosUpperCharacter {

	public static void main(String[] args) {
		String s = "pushkar";
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			if ((i + 1) % 2 == 0) {
				char ch = (char) (s.charAt(i) - 32);
				s1=s1+ch;
			}
			else {
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(s1);
	}
}
