package ParkingLot;

import java.time.LocalDateTime;

public class ParkingTicket {
    private String ticketID;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String parkingSlotID;
    private double amount;

    public ParkingTicket(String ticketID, String parkingSlotID) {
        this.ticketID = ticketID;
        this.parkingSlotID = parkingSlotID;
        this.startTime = LocalDateTime.now();
    }

    public void endTicket() {
        this.endTime = LocalDateTime.now();
    }

    public double calculateAmount(double hourlyRate) {
        long hours = java.time.Duration.between(startTime, endTime).toHours();
        amount = hours * hourlyRate;
        return amount;
    }

    public String getParkingSlotID() {
        return parkingSlotID;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public double getAmount() {
        return amount;
    }
}
