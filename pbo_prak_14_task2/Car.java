package pbo_prak_14_task2;

public class  Car extends Vehicle {
    String model;

    Car(String brand, int year, String model) {
        super(brand, year);
        this.model = model;
    }

    
    void displayDetails() {
        super.displayDetails();
        System.out.println("Model: " + model);
    }
}
