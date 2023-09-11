

public class Test {
    public static void main(String[] args) {
        Car car = new Car(4, 5, 18000);
        Boat boat = new Boat(45, 3000);

        car.showVehicleDetails();
        car.doVehicleSound();

        boat.showVehicleDetails();
        boat.doVehicleSound();
        System.out.println(boat.getBoatWeightAndSpeed());
    }
}