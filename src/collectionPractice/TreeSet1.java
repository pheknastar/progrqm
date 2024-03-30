package collectionPractice;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(50);
		set.add(42);
		set.add(8);
		set.add(16);
		set.add(55);
		set.add(10);
		System.out.println(set);
		System.out.println(set.descendingSet());

		Iterator<Integer> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
