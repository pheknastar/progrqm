package task;

import java.util.LinkedHashSet;

public class PosOfRepeatedChar {

	public static void main(String[] args) {
		String s = "abacacb";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		System.out.println(set);
		for (Character ch : set) {
			boolean b = false;
			for (int i = 0; i < s.length(); i++) {
				if(ch==s.charAt(i) && b==true) {
					System.out.print((i+1)+" ");
				}else if(ch==s.charAt(i)){
					System.out.print(ch+" ");
					b=true;
				}
			}
			System.out.println();
		}
	}
}
