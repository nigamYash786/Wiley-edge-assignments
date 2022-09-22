package employee;

public class Employee {
	private int empId;
	private String empName;
	private String empDept;
	private double empBasicSalary;
	private double empGrossSalary;

	public Employee(int empId, String empName, String empDept, double empBasicSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empBasicSalary = empBasicSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpDept() {
		return empDept;
	}

	public double getEmpBasicSalary() {
		return empBasicSalary;
	}

	public double getEmpGrossSalary() {
		this.empGrossSalary = EmployeeUtility.calculateGrossSalary(this.empBasicSalary);
		return this.empGrossSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", empBasicSalary="
				+ empBasicSalary + ", empGrossSalary=" + empGrossSalary + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Employee employee = (Employee) obj;
		return this.empId == employee.empId && this.empName == employee.empName;
	}

}
