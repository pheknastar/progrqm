package pattern;

public class AmdoxPattern {

	public static void main(String[] args) {
		int n = 4;
		int n1 = n+1;
		for(int i = 1; i<=n ; i++) {
			int k = 1;
			for(int j = 1 ; j<=n*2-1 ; j++) {
				if(i+j>=n+1 && j-i<=n-1 && i+j==n1) {
					System.out.print(k+" ");
					n1 = n1+2;
					if(j<n) {
						k++;
					}else {
						k--;
					}
				}else {
				System.out.print("  ");
				}
			}
			System.out.println();
			n1 = n+1;
		}
	}
}
