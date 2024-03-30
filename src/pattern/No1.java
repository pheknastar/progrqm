package pattern;

public class No1 {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("-------------");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("-------------");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i>=j)
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("-------------");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i+j>=n+1) {
				System.out.print(i+" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-------------");
		for (int i = 1; i <= n; i++) {
			int k = 5;
			for (int j = 1; j <= n; j++) {
				if(i>=j) {
				System.out.print(k-- +" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-------------");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n*2-1; j++) {
				if(i+j>=n+1 && j-i<=n-1) {
				System.out.print(i +" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-------------");
		for (int i = 1; i <= n; i++) {
			int k = 1;
			for (int j = 1; j <= n*2-1; j++) {
				if(i+j>=n+1 && j-i<=n-1) {
				System.out.print(k +" ");
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
		}
	}
}
