package mindtree;

import java.util.LinkedHashMap;

public class PrintIndexOfSumEqualsTarget {

	public static void main(String[] args) {
		int[] a = { 2, 7, 4, 5, 6, 3, 9, 7, 1 };
		int sum = 0;
		int target = 10;
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				sum = a[i] + a[j];
				if (sum == target) {
					if (!map.containsKey(a[i]) && !map.containsValue(a[i]))
						map.put(a[i], a[j]);
					// System.out.println("index are " + i + " " + j);
					// System.out.println("position are " + (i + 1) + " " + (j + 1));
					// System.out.println("sum are " + a[i] + " " + a[j]);
				}
			}
		}
		System.out.println(map);
	}
}
