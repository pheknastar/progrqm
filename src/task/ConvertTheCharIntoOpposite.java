package task;

public class ConvertTheCharIntoOpposite {

	public static void main(String[] args) {
		String[] s = {"No","26","Sound"};
//		String[] s1 = s.split(" ");
		for (int i = 0; i < s.length; i++) {
			String s2 = s[i];
			for (int j = 0; j < s2.length(); j++) {
				if(s2.charAt(j)>='A' && s2.charAt(j)<='Z') {
					System.out.print((char)(s2.charAt(j)+32));
				}else if(s2.charAt(j)>='a' && s2.charAt(j)<='z') {
					System.out.print((char)(s2.charAt(j)-32));
				}else {
					System.out.print(s2.charAt(j));
				}
			}
			System.out.print(" ");
		}
	}
}
