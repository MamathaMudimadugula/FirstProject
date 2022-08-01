package April27th;

import java.util.Scanner;

public class DoWhileRepeatedQuestionRunner {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int number;
	
		do {
			System.out.print("Enter a number : ");
		  number=sc.nextInt();
			System.out.println("Cube of number is : "+ (number*number*number) );	
		}while(number>=0);
		

	}

}
