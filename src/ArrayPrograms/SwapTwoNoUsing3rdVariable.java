package ArrayPrograms;

public class SwapTwoNoUsing3rdVariable {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
//		int c = a;
//
//		a = b;
//		b = c;
//		System.out.println(a);
//		System.out.println(b);
		

		System.out.println("Before Swapping : "+a+"  "+b);
		
		a = a+b;//30
		b = a-b;
		a = a-b;

		System.out.println("After Swapping  : "+a+"  "+b);
	}
}
