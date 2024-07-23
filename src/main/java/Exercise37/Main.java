package Exercise37;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class VehicleManagementSystem {
    private final List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicleById(String id) {
        vehicles.removeIf(vehicle -> vehicle.getId().equals(id));
    }

    public List<Vehicle> findVehiclesByManufacturer(String manufacturer) {
        return vehicles.stream()
                .filter(vehicle -> vehicle.getManufacturer().equalsIgnoreCase(manufacturer))
                .collect(Collectors.toList());
    }

    public List<Vehicle> findVehiclesByColor(String color) {
        return vehicles.stream()
                .filter(vehicle -> vehicle.getColor().equalsIgnoreCase(color))
                .collect(Collectors.toList());
    }

    public void exit() {
        System.out.println("Exiting program.");
    }

    public void displayAllVehicles() {
        vehicles.forEach(System.out::println);
    }
}

public class Main {
    public static void main(String[] args) {
        VehicleManagementSystem vms = new VehicleManagementSystem();

        Car car1 = new Car("1", "Toyota", 2020, 30000, "Red", 5, "V6");
        Motorbike motorbike1 = new Motorbike("2", "Honda", 2019, 15000, "Black", 120);
        Truck truck1 = new Truck("3", "Volvo", 2021, 50000, "White", 20000);

        vms.addVehicle(car1);
        vms.addVehicle(motorbike1);
        vms.addVehicle(truck1);

        System.out.println("All Vehicles:");
        vms.displayAllVehicles();

        System.out.println("\nFinding vehicles by manufacturer 'Honda':");
        vms.findVehiclesByManufacturer("Honda").forEach(System.out::println);

        System.out.println("\nFinding vehicles by color 'Red':");
        vms.findVehiclesByColor("Red").forEach(System.out::println);

        vms.removeVehicleById("2");

        System.out.println("\nAll Vehicles after removal:");
        vms.displayAllVehicles();

        vms.exit();
    }
}