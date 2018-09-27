package week2.task2;

import java.util.Scanner;

class Fraction{
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
	Fraction  multiply(Fraction a)
	{
		Fraction b = new Fraction();
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
	Fraction divide(Fraction a)
	{
		if ( a.denominator !=0 && this.denominator != 0 ) {
		Fraction b = new Fraction();
		b.numerator = this.numerator * a.denominator;
		b.denominator = this.denominator * a.numerator;
		return b;
		}
		else return null;
	}
	Fraction subtract (Fraction a)
	{
		Fraction b = new Fraction();
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
	public boolean equals(Object s)
	{
		Fraction other = (Fraction) s;
		Fraction a = this.subtract(other);
		if( a.numerator == 0) return true;
		return false;
					
	}

}