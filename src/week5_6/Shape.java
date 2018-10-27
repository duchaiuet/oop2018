package week5_6;

import java.awt.Graphics;

public abstract class Shape extends Layer{
Point velocity ;
protected String color;
private boolean filled;
public Shape() {
}
public Shape(int _x,int _y) {
	velocity = new Point(_x, _y);
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
	return(this.velocity.x==o.velocity.x && this.velocity.y==o.velocity.y);
}
public abstract void Run();
public abstract void Draw(Graphics g);
	}
