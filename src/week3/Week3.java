package week3;

public class Week3 {

    public static int max(int m, int n) {
    	if( m > n) return m;
    	else if ( m < n ) return n;
    	else return m;
    }

    public static int minOfArray(int[] array) {
       
        int min = array[0];
        for ( int i = 0; i < array.length; i ++)
        {
        	if ( min > array[i]) min = array[i];
        }
        return min;
    }

    public static String calculateBMI(double weight, double height) {
        
    	double BMI = (weight)/(height*height);
    	String a = null;
    	if ( BMI < 18.5) a = "Thieu can";
    	else if ( BMI >=18.5 && BMI <23) a = "Binh thuong";
    	else if ( BMI >=23 && BMI <24.99) a = "Thua can";
    	else if ( BMI >25) a = "Beo phi";
		return a;
    }
}

