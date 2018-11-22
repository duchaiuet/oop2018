package week11;

import java.util.ArrayList;

public class Task2 {
	public static <T extends Comparable<T>> T Max( ArrayList<T> a){
			T max = a.get(0);
			for(int i = 0; i < a.size() ; i++) {
				if(a.get(i).compareTo(max) > 0) {
					max = a.get(i);
				}
			}
			return max;
	}
	public static void main(String[] args) {
		ArrayList<Integer> _Int = new ArrayList<>();
		_Int.add(3);
		_Int.add(2);
		_Int.add(6);
		_Int.add(7);
		_Int.add(8);
		_Int.add(9);
		System.out.println(Max(_Int));
		ArrayList<Character> _Character = new ArrayList<>();
		_Character.add('a');
		_Character.add('b');
		_Character.add('t');
		_Character.add('p');
		_Character.add('h');
		_Character.add('u');
		System.out.println(Max(_Character));
		ArrayList<Long> _Long = new ArrayList<>();
		_Long.add(34l);
		_Long.add(28l);
		_Long.add(69l);
		_Long.add(47l);
		_Long.add(68l);
		_Long.add(9l);
		System.out.println(Max(_Long));
		ArrayList<Double> _Double = new ArrayList<>();
		_Double.add(3.1245);
		_Double.add(2.6785);
		_Double.add(6.2535);
		_Double.add(7.7845);
		_Double.add(8.124);
		_Double.add(9.0001);
		System.out.println(Max(_Double));

	}
}