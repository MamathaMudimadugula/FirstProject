package April27th;

import java.util.Scanner;

public class DoWhileRepeatedRunnerQuestion1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int number=0;
	
		do {
			System.out.println("Cube of number is : "+ (number*number*number) );
			System.out.print("Enter a number : ");
		  number=sc.nextInt();
			
		}while(number>=0);
		

	}

	}


