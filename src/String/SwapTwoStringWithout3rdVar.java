package String;

public class SwapTwoStringWithout3rdVar {

	public static void main(String[] args) {
		String s = "java";
		String s1 = "coding";
		System.out.println("Before Swapping : "+s+" "+s1);
		s = s + s1;
		s1 = s.substring(0, s.length() - s1.length());
		s = s.substring(s1.length());
		System.out.println("After Swapping  : "+s+" "+s1);
	}
}
