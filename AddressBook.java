package introPrograms;

public class AddressBook {
	
	String firstName;
	String lastName;
	String address;
	String city;
	String email;
	String state;
	int zip;
	int phn;
	
	public AddressBook(String firstName, String lastName, String address, String city,
								String email, String state, int zip, int phn) {
			
		this.firstName=firstName;
		this.lastName=lastName;
		this.address=address;
		this.city=city;
		this.email=email;
		this.state=state;
		this.zip=zip;
		this.phn=phn;
	}

	@Override
	public String toString() {
		return "AddressBook [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
				+ city + ", email=" + email + ", state=" + state + ", zip=" + zip + ", phn=" + phn + "]";
	}
}
