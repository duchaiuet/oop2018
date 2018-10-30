package week7.task1;

public class Square extends Expression{
	Expression expression;
	public Square(Expression e )
	{
		this.expression = e;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s = Integer.toString(this.evaluate());
		return s;
	}

	@Override
	public int evaluate() {
		// TODO Auto-generated method stub
		return this.expression.evaluate()*this.expression.evaluate();
	}
}
