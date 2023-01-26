package patientPackage;

import basicPackage.Person;
import cardPackage.HealthCard;
import employeePackage.Doctor;
import enumerations.Gender;
import enumerations.Role;

public class Patient extends Person {
	private Doctor chosenDoctor;
	private HealthCard healthCard;
	
	public Patient() {
		this.chosenDoctor = null;
		this.healthCard = null;
	}
	
	public Patient(String name, String surname, String personId, Gender gender, String address, String telNumber,
			String username, String password, Role role, Doctor chosenDoctor, HealthCard healthCard) {
		super(name, surname, personId, gender, address, telNumber, username, password, role);
		this.chosenDoctor = chosenDoctor;
		this.healthCard = healthCard;
	}
	
	public Patient(Patient original) {
		this.chosenDoctor = original.chosenDoctor;
		this.healthCard = original.healthCard;
	}

	public Doctor getChosenDoctor() {
		return chosenDoctor;
	}

	public void setChosenDoctor(Doctor chosenDoctor) {
		this.chosenDoctor = chosenDoctor;
	}

	public HealthCard getHealthCard() {
		return healthCard;
	}

	public void setHealthCard(HealthCard healthCard) {
		this.healthCard = healthCard;
	}

	@Override
	public String toString() {
		return "Patient "
				+ "chosenDoctor: " + chosenDoctor + 
				", healthCard: " + healthCard + 
				", name: " + name + ", "
				+ "surname: " + surname + 
				", personId: " + personId + 
				", gender: " + gender + 
				", address: " + address + 
				", telNumber: " + telNumber + 
				", username: " + username + 
				", password: " + password + 
				", role: " + role + " ";
	}
}