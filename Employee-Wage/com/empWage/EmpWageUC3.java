/**
 * 
 */
package com.empWage;

public class EmpWageUC3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int isFullTime = 1;
		int isPartTime = 2;
		int empRate = 20;
		
		int empHrs = 0;
		int empWage = 0;

		double empCheck = Math.floor(Math.random() * 10) % 3;
		
		if(empCheck == isFullTime)
			empHrs = 8;
		else if(empCheck == isPartTime)
			empHrs = 4;
		else
			empHrs = 0;
		empWage = empHrs * empRate;
		System.out.println("Employee Wage is " + empWage);
	}

}
