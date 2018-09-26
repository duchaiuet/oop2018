package week2.task1;

public class Task1 {
	static int Fibonacci (int n)
	{
		if ( n ==0 ) return 0;
		if ( n ==1 ) return 1;
		else return Fibonacci(n-1)+Fibonacci(n-2);
		
	}
	static int UCLN(int a, int b )
	{
		a = Math.abs(a);
		b = Math.abs(b);
		while (a!=b)
		{
			if( a > b) a = a-b;
			else if ( a < b) b = b - a;
		}
		
		 return a;
	}
	public static void main ( String []args)
	{
		for ( int i = 0 ; i < 10; i++)
		{
			System.out.print(Fibonacci(i)+" ");
		}
		System.out.print(" \n");
		System.out.println(UCLN(100, 100000));
	}
}
