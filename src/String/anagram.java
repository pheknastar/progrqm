package String;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		String s = "top";		
		String s1 = "pot";
		if(s.length()!=s1.length()) {
			System.out.println("Not Anagram");
		}else {
			char[] ch = s.toCharArray();
			char[] ch1 = s1.toCharArray();
			Arrays.sort(ch);
			Arrays.sort(ch1);
			boolean f = false;
			for (int i = 0; i < ch.length; i++) {
				if(ch[i]==ch1[i]) {
					f = true;
				}else {
					f = false;
					break;
				}
			}if(f==true) {
				System.out.println("Anagram");
			}else {
				System.out.println("not a Anagram");
			}
		}
	}
}
