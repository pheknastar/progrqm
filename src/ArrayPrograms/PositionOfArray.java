package ArrayPrograms;

public class PositionOfArray {

	public static void main(String[] args) {
		int[] a = {2,5,6,10,3,7};
		int max = a[0],pos = 0,pos1 = 0,max2 = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
				pos = i+1;
			}else if(a[i] > max2) {
				max2 = a[i];
				pos1 = i+1;
			}
		}
		System.out.println(max2+"---"+pos1);
		System.out.println(max+"---"+pos);
	}
}
