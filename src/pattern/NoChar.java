package pattern;

public class NoChar {

	public static void main(String[] args) {
		int n = 5;
		char c = 'A';
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(c +" ");
			}
			c++;
			System.out.println();
		}
		System.out.println("-------------");
		for (int i = 1; i <= n; i++) {
			char c1 = 'A';
			for (int j = 1; j <= n; j++) {
				System.out.print(c1+" ");
				c1++;
			}
			System.out.println();
		}
		System.out.println("-------------");
		char c2 = 'A';
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i>=j)
				System.out.print(c2+" ");
			}
			c2++;
			System.out.println();
		}
		System.out.println("-------------");
		char c3 = 'A';
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i+j>=n+1) {
				System.out.print(c3+" ");
				}else {
					System.out.print("  ");
				}
			}
			c3++;
			System.out.println();
		}
		System.out.println("-------------");
		char c4 = 'E';
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i>=j) {
				System.out.print(c4 +" ");
				}else {
					System.out.print("  ");
				}
			}
			c4--;
			System.out.println();
		}
		System.out.println("-------------");
		char c5 = 'A';
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n*2-1; j++) {
				if(i+j>=n+1 && j-i<=n-1) {
				System.out.print(c5 +" ");
				}else {
					System.out.print("  ");
				}
			}
			c5++;
			System.out.println();
		}
		System.out.println("-------------");
		for (int i = 1; i <= n; i++) {
			char c6 = 'A';
			for (int j = 1; j <= n*2-1; j++) {
				if(i+j>=n+1 && j-i<=n-1) {
				System.out.print(c6 +" ");
				if(j<n) {
					c6++;
				}else {
					c6--;
				}
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
