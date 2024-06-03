package String;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class a2b2a3c1_Prakash {

	public static void main(String[] args) {
		String s = "a4b3d2c1";
		// o/p = aabbaaac;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {
				int n = (ch - 48);
				for (int j = 0; j < n; j++) {
					System.out.print(s.charAt(i-1));
				}
			}
		}
//		LinkedHashMap<Character, Character> map = new LinkedHashMap<Character, Character>();
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
//				map.put(s.charAt(i - 1), s.charAt(i));
//		}
//		int n = 0;
//		for (Entry<Character, Character> m : map.entrySet()) {
//			if (m.getValue() >= '0' && m.getValue() <= '9')
//			n = (m.getValue() - 48);
//			for (int j = 0; j < n; j++) {
//				System.out.print(m.getKey());
//			}
//		}
	}
}
