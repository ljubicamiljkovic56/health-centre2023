package checkPackage;

import java.util.Date;

import employeePackage.Doctor;
import enumerations.Status;
import patientPackage.Patient;

public class HealthCheck {
	protected Patient patient;
	protected Doctor doctor;
	protected Date checkDate;
	protected String room;
	protected String description;
	protected Status status;
	
	public HealthCheck() {
		this.patient = null;
		this.doctor = null;
		this.checkDate = null;
		this.room = "";
		this.description = "";
		this.status = Status.finished;
	}
	
	public HealthCheck(Patient patient, Doctor doctor, Date checkDate, String room, String description, Status status) {
		super();
		this.patient = patient;
		this.doctor = doctor;
		this.checkDate = checkDate;
		this.room = room;
		this.description = description;
		this.status = status;
	}
	
	public HealthCheck(HealthCheck original) {
		this.patient = original.patient;
		this.doctor = original.doctor;
		this.checkDate = original.checkDate;
		this.room = original.room;
		this.description = original.description;
		this.status = original.status;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Date getCheckDate() {
		return checkDate;
	}

	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}
	
	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "HealthCheck [patient=" + patient + ", doctor=" + doctor + ", checkDate=" + checkDate + ", room=" + room
				+ ", description=" + description + ", status=" + status + "]";
	}
}