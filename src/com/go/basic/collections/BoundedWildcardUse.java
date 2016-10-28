package com.go.basic.collections;

import java.util.List;
 
public class BoundedWildcardUse {
	
	public static Double sum(List<? extends Number> numList){
		Double result=0.0;
		for (Number num: numList){
			result += num.doubleValue();			
		}
		return result;
	}

}
