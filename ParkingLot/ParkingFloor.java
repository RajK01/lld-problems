public class ParkingFloor {
    private String floorId;
    private HashMap<String, ParkingSpot> spots;

    public ParkingFloor(String floorId, int numSpots) {
        this.floorId = floorId;
        spots = new HashMap<>();
        for (int i = 1; i <= numSpots; i++) {
            spots.put("Spot" + i, new ParkingSpot("Spot" + i, VehicleSize.CAR));  // Default all spots to cars
        }
    }

    public ParkingSpot getFreeSpot(Vehicle vehicle) {
        for (ParkingSpot spot : spots.values()) {
            if (spot.fit(vehicle)) {
                return spot;
            }
        }
        return null;  // No available spot
    }

    public void parkVehicle(Vehicle vehicle) {
        ParkingSpot spot = getFreeSpot(vehicle);
        if (spot != null) {
            spot.park(vehicle);
            System.out.println("Parked at " + spot);
        } else {
            System.out.println("No available spots for " + vehicle.getLicensePlate());
        }
    }

    public void leaveSpot(String spotId) {
        if (spots.containsKey(spotId)) {
            spots.get(spotId).leave();
            System.out.println("Vehicle left spot " + spotId);
        }
    }
}
