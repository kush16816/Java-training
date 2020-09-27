/**
 * 
 */
package com.empWage;

public class EmpWageUC2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int isFullTime = 1;
		int empRate = 20;
		
		int empHrs = 0;
		int empWage = 0;

		double empCheck = Math.floor(Math.random() * 10) % 2;
		
		if(empCheck == isFullTime)
			empHrs = 8;
		else
			empHrs = 0;
		empWage = empHrs * empRate;
		System.out.println("Employee Wage is " + empWage);
	}

}
