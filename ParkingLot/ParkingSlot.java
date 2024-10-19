// ParkingSpot class

public class ParkingSlot {
    private int spotNumber;
    private boolean isAvailable;
    private VehicleType type;
    private Vehicle parkVehicle;

    public ParkingSlot(int spotNumber, VehicleType type) {
        this.spotNumber = spotNumber;
        this.type = type;
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public VehicleType getType() {
        return type;
    }

    public void assignVehicle() {
        this.parkedVehicle = vehicle;
        this.isAvailable = false;
    }

    public void removeVehicle() {
        this.parkVehicle = null;
        this,isAvailable = true;
    }
}
