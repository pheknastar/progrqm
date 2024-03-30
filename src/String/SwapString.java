package String;

public class SwapString {

	public static void main(String[] args) {
		String s = "Hi Hello Welcome To";
		String[] s1 = s.split(" ");
//		String res = "";
//		String f = s1[0],l = s1[s1.length-1];
//		for (int i = 0; i < s1.length; i++) {
//			if(i==0) {
//				res = res+l+" ";
//			}else if(i==s1.length-1) {
//				res = res+f+" ";
//			}else {
//				res = res+s1[i]+" ";
//			}
//		}
//		System.out.println(res);
		
		String temp = s1[0];
		s1[0]=s1[s1.length-1];
		s1[s1.length-1]=temp;
		for (int i = 0; i < s1.length; i++) {
			System.out.print(s1[i]+" ");
		}
	}
}
