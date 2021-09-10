package introPrograms;

import java.util.Scanner;
public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			char ch,ch1;
			System.out.print("Enter chararter: ");
			Scanner s=new Scanner(System.in);
			ch=s.next().charAt(0);
			ch=Character.toUpperCase(ch);
			
			switch(ch)
			{
			case 'A' : 
				System.out.print("Vowel");
				break;
			case 'E' : 
				System.out.print("Vowel");
				break;
			case 'I' : 
				System.out.print("Vowel");
				break;
			case 'O' : 
				System.out.print("Vowel");
				break;
			case 'U' : 
				System.out.print("Vowel");
				break;
			default : 
				System.out.print("Consonant");
			}
	}

}
