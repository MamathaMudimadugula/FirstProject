package May6thand7th;

public class Rectangle {

//state 
	private int width;
	private int length;
	private int area;
	private int perimeter;
	
	//creation of constructor
	public Rectangle(int width, int length) {
		// TODO Auto-generated constructor stub
		this.width=width;
		this.length=length;
		
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int area() {
		return width*length;
		
	}
	
	public int perimeter() {
		return 2*(width+length);
	}
	
	//operations
	public String toString() {
		return String.format("width-%d,length-%d,area-%d,perimiter-%d",width,length,area(),perimeter());
		
	}

	
	
}
