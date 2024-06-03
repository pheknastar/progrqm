package practice;

public class a2b2c2a1b1c1 {

	public static void main(String[] args) {
		String s = "a2b2c2a1b1c1";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch >= '0' && ch <= '9') {
				int n = ch-48;
				for (int j = 0; j < n; j++) {
					System.out.print(s.charAt(i-1));
				}
			}
		}
	}
}
