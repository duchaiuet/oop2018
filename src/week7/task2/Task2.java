package week7.task2;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {
	public static void Test1() throws NullPointerException{
		Object a = null;
		System.out.println(a.toString());
	}
	public static void Test2() throws ArrayIndexOutOfBoundsException{
		int a[] = new int [1];
		System.out.println(a[2]);
	}
	public static void Test3() throws ArithmeticException{
		System.out.println(5/0);
	}
	public static void Test4() throws ClassCastException{
		Object a = new Integer(4);
		System.out.println((String) a);
	}
	public static void Test5() throws IOException{
			FileInputStream fin = new FileInputStream("Test5.txt");
			DataInputStream din = new DataInputStream(fin);
			System.out.println(din.readInt());
	}
	public static void Test6() throws FileNotFoundException{
		File file = new File("Test6.txt");
		FileReader reader = new FileReader(file);
	}
	public static void main( String []args)
	{
		try {
			Test1();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		try {
			Test2();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		try {
			Test3();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		try {
			Test4();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		try {
			Test5();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		try {
			Test6();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
	}
	
}
