package com.go.basic.collections;

import java.util.List;

import org.apache.log4j.Logger;

public class WildcardUse {
	static Logger log = Logger.getLogger(WildcardUse.class.getName());
	
	static void printList(List<?> list){
	   
		for (Object lstObj:list)
			log.debug("[" + lstObj + "]");		
		
	}

}
