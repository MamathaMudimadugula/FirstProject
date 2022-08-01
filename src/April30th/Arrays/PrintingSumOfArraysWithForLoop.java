package April30th.Arrays;

public class PrintingSumOfArraysWithForLoop {
public static void main(String[] args) {
	int[] marks= {1,2,3};
	int sum=0;
	for(int mark:marks) {
		sum=sum+mark;
	}
	System.out.println("Sum of marsk is: "+sum);
}
}

/*
 * //public static void main(String[] args) { int[] marks= {1,2,3}; int sum=0;
 * for(int mark:marks) { sum=sum+mark; }}
 * System.out.println("Sum of marsk is: "+sum);
 * 
 * }
 */