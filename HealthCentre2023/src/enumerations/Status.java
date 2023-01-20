package enumerations;

public enum Status {
	requested,
	scheduled,
	canceled,
	finished;
	
	public static Status valueOf(int a) {
		switch (a) {
		case 1:
			return requested;
		case 2:
			return scheduled;
		case 3:
			return canceled;
		default:
			return finished;
		}
	}
	
	public static int toInt(Status status) {
		switch (status) {
		case requested:
			return 1;
		case scheduled:
			return 2;
		case canceled:
			return 3;
		default:
			return 4;
		}
	}

}
