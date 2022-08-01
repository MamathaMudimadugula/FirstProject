package April25th;
import April25th.MyNumber;
@SuppressWarnings("unused")
public class MyNumberRunner{
	

	public static void main(String args[]) {
		MyNumber number = new MyNumber(2);
		boolean isPrime = number.isPrime();
		System.out.println("isPrime"+isPrime);

}
}