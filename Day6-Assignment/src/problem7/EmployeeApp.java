package problem7;

public class EmployeeApp {

	public static void main(String[] args) {

		Address temporaryAddress = new Address(110, "Radha Krishna", "Juhu-Mumbai", "Mumbai");
		Address permanentAddress = new Address(110, "Radha Krishna", "Juhu-Mumbai", "Mumbai");

		Employee employee = new Employee(101, "John Doe", temporaryAddress, permanentAddress);
		System.out.println(employee);
		
	}

}
