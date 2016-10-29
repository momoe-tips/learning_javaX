package com.go.basic.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import org.apache.log4j.Logger;

public class MapTest {
	static Logger log = Logger.getLogger(MapTest.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MapTest maptest = new MapTest();
		//maptest.spellingCheck();
		
		Set<TheCircle> circlelist = new HashSet<TheCircle>();
		
		circlelist.add(new TheCircle(100,200,50));
		log.debug(circlelist.contains(new TheCircle(100,200,50)));
		
	}
	
	public void spellingCheck(){
		Map<String,String> misSpelt = new HashMap<String,String>();
		misSpelt.put("calender", "calendar");
		misSpelt.put("tomatos", "tomatoe");
		misSpelt.put("existance", "existence");
		misSpelt.put("esercise", "exercise");
		misSpelt.put("wensday", "Wednesday");
		
		String str= "Buy a calender for the year 2016 on wensday";
		log.debug("String:" + str);
		
		Set<String> keys = misSpelt.keySet();
		log.debug("misspelt word checklist: " + keys);
		
		for (String word: str.split("\\W+")){
			if (misSpelt.containsKey(word)){
				log.debug("The correct spelling for " + word + " is: " + misSpelt.get(word));
			}
		}	 
				
	}
	
	public void queueTest(){
		Queue<String> loginSequence = new LinkedList<String>();
		loginSequence.add("Peter");
		loginSequence.add("Alice");
		loginSequence.add("Lucas");
		loginSequence.add("Jonna");
		loginSequence.add("Joe");
		
		log.debug("aaa");
		
		
		
	}

}
