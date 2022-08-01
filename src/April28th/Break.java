package April28th;

public class Break {

	public static void main(String[] args) {
	for(int i=1;i<=10;i++) {
		if(i==5) 
		break;
		System.out.print(i + " ");
	
	}
	System.out.println();
	for(int j = 1;j<=10;j++)
	{
		if (j % 2 == 0)
			break;
		System.out.print(j + " ");

	}
	}

}
