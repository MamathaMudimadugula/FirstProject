package May3rdRefacorArraytoArrayList;

public class MotorBike {
//state
	private int speed;//member variable
	
	//constructors
	public MotorBike(int speed) {
		this.speed=speed;
	}
	//constructors
	
	  public MotorBike() 
	  {
		  this(5); 
		  }
	 
	public int getSpeed() {
		return speed;
	}
	 public void setSpeed(int speed) {
		if(speed>0) {
			this.speed=speed;
		}
	 }
	 public void increaseSpeed(int howMuchSpeed ) {
		 setSpeed(this.speed+howMuchSpeed);
		 
	 }
	 public void decreaseSpeed(int howMuchSpeed ) {
		 setSpeed(this.speed-howMuchSpeed);
		 
	 }
	 public void Start() {
		 System.out.println("Bike Started");
	 }
}