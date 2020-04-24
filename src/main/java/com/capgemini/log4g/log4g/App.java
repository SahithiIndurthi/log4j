package com.capgemini.log4g.log4g;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	static Logger log = LogManager.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	log.info("Iam an info");
    	log.trace("Iam an trace");
    	log.debug("Iam an debug");
    	log.warn("Iam an warn");
    	log.error("Iam an error");
    	log.fatal("Iam an fatal");
    }
    
    
    
}
