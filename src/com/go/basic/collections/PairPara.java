package com.go.basic.collections;

public class PairPara <T1,T2> {
	T1 vObj1;
	T2 vObj2;
	
	PairPara (T1 para1,T2 para2){
		vObj1=para1;
		vObj2=para2;
	}
	
	public T1 getFirstPara(){
		return vObj1;
	}

	public T2 getSecondPara(){
		return vObj2;
	}
}
