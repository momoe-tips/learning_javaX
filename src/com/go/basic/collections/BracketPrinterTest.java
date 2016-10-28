package com.go.basic.collections;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
public class BracketPrinterTest {
 
	static Logger log = Logger.getLogger(BracketPrinterTest.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	
		//BracketPrinter bracketPrt = new BracketPrinter(new String("abc"));
		BracketPrinterGen<Float> bracketPrt = new BracketPrinterGen<>(110.0f);
		BracketPrinterGen<String> bracketPrt1 = new BracketPrinterGen<>("110");
		log.debug(bracketPrt );
		log.debug(bracketPrt1 );
		
		
		PairPara<String,String> vPair = new PairPara<String,String> ("Hello","World");
		log.debug(vPair.getFirstPara() );
		log.debug(vPair.getSecondPara() );

		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(20);
		log.debug(intList );
		

		Utilities util = new Utilities();
		util.fill(intList, Integer.valueOf("500"));
		log.debug("after calling Utilities.fill: " + intList);

		
		//test WildcardUse 
		WildcardUse  wildcaruse=  new WildcardUse();
		List<Integer> list = new ArrayList<>();
		List<String> sList = new ArrayList<>();		
		
		list.add(100);
		list.add(200);
		
		sList.add("1000");
		sList.add("2000");
		
		wildcaruse.printList(list);
		wildcaruse.printList(sList);	
*/
		
		BoundedWildcardUse  boundedwildcard = new BoundedWildcardUse();
		
		List<Integer> intList = new  ArrayList<>();
		List<Double> dblList = new  ArrayList<>();
		
		for (int i=0;i<5;i++){
			intList.add(i);
			dblList.add((double)(i*i));		
			
		}
		
		log.debug("intList: " + intList);
		log.debug("sum of intList: " + boundedwildcard.sum(intList));

		log.debug("dblList: " + dblList);
		log.debug("sum of dblList: " + boundedwildcard.sum(dblList));
	}

}
