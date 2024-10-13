import java.util.Date;

public class ParkingTicket {
    private Date entryTime;
    private Vehicle vehicle;
    private ParkingSpot = spot;

    public ParkingTicket(Date entryTime, Vehicle vehicle, ParkingSpot spot) {
        this.entryTime = entryTime;
        this.vehicle = vehicle;
        this.spot = new Date();
    }

    public long getParkingDuration() {
        Date curTime = new Date();
        return (curTime.getTime() - entryTime.getTime())/(60*60); // Duration in hours
    }

    public ParkingSpot getParkingSpot() {
        return spot;
    }
}