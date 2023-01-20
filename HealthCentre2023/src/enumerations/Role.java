package enumerations;

public enum Role {
	patient,
	doctor,
	nurse;
	
	public static Role valueOf(int a) {
		switch (a) {
		case 1:
			return patient;
		case 2:
			return doctor;
		default:
			return nurse;
		}
	}
	
	public static int toInt(Role role) {
		switch (role) {
		case patient:
			return 1;
		case doctor:
			return 2;
		default:
			return 3;
		}
	}
}
