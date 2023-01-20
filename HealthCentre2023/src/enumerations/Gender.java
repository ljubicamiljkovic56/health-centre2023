package enumerations;

public enum Gender {
	male,
	female;
	
	public static Gender valueOf(int a) {
		switch (a) {
		case 1:
			return male;
		default:
			return female;
		}
	}
	
	public static int toInt(Gender gender) {
		switch (gender) {
		case male:
			return 1;
		default:
			return 2;
		}
	}

}
