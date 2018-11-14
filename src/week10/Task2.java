package week10;

import java.util.Random;

import com.sun.org.apache.bcel.internal.generic.SWAP;

public class Task2 {
	static int []a = new int[1000];
	static Random random = new Random(); 
	public static void RandomInt() {
		for(int i = 0; i < 1000 ; i ++)
		{
			a[i] = random.nextInt(1000);			
 		}
	}
	public static void BubleSort() {
		int temp;
		for(int i = 0; i < 999; i ++) {
			for(int j = 0; j < 999 - i; j ++) {
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;					
				}
					
			}
		}
	}
	public static void Print() {
		for(int j = 0; j < 1000; j ++) {
			System.out.println(a[j]+" ");
		}
	}
	public static void main(String[] args) {
		RandomInt();
		
		BubleSort();
		Print();
		
	}
}
