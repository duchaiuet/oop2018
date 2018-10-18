package week5_6;

public class Hexagon extends Circle {
	
  private double canh=1.0;
// get thuoc tinh canh
public double getCanh() {
	return canh;
}
// set thuoc tinh canh;
public void setCanh(double canh) {
	this.canh = canh;
}
public boolean isSameHexagon(Hexagon a) {
	if(a instanceof Hexagon)
	return super.isSameCircle(a)&&a.getCanh()==this.canh;
	else
		return false;
}
}
