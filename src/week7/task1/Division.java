package week7.task1;

public class Division extends BinaryExpression{
	Expression left;
	Expression right;
	
	public Division (Expression a, Expression b)
	{
		this.left = a;
		this.right = b;
	}
	@Override
	public Expression left() {
		// TODO Auto-generated method stub
		return left;
	}

	@Override
	public Expression right() {
		// TODO Auto-generated method stub
		return right;
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
		return this.left.evaluate()/this.right.evaluate();
	}

}
