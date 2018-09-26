package week2.task3;

class coder{
	// 3 basic properties
	protected String Career, Sex, Height;
	
	void setCareer( String a)
	{
		this.Career = a;
	}
	void setSex( String a)
	{
		this.Sex = a;
	}
	void setHeight( String a)
	{
		this.Height = a;
	}
	String getCareer()
	{
		return Career;
	}
	String getSex()
	{
		return Sex;
	}
	String getHeught()
	{
		return Height;
	}
	// 3 methods
	void alive()
	{
		System.out.println("coder is alive");
	}
	void work()
	{
		System.out.println("coder code");
	}
	void eat()
	{
		System.out.println("coder eat");
	}
}
class cat{
	// 3 basic properties

	 protected String Color, Kind, ColorOfEyes;
	 void setcolor( String a)
		{
			this.Color = a;
		}
		void setKind( String a)
		{
			this.Kind= a;
		}
		void setColorOfEyes( String a)
		{
			this.ColorOfEyes = a;
		}
		String getColor()
		{
			return Color;
		}
		String getKind()
		{
			return Kind;
		}
		String getColorOfEyes()
		{
			return ColorOfEyes;
		}
		// 3 methods
	 // 3 methods
		void move()
		{
			System.out.println("cat move by four legs");
		}
		void cry()
		{
			System.out.println("meow meow meow");
		}
		void eat()
		{
			System.out.println("cat eat fish");
		}
}
class motorbike{
	// 3 basic properties

	protected String Brand, Kind, Color;
	 void setcolor( String a)
		{
			this.Color = a;
		}
		void setKind( String a)
		{
			this.Kind= a;
		}
		void setBrand( String a)
		{
			this.Brand = a;
		}
		String getColor()
		{
			return Color;
		}
		String getKind()
		{
			return Kind;
		}
		String getBrand()
		{
			return Brand;
		}
		// 3 methods
		void move()
		{
			System.out.println("motorbike move with two wheels");
		}
		void cry()
		{
			System.out.println("pips pips pips ");
		}
		void Stop ()
		{
			System.out.println("Stop");
		}
}
public class Task3 {
	public static void main ( String []args)
	{
		cat a = new cat();
		motorbike b = new motorbike();
		coder c = new coder();
		a.setcolor("black");
		a.setColorOfEyes("brown");
		a.setKind("vietnam cat");
		
		b.setBrand("Honda");
		b.setcolor("black");
		b.setKind("scooter");
		
		c.setCareer("developer");
		c.setHeight("169");
		c.setSex("man");
		
		a.move();
		a.cry();
		a.eat();
		
		b.move();
		b.cry();
		b.Stop();
		
		c.alive();
		c.eat();
		c.eat();
	}
}

