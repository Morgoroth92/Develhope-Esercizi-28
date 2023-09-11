class Car extends Vehicle {
    private int numberOfDoors;
    private double carPrice;

    public Car(int wheels, int doors, double price) {
        this.type = "Car";
        this.numberOfWheels = wheels;
        this.numberOfDoors = doors;
        this.carPrice = price;
    }

    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("The number of doors are:  " + numberOfDoors);
    }

    @Override
    public void doVehicleSound() {
        System.out.println("Brum brum");
    }
}