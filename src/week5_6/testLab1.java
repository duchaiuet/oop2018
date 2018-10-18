package week5_6;

public class testLab1 {

	public static void main(String[] args) {
		Layer a = new Layer();
		//a.shape.add(new Square());
		//a.shape.add(new Square());
		//a.deteleSameShape();
		//System.out.println(a.shape.size());
		a.shape.add(new Circle());
		a.shape.add(new Circle());
		a.shape.add(new Triangle());
		a.shape.add(new Triangle());		
		Diagram b = new  Diagram();
	    b.layer.add(a); 
		System.out.println(b.layer.get(0).shape.size());
		System.out.println(b.deleteCricle());
		System.out.println(b.layer.get(0).shape.size());
	}

}
