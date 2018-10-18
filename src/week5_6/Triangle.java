package week5_6;

public class Triangle extends Shape{
private double a;
private double b;
private double c;
/**
 * @return the a
 */
public double getA() {
	return a;
}
/**
 * @param a the a to set
 */
public void setA(double a) {
	this.a = a;
}
/**
 * @return the b
 */
public double getB() {
	return b;
}
/**
 * @param b the b to set
 */
public void setB(double b) {
	this.b = b;
}
/**
 * @return the c
 */
public double getC() {
	return c;
}
/**
 * @param c the c to set
 */
public void setC(double c) {
	this.c = c;
}
public boolean isSameTriangle(Triangle a) {
	return super.isSame(a)&&a.getA()==this.a&&a.getB()==this.b&&a.getC()==this.c;
}
}
