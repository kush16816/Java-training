/**
 * 
 */
package com.empWage;

public class EmpWageUC7 {

	/**
	 * @param args
	 */
	public final static int isFullTime = 1;
	public final static int isPartTime = 2;
	public final static int empRate = 20;
	public final static int workDays = 20;
	public final static int maxMonthHrs = 100;

	public static int calcEmpWage() {
		int empHrs = 0;
		int empWage = 0;
		int totalHrs = 0;
		int totalWage = 0;

		for (int day = 0; (day < workDays)&&(totalHrs < maxMonthHrs); day++) {
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;

			switch (empCheck) {
			case isFullTime:
				empHrs = 8;
				break;
			case isPartTime:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
			}
			empWage = empHrs * empRate;
			totalWage += empWage;
			totalHrs += empHrs;
			System.out.println("Emp Wage is " + empWage);
			System.out.println("Emp Hrs are " + totalHrs);
		}
		System.out.println("Employee Wage is " + totalWage);
		return totalWage;
	}
	
	public static void main(String[] args) {
		
		calcEmpWage();
	}

}
