package introPrograms;

import java.util.Scanner;

public class greaterNumberAmong3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3;
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		num1=s.nextInt();
		System.out.print("Enter 2nd number: ");
		num2=s.nextInt();
		System.out.print("Enter 3rd number: ");
		num3=s.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.print("Greater Number is "+num1);
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.print("Greater Number is "+num2);
		}
		else
		{
			System.out.print("Greater Number is "+num3);
		}
	}

}
