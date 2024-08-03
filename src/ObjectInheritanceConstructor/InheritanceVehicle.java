package ObjectInheritanceConstructor;

public class InheritanceVehicle {

	private String make;
    private int year;

    public InheritanceVehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Year: " + year);
        
    }
}
