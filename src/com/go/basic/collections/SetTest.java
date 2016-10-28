package com.go.basic.collections;

import java.util.Set;
import java.util.TreeSet;

import org.apache.log4j.Logger;

public class SetTest {

	static Logger log = Logger.getLogger(SetTest.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetTest settest = new SetTest();
		
		settest.treesetTest();
	}
	
	public void treesetTest(){
		String str="the quick brown fox jumps over the lazy dog";
		Set<Character> aToZ = new TreeSet<Character>();
		
		for (char ch: str.toCharArray()){
			aToZ.add(ch);
		}
		log.debug("The String is : " + str);
		log.debug("Sorted  string characters are : " + aToZ);
		
	}

}
