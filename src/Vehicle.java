abstract class Vehicle {
    protected String type;
    protected int numberOfWheels;

    public void showVehicleDetails() {
        System.out.println("Type of vehicle is: " + type + ", the number of wheels is: " + numberOfWheels);
    }

    public abstract void doVehicleSound();
}