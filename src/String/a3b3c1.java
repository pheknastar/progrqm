package String;

public class a3b3c1 {

	public static void main(String[] args) {
		String s = "aabbabc";
		for (int i = 0; i < s.length(); i++) {
			int c = 0;
			for (int j = 0; j < s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)) {
					if(i>j) {
						break;
					}else {
						c++;
					}
				}
			}
			if(c>=1)
			System.out.print(s.charAt(i)+""+c);
		}
	}
}
