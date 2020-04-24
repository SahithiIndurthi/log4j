package com.capgemini.log4g.log4g;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class InsertData {
	
	Logger log = LogManager.getLogger(App.class);
	
	void storeStudent() {
		log.debug("stored student is called");
	}
}
