
package com.pincode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PincodeUC1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "440088";
		String pat = "[0-9]{6}";
		Pattern p = Pattern.compile(pat);
		Matcher m = p.matcher(input);
		
		System.out.println("Pincode is in correct format - " + m.matches());

	}

}
