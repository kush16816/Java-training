/**
 * 
 */
package com.empWage;

public class EmpWageUC1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int isFullTime = 1;

		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == isFullTime)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");

	}

}
