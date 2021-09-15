package introPrograms;

import java.util.Scanner;
public class Fibonacci {
	
	private void series(int range) {
	
		int i, a=0, b=1, sum=0;
		System.out.print("\n"+a+" "+b);
		
		for(i=2;i<range;i++)
		{
			sum=a+b;
			a=b;
			b=sum;
			System.out.print(" "+sum);
		}
	}

	public static void main(String[] args) {
		
			int range;
			Scanner s = new Scanner(System.in);
			System.out.print("Enter Range of series: ");
			range=s.nextInt();
			s.close();
			
			Fibonacci f = new Fibonacci();
			f.series(range);
	}

}
