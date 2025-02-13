public class Motorcycle extends MotorVehicle {
    private boolean hasWindshield;

    public Motorcycle(String color, boolean hasWindshield) {
        super(color);
        this.hasWindshield = hasWindshield;
    }

    @Override
    public void start() {
        this.running = true;
        System.out.println("Motorcycle started. Color: " + color + ", Has Windshield: " + hasWindshield + ", Running: " + running);
    }

    @Override
    public void stop() {
        this.running = false;
        System.out.println("Motorcycle stopped. Color: " + color + ", Has Windshield: " + hasWindshield + ", Running: " + running);
    }
}