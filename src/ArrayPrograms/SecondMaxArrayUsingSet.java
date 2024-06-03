package ArrayPrograms;

import java.util.*;

public class SecondMaxArrayUsingSet {

	public static void main(String[] args) {
		int[] a = {2,5,6,10,3,7,7,10,5};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		System.out.println(set);
		int max = 0, max2 = 0, max3=0;
		for (Integer i : set) {
			if(i > max) {
				max2 = max;
				max = i;
			}else if(i > max2){
				max3 = max2;
				max2 = i;
			}else if(max3 > i) {
				max3 = i;
			}
		}
		System.out.println(max);
		System.out.println(max2);
		System.out.println(max3);
	}
}
