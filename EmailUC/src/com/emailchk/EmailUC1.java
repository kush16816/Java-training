
package com.emailchk;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailUC1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String input1 = "abc.xyz@bridgelabz.co.in";
		String pat1 = "^[a-z]{3}.*";
		
		Pattern p = Pattern.compile(pat1);
		Matcher m = p.matcher(input1);
		
		System.out.println("The given email is valid - " + m.matches());

	}

}
