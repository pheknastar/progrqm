package String;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class OccurenceOfCharUsingCollection {

	public static void main(String[] args) {
		String s1 = "Hi Hello Hello Welcome To To";
		String[] s = s1.split(" ");
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < s.length; i++) {
			if (map.containsKey(s[i])) {
				map.put(s[i], map.get(s[i]) + 1);
			} else {
				map.put(s[i], 1);
			}
//			map.put(s[i], map.getOrDefault(s[i], 0)+1);
		}
//		System.out.println(map);
		for (Entry<String, Integer> m : map.entrySet()) {
			if (m.getValue() >= 1) {
				System.out.println(m.getKey() + "---" + m.getValue());
			}
		}
	}
}
