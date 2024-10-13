package Elevator;

import java.util.ArrayList;
import java.util.List;

public class ElevatorSystem {
    private List<ElevatorController> controllers;

    public ElevatorSystem(int numElevators) {
        controllers = new ArrayList<>();
        for (int i = 0; i < numElevators; i++) {
            controllers.add(new ElevatorController(new Elevator()));
        }
    }

    // External request handler (from floors)
    public void handleExternalRequest(int floor, Direction direction) {
        ElevatorController bestController = findBestElevator(floor, direction);
        bestController.handleExternalRequest(floor, direction);
    }

    // Find the best available elevator for external request
    private ElevatorController findBestElevator(int floor, Direction direction) {
        // Here we are using a simple approach by picking the first idle elevator.
        // This can be extended to choose based on the closest elevator.
        for (ElevatorController controller : controllers) {
            if (controller.elevator.isIdle()) {
                return controller;
            }
        }
        return controllers.get(0);  // Fallback to the first elevator
    }

    // Operate all elevators (simulate movement)
    public void operateAllElevators() {
        for (ElevatorController controller : controllers) {
            controller.operateElevator();
        }
    }
}

