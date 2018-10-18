package week5_6;



import week5_6.Rectangle;

public class Square extends Rectangle{
public Square () {
	
}
public Square (double side) {
	
	super(side,side);
	
}
public Square(double side ,String color , boolean filled) {
	super(side,side,color,filled);
}
public double geSide() {
	return this.getLength();
}
public void setSide(double side ) {
	this.setLength(side);
	this.setLength(side);
}
public void setLength(double side) {
	super.setLength(side);
}
public void setWidth(double side) {
	super.setWidth(side);
}
public String toString() {
	return super.toString();
}

}
