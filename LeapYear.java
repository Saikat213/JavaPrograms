package introPrograms;

import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int yr;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter year: ");
		yr=s.nextInt();

		if(yr%4==0 && yr%100!=0) {
			System.out.println("Leap yr");
			}
		else if(yr%400==0 && yr%100==0)  {
			System.out.println("Leap yr");
			}
		else  {
			System.out.println("Not leap yr");
		}
	}

}
