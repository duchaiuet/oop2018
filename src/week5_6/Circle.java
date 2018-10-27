package week5_6;

import java.awt.Color;
import java.awt.Graphics;

import week5_6.Shape;

public class Circle extends Shape {
	private int radius =1;
	boolean check_x = true;
	boolean check_y = true;
public Circle() {
	
}
public Circle(int radius) {
	this.radius = radius;
}
// lay ban kinh
	public int getRadius() {
		return radius;
	}
// set ban kinh 
	public void setRadius(int radius) {
		this.radius = radius;
	}
public boolean isSameCircle(Circle a) {
	
	return super.isSame(a)&&this.radius==a.getRadius();
}
@Override
public void Run() {
	// TODO Auto-generated method stub
	if(this.velocity.x + this.radius == this.Height ) check_x = false;
	if(this.velocity.x + this.radius == 0 ) check_x = true;
	if(this.velocity.y + this.radius == this.Width ) check_x = false;
	if(this.velocity.y + this.radius == 0 ) check_x = true;
	if(check_x == true ) this.velocity.x++;
	else this.velocity.x--;
	if(check_y == false ) this.velocity.y ++;
	else this.velocity.y --;
}
@Override
public void Draw(Graphics g) {
	// TODO Auto-generated method stub
	g.setColor(Color.GREEN);
	g.drawOval(this.velocity.x, this.velocity.y, this.radius, this.radius );
}

}
