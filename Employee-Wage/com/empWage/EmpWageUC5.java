/**
 * 
 */
package com.empWage;

public class EmpWageUC5 {

	/**
	 * @param args
	 */
	public final static int isFullTime = 1;
	public final static int isPartTime = 2;
	public final static int empRate = 20;
	public final static int workDays = 20;

	public static void main(String[] args) {

		int empHrs = 0;
		int empWage = 0;
		int totalWage = 0;

		for (int day = 0; day < workDays; day++) {
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
			System.out.println("Emp Wage is " + empWage);
		}
		System.out.println("Employee Wage is " + totalWage);
	}

}
