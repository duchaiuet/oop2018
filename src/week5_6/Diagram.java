package week5_6;

import java.util.ArrayList;

import javax.swing.JFrame;

import week5_6.Layer;

public abstract class Diagram extends JFrame{
	protected int Width = 600;
	protected int Height = 800;
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
