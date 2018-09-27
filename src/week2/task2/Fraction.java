package week2.task2;

import java.util.Scanner;

public class Fraction{
	protected int numerator, denominator ;
	Fraction(){};
	Fraction (int a, int b)
	{
		this.numerator = a;
		this.denominator = b;
	}
	void getFraction ( int tu, int mau )
	{
		numerator =  tu;
		denominator = mau ;
	}
	int ucln(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		while (a != b )
		{
			if ( a > b ) a = a - b;
			else b = b - a;
		}
		return a;
	}
	Fraction add (Fraction a ) {
		Fraction b = new Fraction();
		if ( this.denominator == a.denominator) {
			b.numerator = this.numerator + a.numerator;
			b.denominator = this.denominator;
		}
		else {
			int  c = this.ucln(this.denominator, a.denominator);
			b.numerator = this.numerator * (a.denominator/c) + a.numerator * (this.denominator/c);
			b.denominator = this.denominator * (a.denominator/c);
		}
		return b;
	}
	fraction  multiplication(fraction a)
	{
		fraction b = new fraction();
		b.numerator = this.numerator * a.numerator;
		b.denominator = this.denominator * a.denominator;
		return b;		
	}
	void shortten ()
	{
		if(this.numerator == 0);
		else if(this.denominator !=0 ) {
		int d = ucln(this.numerator, this.denominator);
		this.numerator = this.numerator/d;
		this.denominator = this.denominator/d;
		}
		else System.out.println("EROR")	;
	}
	fraction division (fraction a)
	{
		if ( a.denominator !=0 && this.denominator != 0 ) {
		fraction b = new fraction();
		b.numerator = this.numerator * a.denominator;
		b.denominator = this.denominator * a.numerator;
		return b;
		}
		else return null;
	}
	fraction subtraction (fraction a)
	{
		fraction b = new fraction();
		if ( this.denominator == a.denominator) {
			b.numerator = this.numerator - a.numerator;
			b.denominator = this.denominator;
		}
		else {
			int  c = this.ucln(this.denominator, a.denominator);
			b.numerator = this.numerator * (a.denominator/c) - a.numerator * (this.denominator/c);
			b.denominator = this.denominator * (a.denominator/c);
		}
		return b;
	}
	boolean check()
	{
		if (ucln(this.numerator,this.denominator)==1) return true;
		else return false; 
	}
	void display()
	{
		if( this.numerator % this.denominator == 0) System.out.println(this.numerator/this.denominator);
		else  if ( this.denominator != 0) {
			System.out.println(this.numerator+"/"+this.denominator);
		}
	}
	public boolean equals(fraction s)
	{
		this.shortten();
		s.shortten();
		if(this.numerator == s.numerator && this.denominator == s.denominator) return true;
		else return false;
		
	}

}

public class Task2 {
	static Scanner sc = new Scanner ( System.in);
	public static void main ( String []args)
	{	
		fraction a = new fraction ();
		fraction b = new fraction ();
		fraction c = new fraction ();
		System.out.print("Enter the Numerator: ");
		a.numerator = sc.nextInt();
		System.out.print("Enter the Denominator: ");
		a.denominator = sc.nextInt();
		System.out.print("Enter the Numerator: ");
		b.numerator = sc.nextInt();
		System.out.print("Enter the Denominator: ");
		b.denominator = sc.nextInt();
		c = a.add(b);
		c.shortten();
		System.out.print("Tong cua hai phan so la: ");	
		c.display();
		c = a.multiplication(b);
		c.shortten();
		System.out.print("tich cua hai phan so la: ");	
		c.display();
		c = a.division(b);
		c.shortten();
		System.out.print("Thuong cua hai phan so la: ");	
		c.display();
		c = a.subtraction(b);
		//c.shortten();
		System.out.print("Hieu cua hai phan so la: ");	
		c.display();
		if( a.equals(b)) System.out.print("hai phan so giong nhau.");
		else System.out.print("hai phan so khac nhau.");
	}
}
