package week5_6;

import week5_6.Shape;

public class Circle extends Shape {
	private double radius =1.0;
public Circle() {
	
}
public Circle(double radius) {
	this.radius = radius;
}
// lay ban kinh
	public double getRadius() {
		return radius;
	}
// set ban kinh 
	public void setRadius(double radius) {
		this.radius = radius;
	}
public boolean isSameCircle(Circle a) {
	
	return super.isSame(a)&&this.radius==a.getRadius();
}  

}
