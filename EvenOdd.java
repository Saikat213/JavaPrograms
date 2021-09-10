package introPrograms;

import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num;
			System.out.print("Enter number: ");
			Scanner s=new Scanner(System.in);
			num=s.nextInt();			
			
			if(num%2==0)
			{
				System.out.print("Even Number");
			}
			else
			{
				System.out.print("Odd Number");
			}
	}

}