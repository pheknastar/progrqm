package String;

public class ExceptCharPrintDigit {

	public static void main(String[] args) {
		String s = "ab12cd34ef1234";
//		String s1 = s.replaceAll("[^0-9]", " ");
//		String[] s2 = s1.split(" ");
//		for (int i = s2.length-1; i >=0; i--) {
//			System.out.print(s2[i]+" ");
//		}
		String[] s1 = s.split("[^0-9]");
		for (int i = s1.length-1; i >=0; i--) {
			System.out.print(s1[i]+" ");
		}
	}
}
