package String;

public class ReverseFromAnyWhere {

	public static void main(String[] args) {
		String s = "I am Selenium";
		String s1 = s.replace(" ", "");
		int j = s1.length()-1;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)!=' ') {
				System.out.print(s1.charAt(j--));
			}else {
				System.out.print(s.charAt(i));
			}
		}
	}
}
