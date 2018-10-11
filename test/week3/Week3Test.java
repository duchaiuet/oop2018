package week3;
import week3.Week3;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.Test;

public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
	@Test
	public void Testmax1()
	{
		Week3 a = new Week3();
		assertEquals(a.max(5, 4), 5);
		assertEquals(a.max(-5000000, -1), -1);
		assertEquals(a.max(5, 4), 5);
		assertEquals(a.max(0, 0), 0);
		assertEquals(a.max(0, 1), 1);
	}
    // TODO: Viết 5 testcase cho phương thức minOfArray()
	@Test
	public void TestminOfArray()
	{
		int a[]= {2,4,3,5,8,2,1,8,3,9};
		int d[]= {20,10,19,11,12,28,13,17,16,14,15};
		int e[]= {2,5,4,-10,8,15,4,7,6};
		int f[]= {77,88,99,11,22,55};
		int g[]= {3,2,5,4,8,5,0};
		Week3 b = new Week3();
		assertEquals(b.minOfArray(a), 1);
		assertEquals(b.minOfArray(d), 10);
		assertEquals(b.minOfArray(e), -10);		
		assertEquals(b.minOfArray(f), 11);		
		assertEquals(b.minOfArray(g), 0);
	}
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
	@Test
	public void TestcalculateBMI()
	{
		Week3 c = new Week3();
		assertEquals(c.calculateBMI(36.5,1.47 ), "Thieu can");
		assertEquals(c.calculateBMI(56.6,1.7 ), "Binh thuong");
		assertEquals(c.calculateBMI(58.4,1.56 ), "Thua can");
		assertEquals(c.calculateBMI(72.3,1.65 ), "Beo phi");
		assertEquals(c.calculateBMI(67.8,1.66 ), "Thua can");
	}

	
	
	}
	