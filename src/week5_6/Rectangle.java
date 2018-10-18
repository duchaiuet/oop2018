package week5_6;

import javax.swing.plaf.BorderUIResource;

import week5_6.Shape;

public class Rectangle extends Shape {
private double width =1.0;
private double  length =0;
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
public double getWidth() {
	return width;
}
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
// tinh dien tinh
public double getArea() {
	
	return(this.getLength()*this.getWidth());
}
// tinh chu vi
public double getPerimeter() {
	return (2*(this.getWidth()+this.getLength()));
}
// cover to String
public String toString() {
	return super.toString()+this.getLength()+this.getWidth();
}
public boolean isSame(Shape o) {
	return super.isSame(o);
}

}