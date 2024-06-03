package task;

public class a1c2d {

	public static void main(String[] args) {
		String s = "a1c2d";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z') {
				System.out.print(ch);
			}else if(ch>='0' && ch<='9') {
				String s1 = Character.toString(ch);
				int val = Integer.parseInt(s1);
				ch = (char)(s.charAt(i-1)+val);
				System.out.print(ch);
			}
		}
	}
}
