package String;

public class WordShouldReverseInSamePos {

	public static void main(String[] args) {
		String s = "Hi Hello Welcome To";
		String[] s1 = s.split(" ");
		
		for (int i = 0; i < s1.length; i++) {
			String s2 = s1[i];
			
//			String rev = "";
//				for (int j = 0; j < s2.length(); j++) {
//					rev = s2.charAt(j) + rev;
//			}
//				System.out.print(rev+" ");
			
			for (int j = s2.length()-1; j >=0 ; j--) {
				System.out.print(s2.charAt(j));
			}
			System.out.print(" ");
		}
	}
}
