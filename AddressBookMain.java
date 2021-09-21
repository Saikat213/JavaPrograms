package introPrograms;

import java.util.Scanner;

public class AddressBookMain {
	
	private final static Scanner s1 = new Scanner(System.in);
	private int noOfContacts;
	private AddressBook[] bookArray;
	
	public AddressBookMain() {
		bookArray = new AddressBook[5];
	}

	
	private void createContact() {
			
			System.out.println("Enter First Name: ");
			String first = s1.next();
			System.out.println("Enter Last Name: ");
			String last = s1.next();
			System.out.println("Enter Address: ");
			String addr = s1.next();
			System.out.println("Enter City: ");
			String ct = s1.next();
			System.out.println("Enter Email: ");
			String email = s1.next();
			System.out.println("Enter State: ");
			String state = s1.next();
			System.out.println("Enter Zip: ");
			int zip = s1.nextInt();
			System.out.println("Enter Phn Number: ");
			int phnN = s1.nextInt();
			bookArray[noOfContacts] = new AddressBook(first, last, addr, ct, email,
													state, zip, phnN);
			noOfContacts++;
	}
	
	private void displayContact() {
		for(int i=0;i<noOfContacts;i++) {
			AddressBook ab = this.bookArray[i];
			System.out.println(ab.toString());
		}
	}
	
	private AddressBook searchContact(String first) {
		
		int i, flag=0;
		for(i=0;i<noOfContacts;i++) {		
			if(first.equals(this.bookArray[i].firstName)) {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			return null;
		}
		return this.bookArray[i];
	}
	
	private void editContact(String first) {
		
		String update="";
		int upd=0;
		AddressBook ab = searchContact(first);
		if(ab!=null) {
			System.out.println("Which data to update: ");
			int ch = s1.nextInt();
			switch(ch) {
			case 1: 
				System.out.println("Enter first name: ");
				update = s1.next();
				ab.firstName=update;
				break;
				
			case 2: 
				System.out.println("Enter last name: ");
				update = s1.next();
				ab.lastName=update;
				break;
				
			case 3: 
				System.out.println("Enter address : ");
				update = s1.next();
				ab.address=update;
				break;
				
			case 4: 
				System.out.println("Enter city: ");
				update = s1.next();
				ab.city=update;
				break;
				
			case 5: 
				System.out.println("Enter email: ");
				update = s1.next();
				ab.email=update;
				break;
				
			case 6: 
				System.out.println("Enter state: ");
				update = s1.next();
				ab.state=update;
				break;
				
			case 7: 
				System.out.println("Enter zip: ");
				upd = s1.nextInt();
				ab.zip=upd;
				break;
				
			case 8: 
				System.out.println("Enter phone : ");
				upd = s1.nextInt();
				ab.phn=upd;
				break;
				
			default:
				System.out.println("Invalid Option");
			}
		}
		else {
			System.out.println("Data not found");
		}
	}
	
	private void deleteContact(String name) {
		
		int flag=0;
		for(int i=0;i<noOfContacts;i++) {		
			if(name.equals(this.bookArray[i].firstName)) {
				bookArray[i]=null;
				noOfContacts--;
				flag=1;
				System.out.println("Data deleted");
				break;
			}
		}
			
		if(flag==0) {
			System.out.println("Data not found");
		}
	}
	
	public static void main(String[] args) {

		AddressBookMain abm = new AddressBookMain();
		
		System.out.println("Welcome to Address Book...");
		do {
			System.out.println("Enter 1. Create Contact\n2. Edit Contact\n3. Delete Contact\n4.Display Contact\n5. Terminate\nEnter Choice: ");
			int ch = s1.nextInt();
			switch(ch) {
			case 1:
				abm.createContact();
				break;
				
			case 2:
				System.out.println("Enter Name to search for contact: ");
				String data = s1.next();
				abm.editContact(data);
				break;
				
			case 3: 
				System.out.println("Enter Name to delete contact: ");
				data = s1.next();
				abm.deleteContact(data);
				break;
				
			case 4:
				abm.displayContact();
				break;
				
			case 5:
				s1.close();
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid Option");
			}
		}while(true);
	}	
}