package task;

public class ReplaceVowelWithSpecChar {

	public static void main(String[] args) {
		String s = "afehixonu";
//				.replaceAll("[aeiou]","@");
//		System.out.println(s);
		String s1 = "";
		char[] s2 = s.toCharArray();
		for (int i = 0; i < s2.length; i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='u' || s.charAt(i)=='o') {
				s2[i]='@';
				s1 += s2[i];
			}else {
			s1 += s2[i];
			}
		}
		System.out.println(s1);
	}
}
