package basicPackage;

import enumerations.Gender;
import enumerations.Role;
import enumerations.Service;

public class Employee extends Person {
	protected int payment;
	protected Service service;
	
	public Employee() {
		this.payment = 0;
		this.service = Service.General_Medicine_Service;
	}
	
	
	public Employee(String name, String surname, String personId, Gender gender, String address, String telNumber,
			String username, String password, Role role, int payment, Service service) {
		super(name, surname, personId, gender, address, telNumber, username, password, role);
		this.payment = payment;
		this.service = service;
	}

	public Employee(Employee original) {
		this.payment = original.payment;
		this.service = original.service;
	}

	public int getPayment() {
		return payment;
	}


	public void setPayment(int payment) {
		this.payment = payment;
	}


	public Service getService() {
		return service;
	}


	public void setService(Service service) {
		this.service = service;
	}


	@Override
	public String toString() {
		return "Employee payment: " + payment + 
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