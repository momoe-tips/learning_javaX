package com.go.basic.collections;

import java.awt.Point;

public class TheCircle {
	private int xPos,yPos,radius;
	private Point center;
	
	public TheCircle(int x,int y,int r){
		xPos = x;
		yPos = y;
		radius = r;
	}
	
	public boolean equals (Object obj){
		if (obj==null) return false;
		if (this== obj) return true;
		if (obj instanceof TheCircle) {
			TheCircle  another = (TheCircle)obj;
			if ((this.xPos ==another.xPos ) && (this.yPos==another.yPos) && (this.radius==another.radius))
				return true;
		}
		return false;
	}
	
	public int hasCode(){
		//preferably primes return (7 * xPos) ^ (11 * yPos) ^ (53 * yPos);
		return center.hashCode()^ radius;
		
	}
}
