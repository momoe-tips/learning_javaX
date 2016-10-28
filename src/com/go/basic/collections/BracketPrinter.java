package com.go.basic.collections;

public class BracketPrinter {
	private Object vObj;
	public BracketPrinter(Object argObj){
		vObj= argObj;		
	}
	public String toString(){
		return "[" + vObj+ "]";
	}
	
}
