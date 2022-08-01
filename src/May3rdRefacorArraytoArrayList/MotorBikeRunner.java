package May3rdRefacorArraytoArrayList;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike Honda = new MotorBike(100);
		MotorBike Dob = new MotorBike(200);
		MotorBike SomethingElse = new MotorBike();
		System.out.println(Honda.getSpeed());
		System.out.println(Dob.getSpeed());
		System.out.println(SomethingElse.getSpeed());
		Honda.Start();
		Dob.Start();
		Honda.increaseSpeed(1000);
		Honda.decreaseSpeed(300);
		Dob.increaseSpeed(1000);
		Dob.decreaseSpeed(300);
		System.out.println(Honda.getSpeed());
		System.out.println(Dob.getSpeed());
		
	}

}
