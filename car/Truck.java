package car;

public class Truck extends Car {
    final int MAX_TRUCK_SPEED = 80;

    public Truck(int numberOfPassengers) {
        super(TRUCK, numberOfPassengers);
    }

    @Override
    public int getMaxSpeed() {
        return MAX_TRUCK_SPEED;
    }
}
