package task;

import java.util.HashMap;
import java.util.Map.Entry;

public class OccurenceOfCharUsingCollection1 {

	public static void main(String[] args) {
		int[] s = { 1, 2, 3, 3, 2, 4, 4, 5 };
		int count = 0,max = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < s.length; i++) {
			if (map.containsKey(s[i])) {
				map.put(s[i], map.get(s[i]) + 1);
			} else {
				map.put(s[i], 1);
			}
		}
		for (Entry<Integer, Integer> e : map.entrySet()) {
			if (e.getValue() > 1) {
				if(e.getKey()>max) {
					max = e.getKey();
				}
//				count = 1;
//				System.out.println(e.getKey());
//				System.out.println(e.getKey() + "---" + e.getValue());
			}
		}
//		if (count == 0) {
//			System.out.println("-1");
//		}
		System.out.println(max);
	}
}
