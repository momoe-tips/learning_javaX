package com.go.basic.collections;

public class BracketPrinterGen<T> {
	private T vObj;
	
	public BracketPrinterGen(T argObj){
		vObj= argObj;		
	}
	public String toString(){
		return "[" + vObj+ "]";
	}
	 
	public T getValue(){
		return vObj;
	}
}
