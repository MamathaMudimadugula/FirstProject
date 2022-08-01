package April30th.Arrays;

import java.util.Arrays;

public class ArugumentsInArray {

	public static void main(String[] args) {
A(1,2);
sum(1, 2);

	}

	
	  
	  static void A(int...values) 
	  { 
		  System.out.println(Arrays.toString(values));
	}
	 
	static void sum(int... values) {
		int sum = 0;
		for (int value : values) {
			sum += value;
		}
		System.out.println(+sum);
		//return sum;
	}
}
