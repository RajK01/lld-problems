import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<ParkingFloor> floors;

    public ParkingLot(int numFloors, int spotsPerFloor) {
        floors = new ArrayList<>();
        for (int i = 1; i <= numFloors; i++) {
            floors.add(new ParkingFloor("Floor" + i, spotsPerFloor));
        }
    }

    public void parkVehicle(Vehicle vehicle) {
        for (ParkingFloor floor : floors) {
            floor.parkVehicle(vehicle);
            break; // Parked on the first available spot
        }
    }

    public void leaveSpot(String floorId, String spotId) {
        for (ParkingFloor floor : floors) {
            if (floorId.equals(floor)) {
                floor.leaveSpot(spotId);
            }
        }
    }
}