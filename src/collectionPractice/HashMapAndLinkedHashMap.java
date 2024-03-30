package collectionPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class HashMapAndLinkedHashMap {

	public static void main(String[] args) {
		//HashMap<Integer, Object> tab = new HashMap<Integer, Object>();
		LinkedHashMap<Integer, Object> tab = new LinkedHashMap<Integer, Object>();
		tab.put(10, 'A');
		tab.put(20, "hi");
		tab.put(30, 'A');
		tab.put(null, null);
		tab.put(50, null);
		System.out.println(tab);
		System.out.println(tab.containsKey(30));
		System.out.println(tab.containsValue('B'));
		System.out.println(tab.replace(50, "Patty"));
		for (Entry<Integer, Object> m : tab.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
