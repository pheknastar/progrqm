package pattern;

public class SpacePyramid {

	public static void main(String[] args) {
		int n = 5;
		int n1 = 2;
		for (int i = 1; i <= n; i++) {
			int n2 = n1;
			for (int j = 1; j <= n*2-1; j++) {
				if(i+j<=n*2 && j>=i && i+j==n2) {
					System.out.print("* ");
					n2 = n2+2;
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
			n1 = n1 + 2;
		}
	}
}
