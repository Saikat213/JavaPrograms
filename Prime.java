package introPrograms;

import java.util.Scanner;
public class Prime {

	private void checkPrime(int n) {
		
		int i, flag=0;
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.print("Not prime");
		}
		else
		{
			System.out.print("Prime");
		}
	}
	
	public static void main(String[] args) {
			int num;
			Scanner s=new Scanner(System.in);
			System.out.print("Enter number: ");
			num=s.nextInt();
			s.close();
			
			Prime ob = new Prime();
			ob.checkPrime(num);
	}

}
