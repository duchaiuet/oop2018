package week2.task1;

public class Task1 {
	static int fibonacci (int n)
	{
		if ( n ==0 ) return 0;
		if ( n ==1 ) return 1;
		else return fibonacci(n-1)+fibonacci(n-2);
		
	}
	static int gcd(int a, int b )
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
}
