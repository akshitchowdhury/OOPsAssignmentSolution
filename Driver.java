/**
 * 
 */
package Drivermain;

//Importing packages of Admndept, Hrdepartment, Techdepartment onto Driver class respectively//

import com.Admindept.Admindepartment;
import com.HRdept.HRdepartment;
import com.Techdept.Techdept;

/**
 * @author Pratikshit Chowdhury
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating object 'ad' and connecting with Admindepartment Class
		//
		Admindepartment ad = new Admindepartment();
		ad.departmentNAme();
		ad.getTodaysWork();
		ad.getWorkDeadline();
		ad.isTodayAHoliday();
		
		System.out.println( "    ");
		
		//Creating object 'hr' and connecting with Hrdepartment Class
		//
		
		HRdepartment hr = new HRdepartment();
		hr.departmentNAme();
		hr.doActvity();
		hr.getTodaysWork();
		hr.getWorkDeadline();
		hr.isTodayAHoliday();
		
		System.out.println( "    ");
		
		
		//Creating object 'tc' and connecting with Techdepartment Class
	    //
		Techdept tc = new Techdept();
		tc.departmentNAme();
		tc.getTodaysWork();
		tc.getWorkDeadline();
		tc.getTechStackInformation();
		tc.isTodayAHoliday();
	}

}
