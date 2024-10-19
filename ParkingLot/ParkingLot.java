package ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<ParkingFloor> parkingFloors;
    private List<EntryPanel> entryPanels;
    private List<ExitPanel> exitPanels;

    public ParkingLot() {
        this.parkingFloors = new ArrayList<>();
        this.entryPanels = new ArrayList<>();
        this.exitPanels = new ArrayList<>();
    }

    public void addFloor(ParkingFloor floor) {
        parkingFloors.add(floor);
    }

    public void addEntryPanel(EntryPanel entryPanel) {
        entryPanels.add(entryPanel);
    }

    public void addExitPanel(ExitPanel exitPanel) {
        exitPanels.add(exitPanel);
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public List<EntryPanel> getEntryPanels() {
        return entryPanels;
    }

    public List<ExitPanel> getExitPanels() {
        return exitPanels;
    }
}
