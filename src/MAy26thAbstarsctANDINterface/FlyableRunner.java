package MAy26thAbstarsctANDINterface;

import java.sql.Array;

interface Flyable{
void fly();
	
}

class Bird implements Flyable{

	@Override
	public void fly() {
		System.out.println("Bird with Wings");
		
	}
	
}

class Aerplane implements Flyable{

	@Override
	public void fly() {
		System.out.println("Fuel");
		
	}
	
}

public class FlyableRunner {
	public static void main(String[] args) {
		Flyable[]  flyobj= { new Bird() , new Aerplane() };
		for(Flyable ob:flyobj) {
			ob.fly();
			
		}
		
	}

}
