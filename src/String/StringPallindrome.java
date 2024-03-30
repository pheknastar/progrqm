package String;

public class StringPallindrome {

	public static void main(String[] args) {
		String s = "madam";
		String rev = "";
		for (int i = s.length()-1; i >=0; i--) {
			rev = rev+s.charAt(i);
		}
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("pallindrome");
		}else {
			System.out.println("not pallindrome");
		}
	}
}
