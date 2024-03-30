package collectionPractice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(35);
		list1.add(40);
		list1.add(15);
		list1.add(55);
		Collections.sort(list1);
		System.out.println(list1);
		ArrayList<Object> list = new ArrayList<Object>(list1);
		list.add(10);
		list.add("A");
		list.add("hi");
		list.add(10);
		list.add(null);
		list.add(null);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.contains("hi"));
		System.out.println(list.indexOf("hi"));
		list.remove("A");
		System.out.println(list);
		
	}
}
