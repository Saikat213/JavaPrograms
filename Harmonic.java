package introPrograms;

import java.util.Scanner;
public class Harmonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n, i;
			double harmonic=0.0;
			Scanner s=new Scanner(System.in);
			System.out.print("Enter value of n: ");
			n=s.nextInt();
			
			if(n>0)
			{
				for(i=1;i<=n;i++)
				{
					harmonic+=(double)1/i;
				}
				System.out.print(n+"th harmonic number: "+harmonic);
			}
			else
			{
				System.out.println("N value must be greater than 0");
			}
	}

}
