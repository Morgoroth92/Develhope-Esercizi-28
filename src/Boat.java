class Boat extends Vehicle {
    private double maxSpeed;
    private int boatWeight;

    public Boat(double maxSpeed, int weight) {
        this.type = "Boat";
        this.maxSpeed = maxSpeed;
        this.boatWeight = weight;
    }

    @Override
    public void doVehicleSound() {
        System.out.println("Horn Sound");
    }

    public String getBoatWeightAndSpeed() {
        return "Boat weight is: " + boatWeight + " kilos, The max speed is: " + maxSpeed;
    }
}