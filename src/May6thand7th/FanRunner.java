package May6thand7th;

public class FanRunner {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
Fan fan =new Fan("manufacter", 0.3456, "black");

fan.switchOnFan();

System.out.println(fan);

fan.switchOffFan();
System.out.println(fan);
fan.setSpeed((byte)5);
System.out.println(fan);
	}

}
