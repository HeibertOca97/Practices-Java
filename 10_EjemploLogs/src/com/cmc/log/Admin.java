package com.cmc.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Admin {
	private static Logger logger = LogManager.getLogger(Admin.class);
	
	public void agregar(){
		logger.warn("Mensaje de Warn");//Level 1
		logger.info("Mensaje de Info");//Level 2
		logger.debug("Mensaje de Debug");//Level 3
		logger.trace("Mensaje de Trace");//Level 4
		
		//Este siempre se va ha loguear
		logger.error("Mensaje de Error");//All for
	}
}
