/**
 * 
 */
package edu.lonestar.JeremyJohnson.cosc1337;

/**
 * @author Jeremy Johnson
 *
 */
public class Rectangle {
	private double width;
	private double length;
	
	public Rectangle(double width, double length){
		
		this.width = width;
		
		this.length = length;
		
	}
	
	public double getWidth(){
		return this.width;
	}
	
	public double getLength(){
		return this.length;
	}
	
	public double getArea(){
		return (this.width * this.length);
	}
	
	public String toString(){
		return String.format("Rectangle width = %f\nRectangle length = %f\nRectangle area = %f", width, length, getArea());
	}
} 
