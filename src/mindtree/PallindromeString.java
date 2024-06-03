package mindtree;

public class PallindromeString {

	public static void main(String[] args) {
		String s = "madam";
		String sum = "";
		for(int i = s.length()-1; i>=0; i--) {
			sum = sum+s.charAt(i);
		}if(sum.equals(s)) {
			System.out.println("string is pallindrome");
		}else {
			System.out.println("string is not pallindrome");
		}
	}
}
