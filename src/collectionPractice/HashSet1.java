package collectionPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet<Object> set = new HashSet<Object>();
		set.add('A');
		set.add(null);
		set.add("hi");
		set.add(null);
		set.add('A');
		set.add(10);
		System.out.println(set);
		ArrayList<Object> list = new ArrayList<Object>(set);
		list.add('A');
		list.add(null);

		Iterator<Object> i = list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
