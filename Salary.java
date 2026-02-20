package PayPro;

import java.util.Scanner;

public class Salary extends EmployeeInfo {
	static double presentDay;
	static double leaves;
	static double leavesalary;
	static double perdayslaray;
	static double total;
	static double bonuses;
	
	public void SalaryDetail() {
		Scanner s=new Scanner(System.in);
		 System.out.println("   ");
		 System.out.println("   ");
		System.out.print("    enter leaves: ");
		leaves=s.nextDouble();
		
		 perdayslaray=super.basicSalary/26;
		 presentDay = 26 - leaves;
		leavesalary=leaves*perdayslaray;
		bonuses=basicSalary*5/100;
		total=super.basicSalary-leavesalary+bonuses;
		
		
//		System.out.println("                    Calculating salary for "+name);
//		 System.out.println("   ");
//		 System.out.println("   ");
//		System.out.println("    Present days: "+presentDay);
//		System.out.println("    Deductions : "+leavesalary);
//		System.out.println("    bounses: "+bonuses);
//		System.out.println("    Net Salary: "+total);
		

//		System.out.println(super.basicSalary);
		
	}

}
