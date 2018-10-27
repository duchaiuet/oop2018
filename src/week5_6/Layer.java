package week5_6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import week5_6.Shape;
import week5_6.Triangle;

public abstract class Layer extends Diagram{
ArrayList<Shape> shape = new ArrayList<Shape>();

// xoa hinh chu nhat
public int deteleteTriange() {
	int result =0;
	
	System.out.println();
	for(int i=0;i<this.shape.size();i++) {
		if(shape.get(i) instanceof Triangle) { 
			shape.remove(i);
			result++;
			
			
			i--;
 	}
		
	}
	return result;
}
// xoa hinh tron
public int deteleteCircle() {
	int result =0;
	
	for(int i=0;i<this.shape.size();i++) {
		if(shape.get(i) instanceof Circle) {
			shape.remove(i);
			result++;
			i--;
			
 	}
	}
		return result;
	}

}
