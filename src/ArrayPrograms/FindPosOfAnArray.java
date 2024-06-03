package ArrayPrograms;

import java.util.LinkedHashMap;

public class FindPosOfAnArray {

	public static void main(String[] args) {
		int[] a = {2,5,6,10,3,7,7,10,5};
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if(a[i] == 10)
			System.out.println(a[i]+"---"+(i+1));
		}
	}
}
