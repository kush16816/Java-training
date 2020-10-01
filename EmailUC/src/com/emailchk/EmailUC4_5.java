
package com.emailchk;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailUC4_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String input1[] = {"abc.xyz@bridgelabz.co.in", "abc@yahoo.com", "abc", "abc@.com.my", "abc123@gmail.a",
							"abc123@.com", ".abc@abc.com", "abc()*@gmail.com", "abc@gmail.com.au.aa", "abc@1.com"};
		String pat1 = "^[a-z0-9]+[a-z0-9.+-_]+@[a-z0-9]+.[a-z]{2,}(.[a-z]{2})?$";
		
		Pattern p = Pattern.compile(pat1);
		
		for(int i = 0; i<10; i++) 
		{
			Matcher m = p.matcher(input1[i]);
			
			System.out.println("The given email is valid - " + m.matches());
		}
	}

}
