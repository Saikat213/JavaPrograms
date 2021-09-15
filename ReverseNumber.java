package introPrograms;

import java.util.Scanner;
public class ReverseNumber {
	
	private int reverse(int n) {
		
		int remainder, reverse=0;
		while(n>0)
		{
			remainder=n%10;
			reverse=reverse*10+remainder;
			n/=10;
		}
		return reverse;
	}

	public static void main(String[] args) {

			int num; 
			Scanner s = new Scanner(System.in);
			System.out.print("Enter Number to reverse: ");
			num=s.nextInt();
			s.close();
			
			ReverseNumber ob = new ReverseNumber();
			System.out.print("Number in Reverse: "+ob.reverse(num));
	}

}
