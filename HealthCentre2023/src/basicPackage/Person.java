package basicPackage;

import enumerations.Gender;
import enumerations.Role;

public class Person {
	protected String name;
	protected String surname;
	protected String personId;
	protected Gender gender;
	protected String address;
	protected String telNumber;
	protected String username;
	protected String password;
	protected Role role;
	
	public Person() {
		this.name = "";
		this.surname = "";
		this.personId = "";
		this.gender = Gender.female;
		this.address = "";
		this.telNumber = "";
		this.username = "";
		this.password = "";
		this.role = Role.nurse;
	}
	
	public Person(String name, String surname, String personId, Gender gender, String address, String telNumber,
			String username, String password, Role role) {
		super();
		this.name = name;
		this.surname = surname;
		this.personId = personId;
		this.gender = gender;
		this.address = address;
		this.telNumber = telNumber;
		this.username = username;
		this.password = password;
		this.role = role;
	}
	
	public Person (Person original) {
		this.name = original.name;
		this.surname = original.surname;
		this.personId = original.personId;
		this.gender = original.gender;
		this.address = original.address;
		this.telNumber = original.telNumber;
		this.username = original.username;
		this.password = original.password;
		this.role = original.role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Person name: " + name + 
				", surname: " + surname + 
				", personId: " + personId + 
				", gender: " + gender + 
				", address: " + address + 
				", telNumber: " + telNumber + 
				", username: " + username + 
				", password: " + password + 
				", role: " + role + " ";
	}

	
}
