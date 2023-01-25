package employeePackage;

import basicPackage.Employee;
import enumerations.Gender;
import enumerations.Role;
import enumerations.Service;

public class Doctor extends Employee {
	private String expertise;
	
	public Doctor() {
		this.expertise = "";
	}

	public Doctor(String name, String surname, String personId, Gender gender, String address, String telNumber,
			String username, String password, Role role, int payment, Service service, String expertise) {
		super(name, surname, personId, gender, address, telNumber, username, password, role, payment, service);
		this.expertise = expertise;
	}
	
	public Doctor(Doctor original) {
		this.expertise = original.expertise;
	}

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

	@Override
	public String toString() {
		return "Doctor "
				+ "expertise=" + expertise + 
				", payment=" + payment + 
				", service=" + service + 
				", name=" + name
				+ ", surname=" + surname + 
				", personId=" + personId + 
				", gender: " + gender + 
				", address: " + address
				+ ", telNumber: " + telNumber + 
				", username: " + username + 
				", password: " + password + 
				", role: " + role
				+ " ";
	}
	
	
	

}
