package String;

public class ReverseStringInDifferentWay {

	public static void main(String[] args) {
		String s = "Hi Hello Welcome To";
		String rev = "";
		for (int i = 0; i < s.length(); i++) {
			rev = s.charAt(i) + rev;
		}
		System.out.println(rev);

		System.out.println("-------------------------");

		String[] st = s.split(" ");
		for (int i = st.length - 1; i >= 0; i--) {
			System.out.print(st[i] + " ");
		}
	}
}
