package introPrograms;

import java.util.Scanner;
public class PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n, i, table;
			Scanner s=new Scanner(System.in);
			System.out.print("Enter value of N: ");
			n=s.nextInt();
			
			if(n>=0 && n<31)
			{
				for(i=1;i<=n;i++)
				{
					table=(int)Math.pow(2, i);
					System.out.println(table);
				}
			}
	}

}
