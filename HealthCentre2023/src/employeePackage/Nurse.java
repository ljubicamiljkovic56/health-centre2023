package employeePackage;

import basicPackage.Employee;
import enumerations.Gender;
import enumerations.Role;
import enumerations.Service;

public class Nurse extends Employee {
	
	public Nurse() {
		super();
	}

	public Nurse(Employee original) {
		super(original);
	}

	public Nurse(String name, String surname, String personId, Gender gender, String address, String telNumber,
			String username, String password, Role role, int payment, Service service) {
		super(name, surname, personId, gender, address, telNumber, username, password, role, payment, service);
	}

	@Override
	public String toString() {
		return "Nurse "
				+ "payment: " + payment + 
				", service: " + service + 
				", name: " + name + 
				", surname: " + surname
				+ ", personId: " + personId + 
				", gender: " + gender + 
				", address: " + address + 
				", telNumber: " + telNumber
				+ ", username: " + username + 
				", password: " + password + 
				", role: " + role + " ";
	}
	

}