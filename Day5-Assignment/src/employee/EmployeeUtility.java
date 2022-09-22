package employee;

public class EmployeeUtility {
	public static double calculateGrossSalary(double empBasicSalary) {
		double hra = 0.12 * empBasicSalary;
		double da = 0.08 * empBasicSalary;
		return empBasicSalary + hra + da;
	}

	public static void sortEmployees(Employee[] employees) {
		System.out.println("Employees in the ascending order of their salaries are:");
		for (int i = 0; i < employees.length; i++) {
			for (int j = i; j < employees.length; j++) {
				if (employees[i].getEmpGrossSalary() > employees[j].getEmpGrossSalary()) {
					Employee temp = employees[j];
					employees[j] = employees[i];
					employees[i] = temp;
				}
			}
		}
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

	public static void searchEmployee(Employee[] employees, String empDept) {
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getEmpDept() == empDept) {
				employees[i].getEmpGrossSalary();
				System.out.println(employees[i]);
			}
		}
	}

}
