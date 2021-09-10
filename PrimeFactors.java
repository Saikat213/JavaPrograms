package introPrograms;

import java.util.Scanner;
public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num, i, j, flag=0, counter=0;
			Scanner s=new Scanner(System.in);
			System.out.print("Enter Number to find prime factors: ");
			num=s.nextInt();
			
			if(num%2==0)
			{
				System.out.println("2");
			}
			
			for(i=3;i<=num/2;i++)
			{
				if(num%i==0)
				{
					counter=1;
					for(j=2;j<i;j++)
					{
						if(i%j==0)
						{
							flag=1;
							break;
						}
					}
					if(flag==0)
					{
						System.out.println(i);
					}
				}
			}
			if(counter==0)
			{
				System.out.print("No other prime factors except 1 and "+num);
			}
	}

}
