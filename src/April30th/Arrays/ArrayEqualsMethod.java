package April30th.Arrays;

import java.util.Arrays;

public class ArrayEqualsMethod {
	
	public static void main(String[] args) {
		
	int[] array1= {1,2,3};
	int[] array2= {1,2,3};
System.out.println(Arrays.equals(array1, array2));
Arrayfill();
Arraysort();

	}

private static void Arrayfill(){
	int[] marks= new int[5];
	Arrays.fill(marks, 10);
	System.out.println(Arrays.toString(marks));

}
private static void Arraysort(){
	int[] marks= {7,8,9,0,1,3,2};
	Arrays.sort(marks);
	System.out.println(Arrays.toString(marks));

}
}