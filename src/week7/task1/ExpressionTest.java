package week7.task1;

public class ExpressionTest {
	public static void main( String args[])
	{
		try {
			Square squared = new Square(new Numeral(10));
			Subtraction subtraction = new Subtraction(squared, new Numeral(1));
			Multiplication multiplication = new Multiplication(new Numeral(2), new Numeral(3));
			Addition addition = new Addition(subtraction, multiplication);
			Square squared1 = new Square(addition);
			System.out.println(squared1.toString());
			Numeral a = new Numeral(0);
			System.out.println(new Division(squared1, a).toString());
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
}
