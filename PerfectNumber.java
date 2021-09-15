package introPrograms;

import java.util.Scanner;
public class PerfectNumber {
	
	private void checkPerfect(int n) {
		
		int i, sum=0;
		for(i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
				sum+=i;
			}
		}
		
		if(n==sum)
		{
			System.out.print("Perfect Number");
		}
		else
		{
			System.out.print("Not Perfect Number");
		}
	}

	public static void main(String[] args) {
	
			int num;
			Scanner s= new Scanner(System.in);
			System.out.print("Enter Number: ");
			num=s.nextInt();
			s.close();
			
			PerfectNumber pn = new PerfectNumber();
			pn.checkPerfect(num);
	}

}
