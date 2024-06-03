package task;

public class ReverseProjectRotation {

	public static void main(String[] args) {
		String s = "I am from Bangalore";
		String[] s1 = s.split(" ");
		
		for (int i = 0; i < s1.length; i++)
		{
			String temp = s1[0];
			for (int j = 0; j < s1.length-1; j++)
			{
				s1[j] = s1[j+1];
			}
			s1[s1.length-1] = temp;
			
			for (int j = 0; j < s1.length; j++) 
			{
				System.out.print(s1[j]+" ");
			}
			System.out.println();
		}
	}
}
