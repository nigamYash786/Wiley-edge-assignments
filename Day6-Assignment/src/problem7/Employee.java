package problem7;

import java.util.Arrays;

public class Employee {
	private int empId;
	private String empName;
	private Address[] empAddresses = new Address[2];
	private Address temporaryAddress;
	private Address permanentAddress;

	public Employee(int empId, String empName, Address temporaryAddress, Address permanentAddress) {
		this.empId = empId;
		this.empName = empName;
		this.temporaryAddress = temporaryAddress;
		this.permanentAddress = permanentAddress;
		this.empAddresses[0] = temporaryAddress;
		this.empAddresses[1] = permanentAddress;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public Address[] getEmpAddresses() {
		return empAddresses;
	}

	public Address getPermanentAddress() {
		return permanentAddress;
	}

	public Address getTenporaryAddress() {
		return temporaryAddress;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddresses=" + Arrays.toString(empAddresses)
				+ ", temporaryAddress=" + temporaryAddress + ", permanentAddress=" + permanentAddress + "]";
	}

}
