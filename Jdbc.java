package PayPro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Jdbc {
	private static final String url="jdbc:mysql://localhost:3306/vk";
	private static final String username="root";
	private static final String password="Varun@2005";

	
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection(url,username,password);
		String query = "INSERT INTO students(id,name,class,mark,gender) VALUES(?,?,?,?,?)";
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("Enter id: ");
			int id = sc.nextInt();
			System.out.println("Enter name: ");
			String name =sc.next();
			System.out.print("    Enter Address: ");
			EmployeeInfo.address=sc.nextLine();
			System.out.print("    Enter Contact Number: ");
			EmployeeInfo.contact=sc.nextLine();
		    System.out.print("    Enter Department: ");
		    EmployeeInfo.department=sc.nextLine();
		    System.out.print("    Enter Basic Salary: ");
	       EmployeeInfo.basicSalary=sc.nextDouble();
			
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, EmployeeInfo.address);
			preparedStatement.setString(4, EmployeeInfo.contact);
			preparedStatement.setString(5, EmployeeInfo.department);
			preparedStatement.setDouble(6, EmployeeInfo.basicSalary);
			preparedStatement.addBatch();
			String choice = null;
			if(choice.toUpperCase().equals("N"));{
				break;
			}
		}
		int[] arr = preparedStatement.executeBatch();
		

	}

}
