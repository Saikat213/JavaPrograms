package introPrograms;

import java.util.Scanner;
public class QuotientRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num1, num2, quotient, remainder;
			System.out.print("Enter 2 numbers: ");
			Scanner s=new Scanner(System.in);
			
			num1=s.nextInt();
			num2=s.nextInt();
			
			quotient=num1/num2;
			remainder=num1%num2;
			
			System.out.print("Quotient: "+quotient+" Remainder: "+remainder);
	}

}
