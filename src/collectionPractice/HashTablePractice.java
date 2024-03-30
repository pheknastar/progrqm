package collectionPractice;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTablePractice {

	public static void main(String[] args) {
		Hashtable<Integer, Object> tab = new Hashtable<Integer, Object>();
		tab.put(10, 'A');
		tab.put(20, "hi");
		tab.put(30, 'A');
		tab.put(40, 80);
		tab.put(50, "hi");
		System.out.println(tab);
		System.out.println(tab.containsKey(30));
		System.out.println(tab.containsValue('B'));
		System.out.println(tab.replace(50, "Patty"));
		for (Entry<Integer, Object> m : tab.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
