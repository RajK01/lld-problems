package Elevator;

public class Main {
    public static void main(String[] args) {
        ElevatorSystem system = new ElevatorSystem(2);  // Create a system with 2 elevators

        // Simulate external requests
        system.handleExternalRequest(3, Direction.UP);
        system.handleExternalRequest(5, Direction.DOWN);

        // Simulate internal requests (inside elevators)
        system.controllers.get(0).handleInternalRequest(7);
        system.controllers.get(1).handleInternalRequest(2);

        // Operate the elevators
        for (int i = 0; i < 10; i++) {
            system.operateAllElevators();
        }
    }
}

