package Empsys;

import java.util.Scanner;

import Student.Student;

public class HRSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		do {
			System.out.println("Enter Employee Name:");
			String nam = sc.nextLine();
			System.out.println("Enter Project Name:");
			String pro = sc.nextLine();
			
			System.out.println("Enter Employee ID:");
			int Id = sc.nextInt();
			System.out.println("Enter Employee experience:");
			int exp = sc.nextInt();
			
			
		Employee Emp = new Employee(Id, nam, pro, exp);
		/*System.out.println("Name"+Emp.getEmpName());
		System.out.println("ID"+Emp.getEmpId());
		System.out.println("Project Name"+Emp.getProjectName());
		System.out.println("Salary"+Emp.getSalary());*/
		Emp.workingOnProject();
		System.out.println("The salary of the employee is;"+Emp.getSalary());
		System.out.println(" Do u want to exe more <0 for exit>");
		choice = sc.nextInt();
		
		}while (choice != 0);		

	}

}
