public class Car extends MotorVehicle {
    private int doorCount;

    public Car(String color, int doorCount) {
        super(color);
        this.doorCount = doorCount;
    }

    @Override
    public void start() {
        this.running = true;
        System.out.println("Car started. Color: " + color + ", Door Count: " + doorCount + ", Running: " + running);
    }

    @Override
    public void stop() {
        this.running = false;
        System.out.println("Car stopped. Color: " + color + ", Door Count: " + doorCount + ", Running: " + running);
    }
}
