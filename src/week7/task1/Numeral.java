package week7.task1;

public class Numeral extends Expression{
	
	int value;
	
	public Numeral() {};
	 
	public Numeral (int x)
	{
		this.value = x;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s = Integer.toString(this.value);
		return s;
	}

	@Override	
	public int evaluate() {
		// TODO Auto-generated method stub
		return this.value;
	}
}
