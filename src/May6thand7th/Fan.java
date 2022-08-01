package May6thand7th;



public class Fan {
//state
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed;
	//creation 
public Fan(String make,double radius,String color) {
	this.make= make;
	this.radius=radius;
	this.color=color;
}
	public String toString() {
		return String.format("make - %s,radius - %f,color - %s,isOn -%b,speed -%d",make,radius,color,isOn,speed);
		}
	public void switchOnFan() {
		this.isOn=true;
		
	}
	public void switchOffFan() {
		this.isOn=false;
		
	}
	public void setSpeed(byte speed) {
		this.speed=speed;
	}
}

