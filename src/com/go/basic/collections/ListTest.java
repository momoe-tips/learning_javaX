package com.go.basic.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.apache.log4j.Logger;

public class ListTest {

	static Logger log = Logger.getLogger(ListTest.class.getName());
	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		
		ListTest insListTest = new ListTest();
		//insListTest.iteratorTest();
		insListTest.listIteratorTest();

	}
	
	public void iteratorTest(){
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			nums.add(i);
		}
		
		log.debug("Original list: " +nums);
		
		Iterator<Integer> itr = nums.iterator();
		while (itr.hasNext()){
			itr.next();   //
			itr.remove();
		}
		log.debug("after removing elements: " +nums);
	}
	
	public void listIteratorTest(){
		String str="Hello";
		List<Character> palindrome = new LinkedList<Character>();
		
		for(char ch:str.toCharArray())
			palindrome.add(ch);
		
		log.debug("Input string: " +str);
		
		ListIterator<Character> itr= palindrome.listIterator();
		ListIterator<Character> revItr= palindrome.listIterator(palindrome.size());
		
		boolean result = true;
		
		while (revItr.hasPrevious() && itr.hasNext()){
			if (itr.next() != revItr.previous()){
				result=false;
				break;
			}
		}
		
		if (result)
			log.debug("input string is a palindrome");
		else
			log.debug("input string is not a palindrome");
		
		
		
	}

}
