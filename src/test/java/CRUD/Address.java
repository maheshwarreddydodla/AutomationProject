package CRUD;

public class Address {
	
	private String firstName;
	private String lastName;
	private String address1;
	private String city;
	private String zipCode;
	
	public Address(String firstName,String lastName,String address1,String city,String zipCode)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.address1=address1;
		this.city=city;
		this.zipCode=zipCode;
		
	}
	

	public Address() {
		// TODO Auto-generated constructor stub
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address1;
	}

	public void setAddress(String address) {
		this.address1 = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	

}
