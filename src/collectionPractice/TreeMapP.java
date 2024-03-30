package collectionPractice;

import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapP {

	public static void main(String[] args) {
		TreeMap<Integer, Object> te = new TreeMap<Integer, Object>();
		te.put(10, 'A');
		te.put(40, "hi");
		te.put(10, 7);
		te.put(30, null);
		te.put(50, null);
		System.out.println(te);
		System.out.println(te.containsKey(30));
		System.out.println(te.containsValue('B'));
		System.out.println(te.replace(50, "Patty"));
		for (Entry<Integer, Object> m : te.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
