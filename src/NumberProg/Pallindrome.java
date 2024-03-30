package NumberProg;

public class Pallindrome {

	public static void main(String[] args) {
		int n = 121;
		int temp = n , sum = 0;
		while(n>0) {
			int l = n%10;
			sum = (sum*10)+l;
			n = n/10;
		}
		if(temp == sum) {
			System.out.println(temp+" is Pallindrome no");
		}else {
			System.out.println(temp+" is not Pallindrome no");
		}
	}
}
