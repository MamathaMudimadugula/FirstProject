package April26th;

public class MynumberPlayer {

	private int limit;

	public MynumberPlayer(int limit) {
		this.limit=limit;
	}

	public void Squreslimit() {
		int i = 1;
		while(i*i<limit) {
			System.out.print(i * i+" ");
			i++;
		}
		System.out.println();
	}

	public void Cubeslimit() {
		
		int i = 1;
		while(i*i*i<limit) {
			System.out.print(i * i * i  +"  ");
			i++;
		}
		System.out.println();
	}

}
