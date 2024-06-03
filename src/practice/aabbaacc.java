package practice;

public class aabbaacc {

	public static void main(String[] args) {
		String s = "aaabbaacc";
		int c = 1;
		for (int i = 0; i < s.length()-1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				c++;
			}else {
				System.out.print(s.charAt(i)+""+c);
				c = 1;
			}
		}
		System.out.println(s.charAt(s.length()-1)+""+c);
	}
}
