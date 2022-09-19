package employee;

public class Problem2 {

	public static void main(String[] args) {
		Employee employee1 = new Employee(101, "John Doe", "IT", 5000);
		Employee employee2 = new Employee(101, "John Doe", "ME", 6000);
		
		if(employee1.equals(employee2))
			System.out.println("Employees have same name and same employee Id");
		else
			System.out.println("Employees are different");
	}

}
