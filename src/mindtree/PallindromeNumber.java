package mindtree;

public class PallindromeNumber {

	public static void main(String[] args) {
		int n = 121;
		int temp = n;
		int sum = 0;
		while(n>0) {
			int l = n%10;
			sum = (sum*10)+l;
			n = n/10;
		}if(temp == sum) {
			System.out.println("no is pallindrome");
		}else {
			System.out.println("no is not pallindrome");
		}
	}
}
