package com.Hello.demo.Hellolog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOG = (Logger) LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	String message = "Hello World ";
    	LOG.debug(message + "will be printed on Debug");
    	LOG.error(message + "Will be printed on Error");
    	LOG.fatal(message + "Will be printed on Fatal");
    	LOG.info(message + "Will be printed on Info");
    	LOG.warn(message + "Will be printed on Warn");
    	System.out.println( "Hello World!" );
    }
}
