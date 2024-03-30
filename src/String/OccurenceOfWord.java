package String;

public class OccurenceOfWord {

	public static void main(String[] args) {
		String s = "Hi Hello Hello Welcome To To";
		String[] st = s.split(" ");
		for (int i = 0; i < st.length; i++) {
			int c = 0;
			for (int j = 0; j < st.length; j++) {
				if(st[i].equals(st[j])) {
					if(i>j) {
						break;
					}else {
						c++;
					}
				}
			}
			if(c>1) {
				System.out.println(st[i]+"---"+c);
			}
		}
	}
}
