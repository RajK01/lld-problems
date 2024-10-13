package Elevator;

public class ElevetorController {
    private Elevator elevator;

    public ElevatorController(Elevator elevator) {
        this.elevator = elevator;
    }

    public void handleInternalRequest(int floor) {
        System.out.println("Received internal request for floor: " + floor);
        if (floor > elevator.getCurrentFloor()) {
            elevator.addRequest(new Request(floor, Direction.UP));
        } else if (floor < elevator.getCurrentFloor()) {
            elevator.addRequest(new Request(floor, Direction.DOWN));
        }
    }

    public void handleExternalRequest(int floor, Direction direction) {
        System.out.println("Received external request at floor " + floor + " going " + direction);
        elevator.addRequest(new Request(floor, direction));
    }

    public void operateElevator() {
        elevator.move();
    }
}
