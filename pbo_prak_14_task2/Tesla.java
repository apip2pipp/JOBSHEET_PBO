package pbo_prak_14_task2;
class Tesla extends ElectricalCar {

    Tesla(String brand, int year, String model, int batteryCapacity) {
        super(brand, year, model, batteryCapacity);
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Autopilot: Available");
    }
}