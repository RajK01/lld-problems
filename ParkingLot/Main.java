public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(2, 5); // 2 floors, 5 spots each

        Vehicle car = new Car("CAR123");
        Vehicle bike = new Bike("BIKE456");

        parkingLot.parkVehicle(car);  // Park car
        parkingLot.parkVehicle(bike);  // Park bike

        parkingLot.leaveSpot("Floor1", "Spot1"); // Car leaves
    }
}