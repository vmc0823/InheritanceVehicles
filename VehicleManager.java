import java.util.Scanner;

public class VehicleManager {
    private Car[] cars;
    private Motorcycle[] motorcycles;

    public VehicleManager() {
        cars = new Car[3];
        motorcycles = new Motorcycle[3];
    }

    public void run() {
        cars[0] = new Car("Red", 4);
        cars[1] = new Car("Blue", 2);
        cars[2] = new Car("Green", 4);

        motorcycles[0] = new Motorcycle("Black", true);
        motorcycles[1] = new Motorcycle("White", false);
        motorcycles[2] = new Motorcycle("Yellow", true);

        Scanner scanner = new Scanner(System.in);

        //start Car
        System.out.println("Choose a car to start (1-3):");
        for (int i = 0; i < cars.length; i++) {
            System.out.println((i + 1) + ". Car " + (i + 1));
        }
        int carChoice = scanner.nextInt() - 1;
        cars[carChoice].start();

        //start Motorcycle
        System.out.println("Choose a motorcycle to start (1-3):");
        for (int i = 0; i < motorcycles.length; i++) {
            System.out.println((i + 1) + ". Motorcycle " + (i + 1));
        }
        int motorcycleChoice = scanner.nextInt() - 1;
        motorcycles[motorcycleChoice].start();

        //stop Car
        System.out.println("Choose a car to stop (1-3):");
        for (int i = 0; i < cars.length; i++) {
            System.out.println((i + 1) + ". Car " + (i + 1));
        }
        carChoice = scanner.nextInt() - 1;
        cars[carChoice].stop();

        //stop Motorcycle
        System.out.println("Choose a motorcycle to stop (1-3):");
        for (int i = 0; i < motorcycles.length; i++) {
            System.out.println((i + 1) + ". Motorcycle " + (i + 1));
        }
        motorcycleChoice = scanner.nextInt() - 1;
        motorcycles[motorcycleChoice].stop();

        //dsplaying all vehicles' status
        System.out.println("Vehicle Status:");
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Car " + (i + 1) + " running: " + cars[i].isRunning());
        }
        for (int i = 0; i < motorcycles.length; i++) {
            System.out.println("Motorcycle " + (i + 1) + " running: " + motorcycles[i].isRunning());
        }

        scanner.close();
    }
}