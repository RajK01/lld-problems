public class EntryPanel {
    private String entryID;

    public EntryPanel(String entryID) {
        this.entryID = entryID;
    }

    public ParkingTicket getTicket(String parkingSlotID) {
        return new ParkingTicket("TICKET-" + System.currentTimeMillis(), parkingSlotID);
    }
}