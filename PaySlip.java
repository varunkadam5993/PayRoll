package PayPro;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

	
	import java.io.*;

	public class PaySlip extends Salary {

	    public void generateSlip() throws IOException {
	        File f = new File("resipt.txt");

	        f.createNewFile();
	        
	        FileWriter fw = new FileWriter(f);
	        fw.write("                    Showing employee details\n\n\n");
	        fw.write("    ID             :   " + id + "\n");
	        fw.write("    Name           :   " + name + "\n");
	        fw.write("    Address        :   " + address + "\n");
	        fw.write("    Contact Number :   " + contact + "\n");
	        fw.write("    Department     :   " + department + "\n");
	        fw.write("    Basic Salary   :   " + basicSalary + "\n\n");
	        
	        fw.write("                    Calculating salary for " + name + "\n\n");
	        fw.write("    Present days   :   " + presentDay + "\n");
	        fw.write("    Deductions     :   " + leavesalary + "\n");
	        fw.write("    Bonuses        :   " + bonuses + "\n");
	        fw.write("    Net Salary     :   " + total + "\n");

	        fw.close();
	    
	

	
		
		try(Scanner sc=new Scanner(f);){
			while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
				
			}
		}
	}

	}
	


