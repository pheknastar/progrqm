package practice;

public class MaxLength {

	public static void main(String[] args) {
		String s = "I am From Bangalore";
		String[] s1 = s.split(" ");
		String max = "";
		for (int i = 0; i < s1.length; i++) {
			if (s1[i].length() > max.length()) {
				max = s1[i];
			}
		}
		System.out.println(max);
	}
}
