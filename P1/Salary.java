package P1;

import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
	
			double basicSal,hra,da,totalSal,tax,pmsalary;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Basic Salary");
			basicSal= sc.nextDouble();
			
			hra= basicSal*0.4;
			da= 0.6*(basicSal+hra);
			pmsalary = basicSal+hra+da;
			totalSal = (basicSal+hra+da)*12;
			
			if(totalSal<200000)
				tax=0;
			else if(totalSal>=200000 && totalSal<=600000)
				tax= (totalSal-200000)*0.1;
			
			else
				tax=((totalSal-600000)*0.2)+(400000*0.1)+0;
			
			double totalSalary= totalSal-tax;
			System.out.println("Total monthly SALARY= "+pmsalary);
			System.out.println("HRA= "+hra);
			System.out.println("DA= "+da);
			System.out.println("TAX= "+tax);
			System.out.println("Yearly Salary="+totalSal);
			System.out.println("Total Yearly Salary with tax= "+totalSalary);
			
}
}