package PayPro;

import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
//		EmployeeInfo e=new EmployeeInfo();
//		e.GetEmpDetail();
//	
//		Salary s=new Salary();
//		s.SalaryDetail();
//		e.DisplayEmpDetail();
		Salary emp=new Salary();
		emp.GetEmpDetail();
//		emp.DisplayEmpDetail();
		emp.SalaryDetail();
		PaySlip s=new PaySlip();
		
			s.generateSlip();
		
		
	}

}
