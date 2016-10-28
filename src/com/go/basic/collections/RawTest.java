package com.go.basic.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;

public class RawTest {
	static Logger log = Logger.getLogger(RawTest.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list= new LinkedList();
		list.add("First");
		list.add("Second");
		List<String> strList = list;
		    
		for (Iterator<String> itr =strList.iterator(); itr.hasNext();){
			log.debug("Item: " + itr.next());
		}
		
		List<String> strList2 = list;
		strList2.add("First");
		strList2.add("Second");	
		List list2 = strList2;
	
		for (Iterator<String> itr =list2.iterator(); itr.hasNext();){
			log.debug("Item2: " + itr.next());
		}
		
		
		

	}

}
