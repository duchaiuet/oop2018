package week11;

public class Task1 {
	public static <T extends Comparable<T>> void sort(T []a){
		if(a.length == 0 ) return;
		else {
			for(int i = 0; i < a.length -1 ;i++) {
				for(int j = 0; j < a.length -1 ; j++ )
				{
					if(a[j].compareTo(a[j+1]) < 0) {
						T gan = a[j];
						a[j] = a[j+1];
						a[j+1] = gan;
					}
						
				}
			}
		}
	}
	public static <T> void print(T []a) {
		for(int i = 0; i < a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		Character a[] = {'a','g','h','d','q','k','t','n'};
		sort(a);
		print(a);
		System.out.println();
		Integer b[] = {5,6,1,2,4,3,2,8,9,4,0};
		sort(b);
		print(b);
		System.out.println();
		Long c[] = {123l,234l,7456l,5634l,433l,768l,75l,78l};
		sort(c);
		print(c);
		System.out.println();
		Byte d[] = {4,5,8,6,2,4,1,9};
		sort(d);
		print(d);
		System.out.println();
		Short e[] = {22,29,25,23,28,27,12};
		sort(e);
		print(e);
		System.out.println();
		Float f[] = {6.1f,1.2f,2.8f,1.9f,7.9f};
		sort(f);
		print(f);
		System.out.println();		
		Double  g[] = {3.245124,8.62314,9.21345,1.2451};
		sort(g);
		print(g);
		System.out.println();
	}
}
	
	
	
	

