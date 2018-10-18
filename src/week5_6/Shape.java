package week5_6;



public class Shape {
private double x=0;
private double y =0;
private String color;
private boolean filled;
public Shape() {
	
}
public Shape(double x,double y) {
	this.setX(x);
	this.setY(y);
}
public double getX() {
	return x;
}
public void setX(double x) {
	this.x = x;
}
public double getY() {
	return y;
}
public void setY(double y) {
	this.y = y;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public boolean isFilled() {
	return filled;
}
public void setFilled(boolean filled) {
	this.filled = filled;
}
public boolean isSame(Shape o) {
	return(this.x==o.getX()&&this.y==o.getY());
}
}
