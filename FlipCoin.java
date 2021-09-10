package introPrograms;

import java.util.Scanner;
public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int times,i; 
		double value, tails=0,heads=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter no. of times to flip coin: ");
		times=s.nextInt();
		
		for(i=0;i<times;i++)
		{
			value=Math.random();
		
			if(value<0.5)
			{
				tails+=1;
			}
			else
			{
				heads+=1;
			}
		}
		double perc=(heads/tails)*100;
		System.out.print(perc);
	}

}
