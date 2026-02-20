package PayPro;

import java.util.Scanner;

public class EmployeeInfo {
	static int  id;
	static String name;
	
	static String address;
	static String contact;
	static String department;
	static double basicSalary;
	
	
	public void GetEmpDetail() {
		Scanner s=new Scanner(System.in);
		System.out.println("                   Employee Salary Management");
		 System.out.println("   ");
		 System.out.println("   ");
		System.out.print("    Enter ID: ");
		id=s.nextInt();
		 s.nextLine(); 
		System.out.print("    Enter Name: ");
		name=s.nextLine();
		System.out.print("    Enter Address: ");
		address=s.nextLine();
		System.out.print("    Enter Contact Number: ");
		contact=s.nextLine();
	    System.out.print("    Enter Department: ");
	    department=s.nextLine();
	    System.out.print("    Enter Basic Salary: ");
        basicSalary=s.nextDouble();
        
        System.out.println("                   Employee added successfully");
        System.out.println("   ");
        System.out.println("   ");
       
      
	}

//	public void DisplayEmpDetail() {
//		System.out.println("                    Showng employee details");
//		
//		 System.out.println("   ");
//		 System.out.println("   ");
//		System.out.println("    ID: "+id);
//		System.out.println("    Name: "+name);
//		System.out.println("    Address: "+address);
//		System.out.println("    Contact Number: "+contact);
//		System.out.println("    Department: "+department);
//		System.out.println("    Basic Salary: "+basicSalary);
//	}

}
