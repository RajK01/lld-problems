package ParkingLot;

public class ExitPanel {
    private String exitId;

    public ExitPanel(String exitId) {
        this.exitId = exitId;
    }

    // Method to calculate price based on parking duration and hourly rate
    public double calculatePrice(ParkingTicket ticket, double hourlyRate) {
        ticket.endTicket(); // Mark the ticket's end time
        long hours = calcDuration(ticket); // Calculate parking duration in hours
        return hours * hourlyRate; // Total amount to be paid
    }

    // Method to calculate duration between entry and exit time in hours
    public long calcDuration(ParkingTicket ticket) {
        LocalDateTime startTime = ticket.getStartTime();
        LocalDateTime endTime = ticket.getEndTime();
        return Duration.between(startTime, endTime).toHours(); // Calculate hours
    }

    // Method to return exit details (for demonstration purposes)
    public String getExitPanel() {
        return "Exit Panel: " + exitId;
    }
}
