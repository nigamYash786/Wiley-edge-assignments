package employee;

public class Problem1 {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "John Doe", "IT", 50000);
		Employee e2 = new Employee(102, "Rakesh Vij", "CSE", 30000);
		Employee e3 = new Employee(103, "Rupa Chawla", "IT", 10000);
		Employee e4 = new Employee(104, "Preeti Khan", "ECE", 20000);
		Employee e5 = new Employee(105, "Suresh Handa", "ME", 20000);

		Employee[] employees = { e1, e2, e3, e4, e5 };
		EmployeeUtility.sortEmployees(employees);

		EmployeeUtility.searchEmployee(employees, "IT");
	}

}
