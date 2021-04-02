package Empsys;

public class Employee {
	private int empId;
	private String empName;
	private String projectName;

	private int exp;

	private int salary;
	/*
	 * trigger if (exp is less than 3) :- salary should not be greater than 3000
	 * 
	 * Salary > 20000 :- Error
	 * 
	 */

	public Employee() {
		empId = -1;
		empName = " No Name Set";
		salary = -1;
		projectName = " No Project Allocate";
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public void SalaryCalculation ()
	{
		int exp = getExp();
		if (exp < 3)
			setSalary(3000);
		else if (exp >= 3 && exp <6)
			setSalary(10000);
		else if (exp >= 6 && exp <=10)
			setSalary(15000);
		else if (exp > 10)
			setSalary(20000);
	}

	

	


	public Employee(int empId, String empName, String projectName, int exp) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.projectName = projectName;
		this.exp = exp;
		SalaryCalculation();
		
	}






	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	/* Business Method / operation */
	public void workingOnProject() {
		// 1000 lines of code ...
		System.out.println(empName + " working on " + "" + projectName);

	}

}
