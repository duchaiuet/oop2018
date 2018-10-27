package week5_6;

import java.awt.Graphics;

import javax.swing.plaf.BorderUIResource;

import week5_6.Shape;

public class Rectangle extends Shape {
private double width =1.0;
private double  length =0;
protected Point A;
protected Point B;
protected Point C;
protected Point D;
 public  Rectangle () {
	 
 }
 public  Rectangle (double width, double length) {
	 this.length =length;
	 this.width = width;
	 
	 
 }
public  Rectangle (double width,double length,String color,boolean filled) {
	this.length = length;
	this.width = width;
	this.setColor(color);
	this.setFilled(filled);
}
// lay chieu rong
//public int getWidth() {
//	return (int) width;
//}
// set chieu rong
public void setWidth(double width) {
	this.width = width;
}
// lay chieu dai
public double getLength() {
	return length;
}
// set chieu dai
public void setLength(double length) {
	this.length = length;
}

// cover to String
public String toString() {
	return super.toString()+this.getLength()+this.getWidth();
}
public boolean isSame(Shape o) {
	return super.isSame(o);
}
@Override
public void Run() {
	// TODO Auto-generated method stub
	
}
@Override
public void Draw(Graphics g) {
	// TODO Auto-generated method stub
	
}

}