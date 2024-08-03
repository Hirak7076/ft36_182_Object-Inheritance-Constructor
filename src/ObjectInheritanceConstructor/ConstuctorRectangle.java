package ObjectInheritanceConstructor;

public class ConstuctorRectangle {

	private double length;
	private double width;

	public ConstuctorRectangle() {
		this.length = 1.0; 
		this.width = 1.0;  
	}

	public ConstuctorRectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double calculateArea() {
		return length * width;
	}

	public void display() {
		System.out.println("Length: " + length);
		System.out.println("Width: " + width);
		System.out.println("Area: " + calculateArea());
	}

	public static void main(String[] args) {
     
		ConstuctorRectangle defaultRectangle = new ConstuctorRectangle();
		System.out.println("Default Rectangle:");
		defaultRectangle.display();

		ConstuctorRectangle parameterizedRectangle = new ConstuctorRectangle(5.0, 3.0);
		System.out.println("\nParameterized Rectangle:");
     	parameterizedRectangle.display();
     	
 	}
}
