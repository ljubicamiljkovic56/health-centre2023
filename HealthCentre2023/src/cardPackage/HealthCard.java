package cardPackage;

import java.util.Date;

import enumerations.Category;
import patientPackage.Patient;

public class HealthCard {
	private Patient patient;
	private String cardID;
	private Date expirationDate;
	private Category category;
	
	public HealthCard() {
		this.patient = null;
		this.cardID = "";
		this.expirationDate = null;
		this.category = Category.third;
	}
		
	public HealthCard(Patient patient, String cardID, Date expirationDate, Category category) {
		super();
		this.patient = patient;
		this.cardID = cardID;
		this.expirationDate = expirationDate;
		this.category = category;
	}
	
	public HealthCard(HealthCard original) {
		this.patient = original.patient;
		this.cardID = original.cardID;
		this.expirationDate = original.expirationDate;
		this.category = original.category;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public String getCardID() {
		return cardID;
	}

	public void setCardID(String cardID) {
		this.cardID = cardID;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "HealthCard [patient=" + patient + ", cardID=" + cardID + ", expirationDate=" + expirationDate
				+ ", category=" + category + "]";
	}	
}