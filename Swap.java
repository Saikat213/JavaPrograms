package introPrograms;

import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num1, num2, temp;
			Scanner s=new Scanner(System.in);
			System.out.print("Enter 1st number: ");
			num1=s.nextInt();
			System.out.print("Enter 2nd number: ");
			num2=s.nextInt();
			
			temp=num1;
			num1=num2;
			num2=temp;
			
			System.out.print("Numbers after Swapping--> num1: "+num1+" num2: "+num2);
	}

}
