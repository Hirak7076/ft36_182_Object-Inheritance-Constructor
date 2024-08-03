package ObjectInheritanceConstructor;

public class InheritanceCar extends InheritanceVehicle {
    
    private String model;

    public InheritanceCar(String make, int year, String model) {
        super(make, year); 
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Model: " + model);
    }

    public static void main(String[] args) {
    	
        InheritanceVehicle car = new InheritanceCar("Toyota", 2021, "Camry");
        car.displayInfo();
        
    }
}
