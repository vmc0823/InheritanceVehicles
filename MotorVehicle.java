public abstract class MotorVehicle {
    protected boolean running;
    protected String color;

    public MotorVehicle(String color) {
        this.color = color;
        this.running = false;
    }

    public boolean isRunning() {
        return running;
    }

    public String getColor() {
        return color;
    }

    public abstract void start();

    public abstract void stop();
}