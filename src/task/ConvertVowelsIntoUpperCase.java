package task;

public class ConvertVowelsIntoUpperCase {

	public static void main(String[] args) {
		String s = "pushkar";
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='u') {
				char ch = (char)(s.charAt(i)-32);
				s1 = s1+ch;
			}else {
				s1 = s1+s.charAt(i);
			}
		}
		System.out.println(s1);
	}
}
