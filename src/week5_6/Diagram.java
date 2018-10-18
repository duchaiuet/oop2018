package week5_6;

import java.util.ArrayList;

import week5_6.Layer;

public class Diagram {
	
	public ArrayList<Layer> layer = new ArrayList<Layer>();
	// xoa hinh tron trong layer
	public int deleteCricle() {
		
		int result = 0;
		for(int i=0;i<layer.size();i++) {
			result=result+layer.get(i).deteleteCircle();
		}
	return result;
	}
}
