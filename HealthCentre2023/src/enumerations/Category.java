package enumerations;

public enum Category {
	first,
	second,
	third;
	
	public static Category valueOf(int a) {
		switch (a) {
		case 1:
			return first;
		case 2:
			return second;
		default:
			return third;
		}
	}
	
	public static int toInt(Category category) {
		switch (category) {
		case first:
			return 1;
		case second:
			return 2;
		default:
			return 3;
		}
	}

}
