package com.go.basic.collections;

import java.util.Vector;
import org.apache.log4j.Logger;

public class OldContainerTest {
	
	static Logger log = Logger.getLogger(OldContainerTest.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//10; 10L; 10.0f; 10.0d; "10"; true; (short)-10000
		Vector<Float> vecVals = new Vector<Float>();
		vecVals.add(123.0f);		
		vecVals.add((float)456.0);
		
		for (int i=0;i<vecVals.size(); i++) {			
			log.debug( vecVals.get(i));
			
			//System.out.println(floatvecValsVals.get(i));
		}

	}

}
