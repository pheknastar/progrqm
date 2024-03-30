package collectionPractice;

import java.util.LinkedList;

public class LinkedListP {

	public static void main(String[] args) {
		LinkedList<Object> list = new LinkedList<Object>();
		list.add(10);
		list.add('A');
		list.add("hi");
		list.add(10);
		list.add(null);
		list.add(null);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.contains("hi"));
		System.out.println(list.indexOf("hi"));
		list.remove('A');
		System.out.println(list);
		list.addFirst(7);
		list.addLast("hello");
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list);
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
