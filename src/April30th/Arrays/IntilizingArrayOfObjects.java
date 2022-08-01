package April30th.Arrays;

public class IntilizingArrayOfObjects {

	public static void main(String[] args) {
		int[] mark=new int[5];
System.out.println(+mark[0]) ;
System.out.println(+mark[1]);
System.out.println(+mark[2]);
System.out.println(+mark[3]);
System.out.println(+mark[4]);
mark[0]=1;
mark[1]=2;
mark[2]=3;
mark[3]=4;
mark[4]=5;
System.out.print(+mark[1]+",");
System.out.print(+mark[2]+",");
System.out.print(+mark[3]+",");
System.out.print(+mark[4]+",");
System.out.println(+mark[0]);
for(int M:mark) {
	System.out.print(+M+",");
}
	}

}
