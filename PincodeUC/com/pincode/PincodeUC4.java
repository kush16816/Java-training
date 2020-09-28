
package com.pincode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PincodeUC4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "400-088";
		String pat = "^[1-9][0-9]{2}[\\s-]?[0-9]{3}$";
		Pattern p = Pattern.compile(pat);
		Matcher m = p.matcher(input);
		
		System.out.println("Pincode is in correct format - " + m.matches());

	}

}
