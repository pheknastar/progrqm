package String;

public class acbfce {

//	public static void main(String[] args) {
//		String s = "a1c1e1";
//		for(int i=0; i<s.length(); i=i+2) {
//			char ch = s.charAt(i);
//			String str = s.charAt(i+1)+"";
//			int val = Integer.parseInt(str);
//			System.out.print(ch);
//			char ch1 = (char) (ch+val);
//			System.out.print(ch1);
//		}
//	}
	
	public static void main(String[] args) {
		String s = "a1c1e2";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch >= '0' && ch <= '9') {
				char ch1 = (char)(s.charAt(i-1)+(ch-48));
				System.out.print(ch1);
			}else {
				System.out.print(ch);
			}
		}
	}
}
