package enumerations;

public enum Service {
	General_Medicine_Service,
	Children_Health_Care_Service,
	Dental_Care_Service,
	Workers_Health_Protection_Service,
	Service_For_Legal_and_Economic_Affairs,
	Service_For_Technical_Jobs;
	

	public static Service valueOf(int a) {
		switch (a) {
		case 1:
			return General_Medicine_Service;
		case 2:
			return Children_Health_Care_Service;
		case 3:
			return Dental_Care_Service;
		case 4:
			return Workers_Health_Protection_Service;
		case 5:
			return Service_For_Legal_and_Economic_Affairs;
		default:
			return Service_For_Technical_Jobs;
		}
	}
	
	public static int toInt(Service service) {
		switch (service) {
		case General_Medicine_Service:
			return 1;
		case Children_Health_Care_Service:
			return 2;
		case Dental_Care_Service:
			return 3;
		case Workers_Health_Protection_Service:
			return 4;
		case Service_For_Legal_and_Economic_Affairs:
			return 5;
		default:
			return 6;
		}
	}
}
